package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Location extends StObject {
  
  /** An object representing a latitude/longitude pair. */
  var latLng: js.UndefOr[LatLng] = js.undefined
  
  /**
    * The type of a location, which corresponds to the address lines field of PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of LocationType#NEIGHBORHOOD, and "Kansas
    * City, KS, USA" has a type of LocationType#LOCALITY.
    */
  var locationType: js.UndefOr[String] = js.undefined
  
  /**
    * Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items
    * to a premises, P.O. Box, or other delivery location.
    */
  var postalAddress: js.UndefOr[PostalAddress] = js.undefined
  
  /**
    * Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from LatLng covers the area associated
    * with the job location. For example, currently, "Mountain View, CA, USA" has a radius of 6.17 miles.
    */
  var radiusInMiles: js.UndefOr[Double] = js.undefined
}
object Location {
  
  inline def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  extension [Self <: Location](x: Self) {
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    inline def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    inline def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    inline def setPostalAddress(value: PostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    inline def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
    
    inline def setRadiusInMiles(value: Double): Self = StObject.set(x, "radiusInMiles", value.asInstanceOf[js.Any])
    
    inline def setRadiusInMilesUndefined: Self = StObject.set(x, "radiusInMiles", js.undefined)
  }
}
