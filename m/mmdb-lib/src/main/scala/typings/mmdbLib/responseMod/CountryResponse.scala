package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryResponse
  extends StObject
     with Response {
  
  val continent: js.UndefOr[ContinentRecord] = js.undefined
  
  val country: js.UndefOr[CountryRecord] = js.undefined
  
  val registered_country: js.UndefOr[RegisteredCountryRecord] = js.undefined
  
  val represented_country: js.UndefOr[RepresentedCountryRecord] = js.undefined
  
  val traits: js.UndefOr[TraitsRecord] = js.undefined
}
object CountryResponse {
  
  inline def apply(): CountryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryResponse]
  }
  
  extension [Self <: CountryResponse](x: Self) {
    
    inline def setContinent(value: ContinentRecord): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    inline def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    inline def setCountry(value: CountryRecord): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setRegistered_country(value: RegisteredCountryRecord): Self = StObject.set(x, "registered_country", value.asInstanceOf[js.Any])
    
    inline def setRegistered_countryUndefined: Self = StObject.set(x, "registered_country", js.undefined)
    
    inline def setRepresented_country(value: RepresentedCountryRecord): Self = StObject.set(x, "represented_country", value.asInstanceOf[js.Any])
    
    inline def setRepresented_countryUndefined: Self = StObject.set(x, "represented_country", js.undefined)
    
    inline def setTraits(value: TraitsRecord): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
  }
}
