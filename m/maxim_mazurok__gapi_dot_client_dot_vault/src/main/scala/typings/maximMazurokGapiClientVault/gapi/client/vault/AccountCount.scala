package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCount extends StObject {
  
  /** Account owner. */
  var account: js.UndefOr[UserInfo] = js.undefined
  
  /** The number of artifacts found for this account. */
  var count: js.UndefOr[String] = js.undefined
}
object AccountCount {
  
  @scala.inline
  def apply(): AccountCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCount]
  }
  
  @scala.inline
  implicit class AccountCountMutableBuilder[Self <: AccountCount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccount(value: UserInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
