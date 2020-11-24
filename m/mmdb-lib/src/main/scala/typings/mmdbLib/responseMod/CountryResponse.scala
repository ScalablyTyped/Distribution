package typings.mmdbLib.responseMod

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
  implicit class CountryResponseOps[Self <: CountryResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContinent(value: ContinentRecord): Self = this.set("continent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinent: Self = this.set("continent", js.undefined)
    
    @scala.inline
    def setCountry(value: CountryRecord): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setRegistered_country(value: RegisteredCountryRecord): Self = this.set("registered_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegistered_country: Self = this.set("registered_country", js.undefined)
    
    @scala.inline
    def setRepresented_country(value: RepresentedCountryRecord): Self = this.set("represented_country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepresented_country: Self = this.set("represented_country", js.undefined)
    
    @scala.inline
    def setTraits(value: TraitsRecord): Self = this.set("traits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraits: Self = this.set("traits", js.undefined)
  }
}
