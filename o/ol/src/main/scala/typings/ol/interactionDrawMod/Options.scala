package typings.ol.interactionDrawMod

import typings.ol.eventsConditionMod.Condition
import typings.ol.geomGeometryTypeMod.GeometryType
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var condition: js.UndefOr[Condition] = js.undefined
  var dragVertexDelay: js.UndefOr[Double] = js.undefined
  var features: js.UndefOr[typings.ol.collectionMod.default[typings.ol.featureMod.default]] = js.undefined
  var finishCondition: js.UndefOr[Condition] = js.undefined
  var freehand: js.UndefOr[Boolean] = js.undefined
  var freehandCondition: js.UndefOr[Condition] = js.undefined
  var geometryFunction: js.UndefOr[GeometryFunction] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var maxPoints: js.UndefOr[Double] = js.undefined
  var minPoints: js.UndefOr[Double] = js.undefined
  var snapTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorMod.default] = js.undefined
  var stopClick: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleLike] = js.undefined
  var `type`: GeometryType
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `type`: GeometryType,
    clickTolerance: Int | Double = null,
    condition: Condition = null,
    dragVertexDelay: Int | Double = null,
    features: typings.ol.collectionMod.default[typings.ol.featureMod.default] = null,
    finishCondition: Condition = null,
    freehand: js.UndefOr[Boolean] = js.undefined,
    freehandCondition: Condition = null,
    geometryFunction: (/* p0 */ SketchCoordType, /* p1 */ js.UndefOr[typings.ol.geomSimpleGeometryMod.default]) => typings.ol.geomSimpleGeometryMod.default = null,
    geometryName: String = null,
    maxPoints: Int | Double = null,
    minPoints: Int | Double = null,
    snapTolerance: Int | Double = null,
    source: typings.ol.sourceVectorMod.default = null,
    stopClick: js.UndefOr[Boolean] = js.undefined,
    style: StyleLike = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (clickTolerance != null) __obj.updateDynamic("clickTolerance")(clickTolerance.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (dragVertexDelay != null) __obj.updateDynamic("dragVertexDelay")(dragVertexDelay.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features)
    if (finishCondition != null) __obj.updateDynamic("finishCondition")(finishCondition)
    if (!js.isUndefined(freehand)) __obj.updateDynamic("freehand")(freehand)
    if (freehandCondition != null) __obj.updateDynamic("freehandCondition")(freehandCondition)
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction2(geometryFunction))
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName)
    if (maxPoints != null) __obj.updateDynamic("maxPoints")(maxPoints.asInstanceOf[js.Any])
    if (minPoints != null) __obj.updateDynamic("minPoints")(minPoints.asInstanceOf[js.Any])
    if (snapTolerance != null) __obj.updateDynamic("snapTolerance")(snapTolerance.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    if (!js.isUndefined(stopClick)) __obj.updateDynamic("stopClick")(stopClick)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX)
    __obj.asInstanceOf[Options]
  }
}

