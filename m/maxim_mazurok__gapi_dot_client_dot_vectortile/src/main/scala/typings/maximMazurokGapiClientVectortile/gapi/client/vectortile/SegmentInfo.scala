package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentInfo extends StObject {
  
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
  implicit class SegmentInfoMutableBuilder[Self <: SegmentInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoadInfo(value: RoadInfo): Self = StObject.set(x, "roadInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoadInfoUndefined: Self = StObject.set(x, "roadInfo", js.undefined)
  }
}
