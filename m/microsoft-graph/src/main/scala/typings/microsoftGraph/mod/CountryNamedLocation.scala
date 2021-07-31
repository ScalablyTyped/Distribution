package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryNamedLocation
  extends StObject
     with NamedLocation {
  
  // List of countries and/or regions in two-letter format specified by ISO 3166-2.
  var countriesAndRegions: js.UndefOr[js.Array[String]] = js.undefined
  
  // True if IP addresses that don't map to a country or region should be included in the named location.
  var includeUnknownCountriesAndRegions: js.UndefOr[Boolean] = js.undefined
}
object CountryNamedLocation {
  
  @scala.inline
  def apply(): CountryNamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryNamedLocation]
  }
  
  @scala.inline
  implicit class CountryNamedLocationMutableBuilder[Self <: CountryNamedLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountriesAndRegions(value: js.Array[String]): Self = StObject.set(x, "countriesAndRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountriesAndRegionsUndefined: Self = StObject.set(x, "countriesAndRegions", js.undefined)
    
    @scala.inline
    def setCountriesAndRegionsVarargs(value: String*): Self = StObject.set(x, "countriesAndRegions", js.Array(value :_*))
    
    @scala.inline
    def setIncludeUnknownCountriesAndRegions(value: Boolean): Self = StObject.set(x, "includeUnknownCountriesAndRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUnknownCountriesAndRegionsUndefined: Self = StObject.set(x, "includeUnknownCountriesAndRegions", js.undefined)
  }
}
