package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountCountError extends StObject {
  
  /** Account owner. */
  var account: js.UndefOr[UserInfo] = js.undefined
  
  /** Account query error. */
  var errorType: js.UndefOr[String] = js.undefined
}
object AccountCountError {
  
  inline def apply(): AccountCountError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountCountError]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountCountError] (val x: Self) extends AnyVal {
    
    inline def setAccount(value: UserInfo): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setAccountUndefined: Self = StObject.set(x, "account", js.undefined)
    
    inline def setErrorType(value: String): Self = StObject.set(x, "errorType", value.asInstanceOf[js.Any])
    
    inline def setErrorTypeUndefined: Self = StObject.set(x, "errorType", js.undefined)
  }
}
