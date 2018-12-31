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
  var style: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var `type`: openlayersLib.openlayersMod.geomNs.GeometryType
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

