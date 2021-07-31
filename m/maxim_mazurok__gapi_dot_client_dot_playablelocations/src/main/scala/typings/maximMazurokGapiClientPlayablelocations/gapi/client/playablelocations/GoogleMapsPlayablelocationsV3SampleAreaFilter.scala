package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsPlayablelocationsV3SampleAreaFilter extends StObject {
  
  /**
    * Required. The S2 cell ID of the area you want. This must be between cell level 11 and 14 (inclusive). S2 cells are 64-bit integers that identify areas on the Earth. They are
    * hierarchical, and can therefore be used for spatial indexing. The S2 geometry library is available in a number of languages: * [C++](https://github.com/google/s2geometry) *
    * [Java](https://github.com/google/s2-geometry-library-java) * [Go](https://github.com/golang/geo) * [Python](https://github.com/google/s2geometry/tree/master/src/python)
    */
  var s2CellId: js.UndefOr[String] = js.undefined
}
object GoogleMapsPlayablelocationsV3SampleAreaFilter {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3SampleAreaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SampleAreaFilter]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3SampleAreaFilterMutableBuilder[Self <: GoogleMapsPlayablelocationsV3SampleAreaFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS2CellId(value: String): Self = StObject.set(x, "s2CellId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS2CellIdUndefined: Self = StObject.set(x, "s2CellId", js.undefined)
  }
}
