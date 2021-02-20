package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invoice extends StObject {
  
  var currency: String = js.native
  
  var description: String = js.native
  
  var start_parameter: String = js.native
  
  var title: String = js.native
  
  var total_amount: Double = js.native
}
object Invoice {
  
  @scala.inline
  def apply(
    currency: String,
    description: String,
    start_parameter: String,
    title: String,
    total_amount: Double
  ): Invoice = {
    val __obj = js.Dynamic.literal(currency = currency.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], start_parameter = start_parameter.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], total_amount = total_amount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invoice]
  }
  
  @scala.inline
  implicit class InvoiceMutableBuilder[Self <: Invoice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_parameter(value: String): Self = StObject.set(x, "start_parameter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotal_amount(value: Double): Self = StObject.set(x, "total_amount", value.asInstanceOf[js.Any])
  }
}
