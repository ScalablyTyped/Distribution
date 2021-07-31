package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddHeldAccountResult extends StObject {
  
  /** If present, this account was successfully created. */
  var account: js.UndefOr[HeldAccount] = js.undefined
  
  /** This represents the success status. If failed, check message. */
  var status: js.UndefOr[Status] = js.undefined
}
object AddHeldAccountResult {
  
  @scala.inline
  def apply(): AddHeldAccountResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddHeldAccountResult]
  }
  
  @scala.inline
  implicit class AddHeldAccountResultMutableBuilder[Self <: AddHeldAccountResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: HeldAccount): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
