package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCount extends StObject {
  
  /** Account owner. */
  var account: js.UndefOr[UserInfo] = js.undefined
  
  /** The number of results (messages or files) found for this account. */
  var count: js.UndefOr[String] = js.undefined
}
object AccountCount {
  
  inline def apply(): AccountCount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountCount] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: UserInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
  }
}
