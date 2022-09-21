package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddHeldAccountResult extends StObject {
  
  /** Returned when the account was successfully created. */
  var account: js.UndefOr[HeldAccount] = js.undefined
  
  /** Reports the request status. If it failed, returns an error message. */
  var status: js.UndefOr[Status] = js.undefined
}
object AddHeldAccountResult {
  
  inline def apply(): AddHeldAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddHeldAccountResult]
  }
  
  extension [Self <: AddHeldAccountResult](x: Self) {
    
    inline def setAccount(value: HeldAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
