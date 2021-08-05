package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accountsurl extends StObject {
  
  var accounts_url: String
  
  var bullets: js.Array[String]
  
  var description: String
  
  var has_free_trial: Boolean
  
  var id: Double
  
  var monthly_price_in_cents: Double
  
  var name: String
  
  var number: Double
  
  var price_model: String
  
  var state: String
  
  var unit_name: String
  
  var url: String
  
  var yearly_price_in_cents: Double
}
object Accountsurl {
  
  inline def apply(
    accounts_url: String,
    bullets: js.Array[String],
    description: String,
    has_free_trial: Boolean,
    id: Double,
    monthly_price_in_cents: Double,
    name: String,
    number: Double,
    price_model: String,
    state: String,
    unit_name: String,
    url: String,
    yearly_price_in_cents: Double
  ): Accountsurl = {
    val __obj = js.Dynamic.literal(accounts_url = accounts_url.asInstanceOf[js.Any], bullets = bullets.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], has_free_trial = has_free_trial.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], monthly_price_in_cents = monthly_price_in_cents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], price_model = price_model.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], unit_name = unit_name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], yearly_price_in_cents = yearly_price_in_cents.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accountsurl]
  }
  
  extension [Self <: Accountsurl](x: Self) {
    
    inline def setAccounts_url(value: String): Self = StObject.set(x, "accounts_url", value.asInstanceOf[js.Any])
    
    inline def setBullets(value: js.Array[String]): Self = StObject.set(x, "bullets", value.asInstanceOf[js.Any])
    
    inline def setBulletsVarargs(value: String*): Self = StObject.set(x, "bullets", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHas_free_trial(value: Boolean): Self = StObject.set(x, "has_free_trial", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMonthly_price_in_cents(value: Double): Self = StObject.set(x, "monthly_price_in_cents", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPrice_model(value: String): Self = StObject.set(x, "price_model", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setUnit_name(value: String): Self = StObject.set(x, "unit_name", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setYearly_price_in_cents(value: Double): Self = StObject.set(x, "yearly_price_in_cents", value.asInstanceOf[js.Any])
  }
}
