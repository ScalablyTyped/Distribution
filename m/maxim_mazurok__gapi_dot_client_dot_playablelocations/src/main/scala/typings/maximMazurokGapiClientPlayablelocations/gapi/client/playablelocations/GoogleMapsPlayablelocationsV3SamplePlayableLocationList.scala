package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsPlayablelocationsV3SamplePlayableLocationList extends StObject {
  
  /** A list of playable locations for this game object type. */
  var locations: js.UndefOr[js.Array[GoogleMapsPlayablelocationsV3SamplePlayableLocation]] = js.undefined
}
object GoogleMapsPlayablelocationsV3SamplePlayableLocationList {
  
  inline def apply(): GoogleMapsPlayablelocationsV3SamplePlayableLocationList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SamplePlayableLocationList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocationList] (val x: Self) extends AnyVal {
    
    inline def setLocations(value: js.Array[GoogleMapsPlayablelocationsV3SamplePlayableLocation]): Self = StObject.set(x, "locations", value.asInstanceOf[js.Any])
    
    inline def setLocationsUndefined: Self = StObject.set(x, "locations", js.undefined)
    
    inline def setLocationsVarargs(value: GoogleMapsPlayablelocationsV3SamplePlayableLocation*): Self = StObject.set(x, "locations", js.Array(value*))
  }
}
