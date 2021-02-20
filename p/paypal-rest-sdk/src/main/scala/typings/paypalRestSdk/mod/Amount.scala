package typings.paypalRestSdk.mod

import typings.paypalRestSdk.anon.Giftwrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Amount extends StObject {
  
  var currency: String = js.native
  
  var details: js.UndefOr[Giftwrap] = js.native
  
  var total: String = js.native
}
object Amount {
  
  @scala.inline
  def apply(currency: String, total: String): Amount = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  
  @scala.inline
  implicit class AmountMutableBuilder[Self <: Amount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetails(value: Giftwrap): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    @scala.inline
    def setTotal(value: String): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
  }
}
