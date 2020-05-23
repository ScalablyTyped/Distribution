package typings.ol.drawMod

import typings.ol.conditionMod.Condition
import typings.ol.geometryTypeMod.GeometryType
import typings.ol.styleStyleMod.StyleLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var condition: js.UndefOr[Condition] = js.undefined
  var dragVertexDelay: js.UndefOr[Double] = js.undefined
  var features: js.UndefOr[
    typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]]
  ] = js.undefined
  var finishCondition: js.UndefOr[Condition] = js.undefined
  var freehand: js.UndefOr[Boolean] = js.undefined
  var freehandCondition: js.UndefOr[Condition] = js.undefined
  var geometryFunction: js.UndefOr[GeometryFunction] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var maxPoints: js.UndefOr[Double] = js.undefined
  var minPoints: js.UndefOr[Double] = js.undefined
  var snapTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default]] = js.undefined
  var stopClick: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[StyleLike] = js.undefined
  var `type`: GeometryType
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `type`: GeometryType,
    clickTolerance: js.UndefOr[Double] = js.undefined,
    condition: Condition = null,
    dragVertexDelay: js.UndefOr[Double] = js.undefined,
    features: typings.ol.collectionMod.default[typings.ol.olFeatureMod.default[typings.ol.geometryMod.default]] = null,
    finishCondition: Condition = null,
    freehand: js.UndefOr[Boolean] = js.undefined,
    freehandCondition: Condition = null,
    geometryFunction: (/* p0 */ SketchCoordType, /* p1 */ js.UndefOr[typings.ol.simpleGeometryMod.default], /* p2 */ js.UndefOr[typings.ol.projectionMod.default]) => typings.ol.simpleGeometryMod.default = null,
    geometryName: String = null,
    maxPoints: js.UndefOr[Double] = js.undefined,
    minPoints: js.UndefOr[Double] = js.undefined,
    snapTolerance: js.UndefOr[Double] = js.undefined,
    source: typings.ol.sourceVectorMod.default[typings.ol.geometryMod.default] = null,
    stopClick: js.UndefOr[Boolean] = js.undefined,
    style: StyleLike = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(clickTolerance)) __obj.updateDynamic("clickTolerance")(clickTolerance.get.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (!js.isUndefined(dragVertexDelay)) __obj.updateDynamic("dragVertexDelay")(dragVertexDelay.get.asInstanceOf[js.Any])
    if (features != null) __obj.updateDynamic("features")(features.asInstanceOf[js.Any])
    if (finishCondition != null) __obj.updateDynamic("finishCondition")(finishCondition.asInstanceOf[js.Any])
    if (!js.isUndefined(freehand)) __obj.updateDynamic("freehand")(freehand.get.asInstanceOf[js.Any])
    if (freehandCondition != null) __obj.updateDynamic("freehandCondition")(freehandCondition.asInstanceOf[js.Any])
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(js.Any.fromFunction3(geometryFunction))
    if (geometryName != null) __obj.updateDynamic("geometryName")(geometryName.asInstanceOf[js.Any])
    if (!js.isUndefined(maxPoints)) __obj.updateDynamic("maxPoints")(maxPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minPoints)) __obj.updateDynamic("minPoints")(minPoints.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapTolerance)) __obj.updateDynamic("snapTolerance")(snapTolerance.get.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (!js.isUndefined(stopClick)) __obj.updateDynamic("stopClick")(stopClick.get.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(wrapX)) __obj.updateDynamic("wrapX")(wrapX.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

