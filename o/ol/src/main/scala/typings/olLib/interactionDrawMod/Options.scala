package typings
package olLib.interactionDrawMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var clickTolerance: js.UndefOr[scala.Double] = js.undefined
  var condition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var dragVertexDelay: js.UndefOr[scala.Double] = js.undefined
  var features: js.UndefOr[olLib.collectionMod.default[olLib.featureMod.default]] = js.undefined
  var finishCondition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var freehand: js.UndefOr[scala.Boolean] = js.undefined
  var freehandCondition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var geometryFunction: js.UndefOr[GeometryFunction] = js.undefined
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
  var maxPoints: js.UndefOr[scala.Double] = js.undefined
  var minPoints: js.UndefOr[scala.Double] = js.undefined
  var snapTolerance: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[olLib.sourceVectorMod.default] = js.undefined
  var stopClick: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[olLib.styleStyleMod.StyleLike] = js.undefined
  var `type`: olLib.geomGeometryTypeMod.GeometryType
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `type`: olLib.geomGeometryTypeMod.GeometryType,
    clickTolerance: scala.Int | scala.Double = null,
    condition: olLib.eventsConditionMod.Condition = null,
    dragVertexDelay: scala.Int | scala.Double = null,
    features: olLib.collectionMod.default[olLib.featureMod.default] = null,
    finishCondition: olLib.eventsConditionMod.Condition = null,
    freehand: js.UndefOr[scala.Boolean] = js.undefined,
    freehandCondition: olLib.eventsConditionMod.Condition = null,
    geometryFunction: GeometryFunction = null,
    geometryName: java.lang.String = null,
    maxPoints: scala.Int | scala.Double = null,
    minPoints: scala.Int | scala.Double = null,
    snapTolerance: scala.Int | scala.Double = null,
    source: olLib.sourceVectorMod.default = null,
    stopClick: js.UndefOr[scala.Boolean] = js.undefined,
    style: olLib.styleStyleMod.StyleLike = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
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
    if (geometryFunction != null) __obj.updateDynamic("geometryFunction")(geometryFunction)
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

