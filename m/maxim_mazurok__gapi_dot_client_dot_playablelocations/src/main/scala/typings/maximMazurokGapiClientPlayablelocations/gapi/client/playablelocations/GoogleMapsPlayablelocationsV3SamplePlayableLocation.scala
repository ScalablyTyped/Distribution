package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3SamplePlayableLocation extends js.Object {
  
  /**
    * Required. The latitude and longitude associated with the center of the playable location. By default, the set of playable locations returned from SamplePlayableLocations use
    * center-point coordinates.
    */
  var centerPoint: js.UndefOr[GoogleTypeLatLng] = js.native
  
  /** Required. The name of this playable location. */
  var name: js.UndefOr[String] = js.native
  
  /** A [place ID] (https://developers.google.com/places/place-id) */
  var placeId: js.UndefOr[String] = js.native
  
  /** A [plus code] (http://openlocationcode.com) */
  var plusCode: js.UndefOr[String] = js.native
  
  /** The playable location's coordinates, snapped to the sidewalk of the nearest road, if a nearby road exists. */
  var snappedPoint: js.UndefOr[GoogleTypeLatLng] = js.native
  
  /**
    * A collection of [Playable Location Types](/maps/documentation/gaming/tt/types) for this playable location. The first type in the collection is the primary type. Type information
    * might not be available for all playable locations.
    */
  var types: js.UndefOr[js.Array[String]] = js.native
}
object GoogleMapsPlayablelocationsV3SamplePlayableLocation {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3SamplePlayableLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SamplePlayableLocation]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3SamplePlayableLocationOps[Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocation] (val x: Self) extends AnyVal {
    
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
    def setCenterPoint(value: GoogleTypeLatLng): Self = this.set("centerPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCenterPoint: Self = this.set("centerPoint", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPlaceId(value: String): Self = this.set("placeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceId: Self = this.set("placeId", js.undefined)
    
    @scala.inline
    def setPlusCode(value: String): Self = this.set("plusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlusCode: Self = this.set("plusCode", js.undefined)
    
    @scala.inline
    def setSnappedPoint(value: GoogleTypeLatLng): Self = this.set("snappedPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnappedPoint: Self = this.set("snappedPoint", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: String*): Self = this.set("types", js.Array(value :_*))
    
    @scala.inline
    def setTypes(value: js.Array[String]): Self = this.set("types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypes: Self = this.set("types", js.undefined)
  }
}
