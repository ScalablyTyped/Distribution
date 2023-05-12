package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountidNumber extends StObject {
  
  var account_id: Double
}
object AccountidNumber {
  
  inline def apply(account_id: Double): AccountidNumber = {
    val __obj = js.Dynamic.literal(account_id = account_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountidNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountidNumber] (val x: Self) extends AnyVal {
    
    inline def setAccount_id(value: Double): Self = StObject.set(x, "account_id", value.asInstanceOf[js.Any])
  }
}
