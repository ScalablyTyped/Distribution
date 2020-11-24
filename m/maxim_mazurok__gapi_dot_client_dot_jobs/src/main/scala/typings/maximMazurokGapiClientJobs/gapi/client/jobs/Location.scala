package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Location extends js.Object {
  
  /** An object representing a latitude/longitude pair. */
  var latLng: js.UndefOr[LatLng] = js.native
  
  /**
    * The type of a location, which corresponds to the address lines field of PostalAddress. For example, "Downtown, Atlanta, GA, USA" has a type of LocationType#NEIGHBORHOOD, and "Kansas
    * City, KS, USA" has a type of LocationType#LOCALITY.
    */
  var locationType: js.UndefOr[String] = js.native
  
  /**
    * Postal address of the location that includes human readable information, such as postal delivery and payments addresses. Given a postal address, a postal service can deliver items
    * to a premises, P.O. Box, or other delivery location.
    */
  var postalAddress: js.UndefOr[PostalAddress] = js.native
  
  /**
    * Radius in miles of the job location. This value is derived from the location bounding box in which a circle with the specified radius centered from LatLng covers the area associated
    * with the job location. For example, currently, "Mountain View, CA, USA" has a radius of 6.17 miles.
    */
  var radiusInMiles: js.UndefOr[Double] = js.native
}
object Location {
  
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
    
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
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
    
    @scala.inline
    def setLocationType(value: String): Self = this.set("locationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationType: Self = this.set("locationType", js.undefined)
    
    @scala.inline
    def setPostalAddress(value: PostalAddress): Self = this.set("postalAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalAddress: Self = this.set("postalAddress", js.undefined)
    
    @scala.inline
    def setRadiusInMiles(value: Double): Self = this.set("radiusInMiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRadiusInMiles: Self = this.set("radiusInMiles", js.undefined)
  }
}
