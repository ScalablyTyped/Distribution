package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordStatus extends StObject {
  
  /** If true, user does not have login privileges. */
  var locked: js.UndefOr[Boolean] = js.undefined
  
  /** The expiration time of the current password. */
  var passwordExpirationTime: js.UndefOr[String] = js.undefined
}
object PasswordStatus {
  
  inline def apply(): PasswordStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PasswordStatus] (val x: Self) extends AnyVal {
    
    inline def setLocked(value: Boolean): Self = StObject.set(x, "locked", value.asInstanceOf[js.Any])
    
    inline def setLockedUndefined: Self = StObject.set(x, "locked", js.undefined)
    
    inline def setPasswordExpirationTime(value: String): Self = StObject.set(x, "passwordExpirationTime", value.asInstanceOf[js.Any])
    
    inline def setPasswordExpirationTimeUndefined: Self = StObject.set(x, "passwordExpirationTime", js.undefined)
  }
}
