package typings.metamaskUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Account extends StObject {
  
  var account: Registrations
  
  var moreComplexity: DifferentEncodings
}
object Account {
  
  inline def apply(account: Registrations, moreComplexity: DifferentEncodings): Account = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], moreComplexity = moreComplexity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Account]
  }
  
  extension [Self <: Account](x: Self) {
    
    inline def setAccount(value: Registrations): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
    
    inline def setMoreComplexity(value: DifferentEncodings): Self = StObject.set(x, "moreComplexity", value.asInstanceOf[js.Any])
  }
}
