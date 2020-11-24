package typings.ol.modifyMod

import typings.ol.extentMod.Extent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SegmentData extends js.Object {
  
  var depth: js.UndefOr[js.Array[Double]] = js.native
  
  var feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default] = js.native
  
  var featureSegments: js.UndefOr[js.Array[SegmentData]] = js.native
  
  var geometry: typings.ol.simpleGeometryMod.default = js.native
  
  var index: js.UndefOr[Double] = js.native
  
  var segment: js.Array[Extent] = js.native
}
object SegmentData {
  
  @scala.inline
  def apply(
    feature: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default],
    geometry: typings.ol.simpleGeometryMod.default,
    segment: js.Array[Extent]
  ): SegmentData = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SegmentData]
  }
  
  @scala.inline
  implicit class SegmentDataOps[Self <: SegmentData] (val x: Self) extends AnyVal {
    
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
    def setFeature(value: typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]): Self = this.set("feature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeometry(value: typings.ol.simpleGeometryMod.default): Self = this.set("geometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentVarargs(value: Extent*): Self = this.set("segment", js.Array(value :_*))
    
    @scala.inline
    def setSegment(value: js.Array[Extent]): Self = this.set("segment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthVarargs(value: Double*): Self = this.set("depth", js.Array(value :_*))
    
    @scala.inline
    def setDepth(value: js.Array[Double]): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setFeatureSegmentsVarargs(value: SegmentData*): Self = this.set("featureSegments", js.Array(value :_*))
    
    @scala.inline
    def setFeatureSegments(value: js.Array[SegmentData]): Self = this.set("featureSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatureSegments: Self = this.set("featureSegments", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
  }
}
