package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAccess extends StObject {
  
  /** Whether the user has no access, user access, or admin access to an account. @mutable tagmanager.accounts.permissions.create @mutable tagmanager.accounts.permissions.update */
  var permission: js.UndefOr[String] = js.undefined
}
object AccountAccess {
  
  inline def apply(): AccountAccess = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAccess]
  }
  
  extension [Self <: AccountAccess](x: Self) {
    
    inline def setPermission(value: String): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
  }
}
