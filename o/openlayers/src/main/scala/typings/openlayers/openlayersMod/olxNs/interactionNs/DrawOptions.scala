package typings.openlayers.openlayersMod.olxNs.interactionNs

import typings.openlayers.openlayersMod.Collection
import typings.openlayers.openlayersMod.DrawGeometryFunctionType
import typings.openlayers.openlayersMod.EventsConditionType
import typings.openlayers.openlayersMod.Feature
import typings.openlayers.openlayersMod.StyleFunction
import typings.openlayers.openlayersMod.geomNs.GeometryType
import typings.openlayers.openlayersMod.sourceNs.Vector
import typings.openlayers.openlayersMod.styleNs.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DrawOptions extends js.Object {
  var clickTolerance: js.UndefOr[Double] = js.undefined
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var features: js.UndefOr[Collection[Feature]] = js.undefined
  var finishCondition: js.UndefOr[EventsConditionType] = js.undefined
  var freehand: js.UndefOr[Boolean] = js.undefined
  var freehandCondition: js.UndefOr[EventsConditionType] = js.undefined
  var geometryFunction: js.UndefOr[DrawGeometryFunctionType] = js.undefined
  var geometryName: js.UndefOr[String] = js.undefined
  var maxPoints: js.UndefOr[Double] = js.undefined
  var minPoints: js.UndefOr[Double] = js.undefined
  var snapTolerance: js.UndefOr[Double] = js.undefined
  var source: js.UndefOr[Vector] = js.undefined
  var stopClick: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[Style | js.Array[Style] | StyleFunction] = js.undefined
  var `type`: GeometryType
  var wrapX: js.UndefOr[Boolean] = js.undefined
}

object DrawOptions {
  @scala.inline
  def apply(
    `type`: GeometryType,
    clickTolerance: Int | Double = null,
    condition: EventsConditionType = null,
    features: Collection[Feature] = null,
    finishCondition: EventsConditionType = null,
    freehand: js.UndefOr[Boolean] = js.undefined,
    freehandCondition: EventsConditionType = null,
    geometryFunction: DrawGeometryFunctionType = null,
    geometryName: String = null,
    maxPoints: Int | Double = null,
    minPoints: Int | Double = null,
    snapTolerance: Int | Double = null,
    source: Vector = null,
    stopClick: js.UndefOr[Boolean] = js.undefined,
    style: Style | js.Array[Style] | StyleFunction = null,
    wrapX: js.UndefOr[Boolean] = js.undefined
  ): DrawOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
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

