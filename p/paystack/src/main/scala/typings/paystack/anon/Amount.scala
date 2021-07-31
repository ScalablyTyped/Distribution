package typings.paystack.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Amount
  extends StObject
     with /* others */ StringDictionary[js.Any] {
  
  var amount: Double
  
  var interval: String
  
  var name: String
}
object Amount {
  
  @scala.inline
  def apply(amount: Double, interval: String, name: String): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  
  @scala.inline
  implicit class AmountMutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: String): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
