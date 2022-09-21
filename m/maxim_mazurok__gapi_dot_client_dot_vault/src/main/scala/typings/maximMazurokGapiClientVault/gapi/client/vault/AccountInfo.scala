package typings.maximMazurokGapiClientVault.gapi.client.vault

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountInfo extends StObject {
  
  /** A set of accounts to search. */
  var emails: js.UndefOr[js.Array[String]] = js.undefined
}
object AccountInfo {
  
  inline def apply(): AccountInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountInfo]
  }
  
  extension [Self <: AccountInfo](x: Self) {
    
    inline def setEmails(value: js.Array[String]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    inline def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    inline def setEmailsVarargs(value: String*): Self = StObject.set(x, "emails", js.Array(value*))
  }
}
