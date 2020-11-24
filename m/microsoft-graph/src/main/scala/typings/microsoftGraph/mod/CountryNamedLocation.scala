package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountryNamedLocation extends NamedLocation {
  
  // List of countries and/or regions in two-letter format specified by ISO 3166-2.
  var countriesAndRegions: js.UndefOr[js.Array[String]] = js.native
  
  // True if IP addresses that don't map to a country or region should be included in the named location.
  var includeUnknownCountriesAndRegions: js.UndefOr[Boolean] = js.native
}
object CountryNamedLocation {
  
  @scala.inline
  def apply(): CountryNamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryNamedLocation]
  }
  
  @scala.inline
  implicit class CountryNamedLocationOps[Self <: CountryNamedLocation] (val x: Self) extends AnyVal {
    
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
    def setCountriesAndRegionsVarargs(value: String*): Self = this.set("countriesAndRegions", js.Array(value :_*))
    
    @scala.inline
    def setCountriesAndRegions(value: js.Array[String]): Self = this.set("countriesAndRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountriesAndRegions: Self = this.set("countriesAndRegions", js.undefined)
    
    @scala.inline
    def setIncludeUnknownCountriesAndRegions(value: Boolean): Self = this.set("includeUnknownCountriesAndRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeUnknownCountriesAndRegions: Self = this.set("includeUnknownCountriesAndRegions", js.undefined)
  }
}
