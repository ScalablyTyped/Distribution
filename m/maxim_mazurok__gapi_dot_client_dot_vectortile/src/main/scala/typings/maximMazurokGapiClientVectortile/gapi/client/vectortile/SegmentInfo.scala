package typings.maximMazurokGapiClientVectortile.gapi.client.vectortile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SegmentInfo extends StObject {
  
  /** Metadata for features with the ROAD FeatureType. */
  var roadInfo: js.UndefOr[RoadInfo] = js.undefined
}
object SegmentInfo {
  
  inline def apply(): SegmentInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SegmentInfo]
  }
  
  extension [Self <: SegmentInfo](x: Self) {
    
    inline def setRoadInfo(value: RoadInfo): Self = StObject.set(x, "roadInfo", value.asInstanceOf[js.Any])
    
    inline def setRoadInfoUndefined: Self = StObject.set(x, "roadInfo", js.undefined)
  }
}
