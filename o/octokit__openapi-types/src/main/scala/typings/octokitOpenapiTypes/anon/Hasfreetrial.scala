package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FLAT_RATE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.FREE
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.PER_UNIT
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Hasfreetrial extends StObject {
  
  var bullets: js.UndefOr[js.Array[String | Null]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var has_free_trial: js.UndefOr[Boolean] = js.undefined
  
  var id: js.UndefOr[Double] = js.undefined
  
  var monthly_price_in_cents: js.UndefOr[Double] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  /** @enum {string} */
  var price_model: js.UndefOr[FREE | FLAT_RATE | PER_UNIT] = js.undefined
  
  var unit_name: js.UndefOr[String | Null] = js.undefined
  
  var yearly_price_in_cents: js.UndefOr[Double] = js.undefined
}
object Hasfreetrial {
  
  inline def apply(): Hasfreetrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Hasfreetrial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Hasfreetrial] (val x: Self) extends AnyVal {
    
    inline def setBullets(value: js.Array[String | Null]): Self = StObject.set(x, "bullets", value.asInstanceOf[js.Any])
    
    inline def setBulletsUndefined: Self = StObject.set(x, "bullets", js.undefined)
    
    inline def setBulletsVarargs(value: (String | Null)*): Self = StObject.set(x, "bullets", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setHas_free_trial(value: Boolean): Self = StObject.set(x, "has_free_trial", value.asInstanceOf[js.Any])
    
    inline def setHas_free_trialUndefined: Self = StObject.set(x, "has_free_trial", js.undefined)
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setMonthly_price_in_cents(value: Double): Self = StObject.set(x, "monthly_price_in_cents", value.asInstanceOf[js.Any])
    
    inline def setMonthly_price_in_centsUndefined: Self = StObject.set(x, "monthly_price_in_cents", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrice_model(value: FREE | FLAT_RATE | PER_UNIT): Self = StObject.set(x, "price_model", value.asInstanceOf[js.Any])
    
    inline def setPrice_modelUndefined: Self = StObject.set(x, "price_model", js.undefined)
    
    inline def setUnit_name(value: String): Self = StObject.set(x, "unit_name", value.asInstanceOf[js.Any])
    
    inline def setUnit_nameNull: Self = StObject.set(x, "unit_name", null)
    
    inline def setUnit_nameUndefined: Self = StObject.set(x, "unit_name", js.undefined)
    
    inline def setYearly_price_in_cents(value: Double): Self = StObject.set(x, "yearly_price_in_cents", value.asInstanceOf[js.Any])
    
    inline def setYearly_price_in_centsUndefined: Self = StObject.set(x, "yearly_price_in_cents", js.undefined)
  }
}
