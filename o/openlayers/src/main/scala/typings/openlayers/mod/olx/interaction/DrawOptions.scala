package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.Collection
import typings.openlayers.mod.Coordinate_
import typings.openlayers.mod.DrawGeometryFunctionType
import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Feature
import typings.openlayers.mod.MapBrowserEvent
import typings.openlayers.mod.StyleFunction
import typings.openlayers.mod.geom.GeometryType
import typings.openlayers.mod.geom.SimpleGeometry
import typings.openlayers.mod.source.Vector
import typings.openlayers.mod.style.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawOptions extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.native
  var condition: js.UndefOr[EventsConditionType] = js.native
  var features: js.UndefOr[Collection[Feature]] = js.native
  var finishCondition: js.UndefOr[EventsConditionType] = js.native
  var freehand: js.UndefOr[Boolean] = js.native
  var freehandCondition: js.UndefOr[EventsConditionType] = js.native
  var geometryFunction: js.UndefOr[DrawGeometryFunctionType] = js.native
  var geometryName: js.UndefOr[String] = js.native
  var maxPoints: js.UndefOr[Double] = js.native
  var minPoints: js.UndefOr[Double] = js.native
  var snapTolerance: js.UndefOr[Double] = js.native
  var source: js.UndefOr[Vector] = js.native
  var stopClick: js.UndefOr[Boolean] = js.native
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.native
  var `type`: GeometryType = js.native
  var wrapX: js.UndefOr[Boolean] = js.native
}

object DrawOptions {
  @scala.inline
  def apply(`type`: GeometryType): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawOptions]
  }
  @scala.inline
  implicit class DrawOptionsOps[Self <: DrawOptions] (val x: Self) extends AnyVal {
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
    def setCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("condition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setFeatures(value: Collection[Feature]): Self = this.set("features", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatures: Self = this.set("features", js.undefined)
    @scala.inline
    def setFinishCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("finishCondition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFinishCondition: Self = this.set("finishCondition", js.undefined)
    @scala.inline
    def setFreehand(value: Boolean): Self = this.set("freehand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFreehand: Self = this.set("freehand", js.undefined)
    @scala.inline
    def setFreehandCondition(value: /* event */ MapBrowserEvent => Boolean): Self = this.set("freehandCondition", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFreehandCondition: Self = this.set("freehandCondition", js.undefined)
    @scala.inline
    def setGeometryFunction(
      value: (/* coords */ Coordinate_ | (js.Array[js.Array[Coordinate_] | Coordinate_]), /* geo */ js.UndefOr[SimpleGeometry]) => SimpleGeometry
    ): Self = this.set("geometryFunction", js.Any.fromFunction2(value))
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
    def setSource(value: Vector): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
    @scala.inline
    def setStopClick(value: Boolean): Self = this.set("stopClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStopClick: Self = this.set("stopClick", js.undefined)
    @scala.inline
    def setStyleFunction2(
      value: (/* feature */ Feature | typings.openlayers.mod.render.Feature, /* resolution */ Double) => Style | js.Array[Style] | Null
    ): Self = this.set("style", js.Any.fromFunction2(value))
    @scala.inline
    def setStyleVarargs(value: Style*): Self = this.set("style", js.Array(value :_*))
    @scala.inline
    def setStyle(value: Style | js.Array[Style] | StyleFunction): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setWrapX(value: Boolean): Self = this.set("wrapX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapX: Self = this.set("wrapX", js.undefined)
  }
  
}

