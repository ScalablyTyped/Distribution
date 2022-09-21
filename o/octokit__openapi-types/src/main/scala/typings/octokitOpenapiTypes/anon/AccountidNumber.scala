package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountidNumber extends StObject {
  
  /** account_id parameter */
  var account_id: Double
}
object AccountidNumber {
  
  inline def apply(account_id: Double): AccountidNumber = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountidNumber]
  }
  
  extension [Self <: AccountidNumber](x: Self) {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
  }
}
