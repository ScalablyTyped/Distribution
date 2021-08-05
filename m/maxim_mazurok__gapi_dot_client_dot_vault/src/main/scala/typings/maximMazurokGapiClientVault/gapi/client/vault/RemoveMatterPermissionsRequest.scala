package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveMatterPermissionsRequest extends StObject {
  
  /** The account ID. */
  var accountId: js.UndefOr[String] = js.undefined
}
object RemoveMatterPermissionsRequest {
  
  inline def apply(): RemoveMatterPermissionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoveMatterPermissionsRequest]
  }
  
  extension [Self <: RemoveMatterPermissionsRequest](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
  }
}
