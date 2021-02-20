package typings.mmdbLib.responseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryResponse extends Response {
  
  val continent: js.UndefOr[ContinentRecord] = js.native
  
  val country: js.UndefOr[CountryRecord] = js.native
  
  val registered_country: js.UndefOr[RegisteredCountryRecord] = js.native
  
  val represented_country: js.UndefOr[RepresentedCountryRecord] = js.native
  
  val traits: js.UndefOr[TraitsRecord] = js.native
}
object CountryResponse {
  
  @scala.inline
  def apply(): CountryResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryResponse]
  }
  
  @scala.inline
  implicit class CountryResponseMutableBuilder[Self <: CountryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinent(value: ContinentRecord): Self = StObject.set(x, "continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinentUndefined: Self = StObject.set(x, "continent", js.undefined)
    
    @scala.inline
    def setCountry(value: CountryRecord): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setRegistered_country(value: RegisteredCountryRecord): Self = StObject.set(x, "registered_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistered_countryUndefined: Self = StObject.set(x, "registered_country", js.undefined)
    
    @scala.inline
    def setRepresented_country(value: RepresentedCountryRecord): Self = StObject.set(x, "represented_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepresented_countryUndefined: Self = StObject.set(x, "represented_country", js.undefined)
    
    @scala.inline
    def setTraits(value: TraitsRecord): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
  }
}
