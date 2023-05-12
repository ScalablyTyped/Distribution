package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Iscustomammount extends StObject {
  
  var created_at: String
  
  var description: String
  
  var is_custom_ammount: js.UndefOr[Boolean] = js.undefined
  
  var is_custom_amount: js.UndefOr[Boolean] = js.undefined
  
  var is_one_time: Boolean
  
  var monthly_price_in_cents: Double
  
  var monthly_price_in_dollars: Double
  
  var name: String
  
  var node_id: String
}
object Iscustomammount {
  
  inline def apply(
    created_at: String,
    description: String,
    is_one_time: Boolean,
    monthly_price_in_cents: Double,
    monthly_price_in_dollars: Double,
    name: String,
    node_id: String
  ): Iscustomammount = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], is_one_time = is_one_time.asInstanceOf[js.Any], monthly_price_in_cents = monthly_price_in_cents.asInstanceOf[js.Any], monthly_price_in_dollars = monthly_price_in_dollars.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Iscustomammount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Iscustomammount] (val x: Self) extends AnyVal {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setIs_custom_ammount(value: Boolean): Self = StObject.set(x, "is_custom_ammount", value.asInstanceOf[js.Any])
    
    inline def setIs_custom_ammountUndefined: Self = StObject.set(x, "is_custom_ammount", js.undefined)
    
    inline def setIs_custom_amount(value: Boolean): Self = StObject.set(x, "is_custom_amount", value.asInstanceOf[js.Any])
    
    inline def setIs_custom_amountUndefined: Self = StObject.set(x, "is_custom_amount", js.undefined)
    
    inline def setIs_one_time(value: Boolean): Self = StObject.set(x, "is_one_time", value.asInstanceOf[js.Any])
    
    inline def setMonthly_price_in_cents(value: Double): Self = StObject.set(x, "monthly_price_in_cents", value.asInstanceOf[js.Any])
    
    inline def setMonthly_price_in_dollars(value: Double): Self = StObject.set(x, "monthly_price_in_dollars", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
  }
}
