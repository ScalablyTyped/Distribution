package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var clickTolerance: js.UndefOr[scala.Double] = js.undefined
  var condition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var features: js.UndefOr[openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature]] = js.undefined
  var finishCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var freehand: js.UndefOr[scala.Boolean] = js.undefined
  var freehandCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var geometryFunction: js.UndefOr[openlayersLib.openlayersMod.DrawGeometryFunctionType] = js.undefined
  var geometryName: js.UndefOr[java.lang.String] = js.undefined
  var maxPoints: js.UndefOr[scala.Double] = js.undefined
  var minPoints: js.UndefOr[scala.Double] = js.undefined
  var snapTolerance: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[openlayersLib.openlayersMod.sourceNs.Vector] = js.undefined
  var stopClick: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var `type`: openlayersLib.openlayersMod.geomNs.GeometryType
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    `type`: openlayersLib.openlayersMod.geomNs.GeometryType,
    clickTolerance: scala.Int | scala.Double = null,
    condition: openlayersLib.openlayersMod.EventsConditionType = null,
    features: openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature] = null,
    finishCondition: openlayersLib.openlayersMod.EventsConditionType = null,
    freehand: js.UndefOr[scala.Boolean] = js.undefined,
    freehandCondition: openlayersLib.openlayersMod.EventsConditionType = null,
    geometryFunction: openlayersLib.openlayersMod.DrawGeometryFunctionType = null,
    geometryName: java.lang.String = null,
    maxPoints: scala.Int | scala.Double = null,
    minPoints: scala.Int | scala.Double = null,
    snapTolerance: scala.Int | scala.Double = null,
    source: openlayersLib.openlayersMod.sourceNs.Vector = null,
    stopClick: js.UndefOr[scala.Boolean] = js.undefined,
    style: openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction = null,
    wrapX: js.UndefOr[scala.Boolean] = js.undefined
  ): DrawOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (clickTolerance != null) __obj.updateDynamic("clickTolerance")(clickTolerance.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition)
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
    __obj.asInstanceOf[DrawOptions]
  }
}

