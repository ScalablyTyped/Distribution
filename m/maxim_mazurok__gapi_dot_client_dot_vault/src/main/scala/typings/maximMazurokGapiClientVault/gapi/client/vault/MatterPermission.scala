package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatterPermission extends StObject {
  
  /** The account ID, as provided by Admin SDK. */
  var accountId: js.UndefOr[String] = js.undefined
  
  /** The user's role in this matter. */
  var role: js.UndefOr[String] = js.undefined
}
object MatterPermission {
  
  inline def apply(): MatterPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MatterPermission]
  }
  
  extension [Self <: MatterPermission](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
