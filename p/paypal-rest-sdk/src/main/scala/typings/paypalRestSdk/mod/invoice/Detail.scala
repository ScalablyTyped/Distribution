package typings.paypalRestSdk.mod.invoice

import typings.paypalRestSdk.mod.Currency
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Detail extends StObject {
  
  var amount: Currency = js.native
  
  var date: String = js.native
  
  var note: js.UndefOr[String] = js.native
  
  var transaction_id: String = js.native
  
  var `type`: String = js.native
}
object Detail {
  
  @scala.inline
  def apply(amount: Currency, date: String, transaction_id: String, `type`: String): Detail = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], transaction_id = transaction_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Detail]
  }
  
  @scala.inline
  implicit class DetailMutableBuilder[Self <: Detail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAmount(value: Currency): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "note", js.undefined)
    
    @scala.inline
    def setTransaction_id(value: String): Self = StObject.set(x, "transaction_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
