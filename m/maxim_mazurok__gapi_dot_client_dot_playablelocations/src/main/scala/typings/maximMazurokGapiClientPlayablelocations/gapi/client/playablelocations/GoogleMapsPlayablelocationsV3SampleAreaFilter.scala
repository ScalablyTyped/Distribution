package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3SampleAreaFilter extends js.Object {
  
  /**
    * Required. The S2 cell ID of the area you want. This must be between cell level 11 and 14 (inclusive). S2 cells are 64-bit integers that identify areas on the Earth. They are
    * hierarchical, and can therefore be used for spatial indexing. The S2 geometry library is available in a number of languages: * [C++](https://github.com/google/s2geometry) *
    * [Java](https://github.com/google/s2-geometry-library-java) * [Go](https://github.com/golang/geo) * [Python](https://github.com/google/s2geometry/tree/master/src/python)
    */
  var s2CellId: js.UndefOr[String] = js.native
}
object GoogleMapsPlayablelocationsV3SampleAreaFilter {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3SampleAreaFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SampleAreaFilter]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3SampleAreaFilterOps[Self <: GoogleMapsPlayablelocationsV3SampleAreaFilter] (val x: Self) extends AnyVal {
    
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
    def setS2CellId(value: String): Self = this.set("s2CellId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS2CellId: Self = this.set("s2CellId", js.undefined)
  }
}
