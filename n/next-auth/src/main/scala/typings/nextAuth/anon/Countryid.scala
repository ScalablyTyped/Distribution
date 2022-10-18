package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Countryid extends StObject {
  
  var country_id: Double
  
  var from: js.UndefOr[Double] = js.undefined
  
  var unit: String
  
  var unit_id: Double
  
  var until: js.UndefOr[Double] = js.undefined
}
object Countryid {
  
  inline def apply(country_id: Double, unit: String, unit_id: Double): Countryid = {
    val __obj = js.Dynamic.literal(country_id = country_id.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unit_id = unit_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Countryid]
  }
  
  extension [Self <: Countryid](x: Self) {
    
    inline def setCountry_id(value: Double): Self = StObject.set(x, "country_id", value.asInstanceOf[js.Any])
    
    inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnit_id(value: Double): Self = StObject.set(x, "unit_id", value.asInstanceOf[js.Any])
    
    inline def setUntil(value: Double): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
    
    inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
  }
}
