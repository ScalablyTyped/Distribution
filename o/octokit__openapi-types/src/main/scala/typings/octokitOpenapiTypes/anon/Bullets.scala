package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FLAT_RATE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FREE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PER_UNIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bullets extends StObject {
  
  var bullets: js.Array[String]
  
  var description: String
  
  var has_free_trial: Boolean
  
  var id: Double
  
  var monthly_price_in_cents: Double
  
  var name: String
  
  /** @enum {string} */
  var price_model: FREE | FLAT_RATE | PER_UNIT
  
  var unit_name: String | Null
  
  var yearly_price_in_cents: Double
}
object Bullets {
  
  inline def apply(
    bullets: js.Array[String],
    description: String,
    has_free_trial: Boolean,
    id: Double,
    monthly_price_in_cents: Double,
    name: String,
    price_model: FREE | FLAT_RATE | PER_UNIT,
    yearly_price_in_cents: Double
  ): Bullets = {
    val __obj = js.Dynamic.literal(bullets = bullets.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_free_trial = has_free_trial.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monthly_price_in_cents = monthly_price_in_cents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], price_model = price_model.asInstanceOf[js.Any], yearly_price_in_cents = yearly_price_in_cents.asInstanceOf[js.Any], unit_name = null)
    __obj.asInstanceOf[Bullets]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bullets] (val x: Self) extends AnyVal {
    
    inline def setBullets(value: js.Array[String]): Self = StObject.set(x, "bullets", value.asInstanceOf[js.Any])
    
    inline def setBulletsVarargs(value: String*): Self = StObject.set(x, "bullets", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHas_free_trial(value: Boolean): Self = StObject.set(x, "has_free_trial", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMonthly_price_in_cents(value: Double): Self = StObject.set(x, "monthly_price_in_cents", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrice_model(value: FREE | FLAT_RATE | PER_UNIT): Self = StObject.set(x, "price_model", value.asInstanceOf[js.Any])
    
    inline def setUnit_name(value: String): Self = StObject.set(x, "unit_name", value.asInstanceOf[js.Any])
    
    inline def setUnit_nameNull: Self = StObject.set(x, "unit_name", null)
    
    inline def setYearly_price_in_cents(value: Double): Self = StObject.set(x, "yearly_price_in_cents", value.asInstanceOf[js.Any])
  }
}
