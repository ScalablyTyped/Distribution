package typings.ol.drawMod

import typings.ol.conditionMod.Condition
import typings.ol.geometryTypeMod.GeometryType
import typings.ol.olFeatureMod.FeatureLike
import typings.ol.styleStyleMod.Style
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var clickTolerance: js.UndefOr[Double] = js.native
  
  var condition: js.UndefOr[Condition] = js.native
  
  var dragVertexDelay: js.UndefOr[Double] = js.native
  
  var features: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
  ] = js.native
  
  var finishCondition: js.UndefOr[Condition] = js.native
  
  var freehand: js.UndefOr[Boolean] = js.native
  
  var freehandCondition: js.UndefOr[Condition] = js.native
  
  var geometryFunction: js.UndefOr[GeometryFunction] = js.native
  
  var geometryName: js.UndefOr[String] = js.native
  
  var maxPoints: js.UndefOr[Double] = js.native
  
  var minPoints: js.UndefOr[Double] = js.native
  
  var snapTolerance: js.UndefOr[Double] = js.native
  
  var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.native
  
  var stopClick: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[StyleLike] = js.native
  
  var `type`: GeometryType = js.native
  
  var wrapX: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(`type`: GeometryType): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setType(value: GeometryType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTolerance(value: Double): Self = this.set("clickTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickTolerance: Self = this.set("clickTolerance", js.undefined)
    
    @scala.inline
    def setCondition(value: Condition): Self = this.set("condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    
    @scala.inline
    def setDragVertexDelay(value: Double): Self = this.set("dragVertexDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragVertexDelay: Self = this.set("dragVertexDelay", js.undefined)
    
    @scala.inline
    def setFeatures(
      value: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
    ): Self = this.set("features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    
    @scala.inline
    def setFinishCondition(value: Condition): Self = this.set("finishCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinishCondition: Self = this.set("finishCondition", js.undefined)
    
    @scala.inline
    def setFreehand(value: Boolean): Self = this.set("freehand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreehand: Self = this.set("freehand", js.undefined)
    
    @scala.inline
    def setFreehandCondition(value: Condition): Self = this.set("freehandCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFreehandCondition: Self = this.set("freehandCondition", js.undefined)
    
    @scala.inline
    def setGeometryFunction(
      value: (/* p0 */ SketchCoordType, /* p1 */ js.UndefOr[typings.ol.simpleGeometryMod.default], /* p2 */ js.UndefOr[typings.ol.projectionMod.default]) => typings.ol.simpleGeometryMod.default
    ): Self = this.set("geometryFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGeometryFunction: Self = this.set("geometryFunction", js.undefined)
    
    @scala.inline
    def setGeometryName(value: String): Self = this.set("geometryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometryName: Self = this.set("geometryName", js.undefined)
    
    @scala.inline
    def setMaxPoints(value: Double): Self = this.set("maxPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxPoints: Self = this.set("maxPoints", js.undefined)
    
    @scala.inline
    def setMinPoints(value: Double): Self = this.set("minPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinPoints: Self = this.set("minPoints", js.undefined)
    
    @scala.inline
    def setSnapTolerance(value: Double): Self = this.set("snapTolerance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapTolerance: Self = this.set("snapTolerance", js.undefined)
    
    @scala.inline
    def setSource(value: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]): Self = this.set("source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    
    @scala.inline
    def setStopClick(value: Boolean): Self = this.set("stopClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopClick: Self = this.set("stopClick", js.undefined)
    
    @scala.inline
    def setStyleFunction2(value: (/* p0 */ FeatureLike, /* p1 */ Double) => Style | js.Array[Style]): Self = this.set("style", js.Any.fromFunction2(value))
    
    @scala.inline
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    
    @scala.inline
    def setStyle(value: StyleLike): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
}
