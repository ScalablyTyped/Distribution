package typings.nivoGenerators.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Country extends StObject {
  
  var country: String
  
  var population: Double
}
object Country {
  
  inline def apply(country: String, population: Double): Country = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], population = population.asInstanceOf[js.Any])
    __obj.asInstanceOf[Country]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Country] (val x: Self) extends AnyVal {
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setPopulation(value: Double): Self = StObject.set(x, "population", value.asInstanceOf[js.Any])
  }
}
