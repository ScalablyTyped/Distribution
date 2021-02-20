package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4Location extends StObject {
  
  /** An object representing a latitude/longitude pair. */
  var latLng: js.UndefOr[LatLng] = js.native
  
  /**
    * The type of a location, which corresponds to the address lines field of google.type.PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of LocationType.NEIGHBORHOOD,
    * and "Kansas City, KS, USA" has a type of LocationType.LOCALITY.
    */
  var locationType: js.UndefOr[String] = js.native
  
  /**
    * Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items
    * to a premises, P.O. Box, or other delivery location.
    */
  var postalAddress: js.UndefOr[PostalAddress] = js.native
  
  /**
    * Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from google.type.LatLng covers the
    * area associated with the job location. For example, currently, "Mountain View, CA, USA" has a radius of 6.17 miles.
    */
  var radiusMiles: js.UndefOr[Double] = js.native
}
object GoogleCloudTalentV4Location {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4Location]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4LocationMutableBuilder[Self <: GoogleCloudTalentV4Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = StObject.set(x, "locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationTypeUndefined: Self = StObject.set(x, "locationType", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: PostalAddress): Self = StObject.set(x, "postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalAddressUndefined: Self = StObject.set(x, "postalAddress", js.undefined)
    
    @scala.inline
    def setRadiusMiles(value: Double): Self = StObject.set(x, "radiusMiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadiusMilesUndefined: Self = StObject.set(x, "radiusMiles", js.undefined)
  }
}
