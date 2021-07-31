package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlServerUserDetails extends StObject {
  
  /** If the user has been disabled */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /** The server roles for this user */
  var serverRoles: js.UndefOr[js.Array[String]] = js.undefined
}
object SqlServerUserDetails {
  
  @scala.inline
  def apply(): SqlServerUserDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlServerUserDetails]
  }
  
  @scala.inline
  implicit class SqlServerUserDetailsMutableBuilder[Self <: SqlServerUserDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setServerRoles(value: js.Array[String]): Self = StObject.set(x, "serverRoles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerRolesUndefined: Self = StObject.set(x, "serverRoles", js.undefined)
    
    @scala.inline
    def setServerRolesVarargs(value: String*): Self = StObject.set(x, "serverRoles", js.Array(value :_*))
  }
}
