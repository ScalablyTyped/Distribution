package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentInfo extends js.Object {
  
  /** Metadata for features with the ROAD FeatureType. */
  var roadInfo: js.UndefOr[RoadInfo] = js.native
}
object SegmentInfo {
  
  @scala.inline
  def apply(): SegmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentInfo]
  }
  
  @scala.inline
  implicit class SegmentInfoOps[Self <: SegmentInfo] (val x: Self) extends AnyVal {
    
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
    def setRoadInfo(value: RoadInfo): Self = this.set("roadInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoadInfo: Self = this.set("roadInfo", js.undefined)
  }
}
