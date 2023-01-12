package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterPermission extends StObject {
  
  /** The account ID, as provided by the [Admin SDK](https://developers.google.com/admin-sdk/). */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The user's role for the matter. */
  var role: js.UndefOr[String] = js.undefined
}
object MatterPermission {
  
  inline def apply(): MatterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterPermission]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MatterPermission] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
