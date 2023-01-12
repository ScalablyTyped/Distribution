package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryNamedLocation
  extends StObject
     with NamedLocation {
  
  // List of countries and/or regions in two-letter format specified by ISO 3166-2. Required.
  var countriesAndRegions: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Determines what method is used to decide which country the user is located in. Possible values are
    * clientIpAddress(default) and authenticatorAppGps. Note: authenticatorAppGps is not yet supported in the Microsoft Cloud
    * for US Government.
    */
  var countryLookupMethod: js.UndefOr[NullableOption[CountryLookupMethodType]] = js.undefined
  
  /**
    * true if IP addresses that don't map to a country or region should be included in the named location. Optional. Default
    * value is false.
    */
  var includeUnknownCountriesAndRegions: js.UndefOr[Boolean] = js.undefined
}
object CountryNamedLocation {
  
  inline def apply(): CountryNamedLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountryNamedLocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CountryNamedLocation] (val x: Self) extends AnyVal {
    
    inline def setCountriesAndRegions(value: js.Array[String]): Self = StObject.set(x, "countriesAndRegions", value.asInstanceOf[js.Any])
    
    inline def setCountriesAndRegionsUndefined: Self = StObject.set(x, "countriesAndRegions", js.undefined)
    
    inline def setCountriesAndRegionsVarargs(value: String*): Self = StObject.set(x, "countriesAndRegions", js.Array(value*))
    
    inline def setCountryLookupMethod(value: NullableOption[CountryLookupMethodType]): Self = StObject.set(x, "countryLookupMethod", value.asInstanceOf[js.Any])
    
    inline def setCountryLookupMethodNull: Self = StObject.set(x, "countryLookupMethod", null)
    
    inline def setCountryLookupMethodUndefined: Self = StObject.set(x, "countryLookupMethod", js.undefined)
    
    inline def setIncludeUnknownCountriesAndRegions(value: Boolean): Self = StObject.set(x, "includeUnknownCountriesAndRegions", value.asInstanceOf[js.Any])
    
    inline def setIncludeUnknownCountriesAndRegionsUndefined: Self = StObject.set(x, "includeUnknownCountriesAndRegions", js.undefined)
  }
}
