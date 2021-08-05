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
  
  inline def apply(): CountryNamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryNamedLocation]
  }
  
  extension [Self <: CountryNamedLocation](x: Self) {
    
    inline def setCountriesAndRegions(value: js.Array[String]): Self = StObject.set(x, "countriesAndRegions", value.asInstanceOf[js.Any])
    
    inline def setCountriesAndRegionsUndefined: Self = StObject.set(x, "countriesAndRegions", js.undefined)
    
    inline def setCountriesAndRegionsVarargs(value: String*): Self = StObject.set(x, "countriesAndRegions", js.Array(value :_*))
    
    inline def setIncludeUnknownCountriesAndRegions(value: Boolean): Self = StObject.set(x, "includeUnknownCountriesAndRegions", value.asInstanceOf[js.Any])
    
    inline def setIncludeUnknownCountriesAndRegionsUndefined: Self = StObject.set(x, "includeUnknownCountriesAndRegions", js.undefined)
  }
}
