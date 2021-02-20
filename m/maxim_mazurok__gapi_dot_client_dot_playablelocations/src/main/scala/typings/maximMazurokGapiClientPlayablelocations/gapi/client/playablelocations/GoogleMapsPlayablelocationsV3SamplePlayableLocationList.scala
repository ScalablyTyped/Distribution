package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3SamplePlayableLocationList extends StObject {
  
  /** A list of playable locations for this game object type. */
  var locations: js.UndefOr[js.Array[GoogleMapsPlayablelocationsV3SamplePlayableLocation]] = js.native
}
object GoogleMapsPlayablelocationsV3SamplePlayableLocationList {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3SamplePlayableLocationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SamplePlayableLocationList]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3SamplePlayableLocationListMutableBuilder[Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocationList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLocations(value: js.Array[GoogleMapsPlayablelocationsV3SamplePlayableLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    @scala.inline
    def setLocationsVarargs(value: GoogleMapsPlayablelocationsV3SamplePlayableLocation*): Self = StObject.set(x, "locations", js.Array(value :_*))
  }
}
