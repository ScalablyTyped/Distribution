package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyOptions extends js.Object {
  var condition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var deleteCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var features: js.UndefOr[openlayersLib.openlayersMod.Collection[openlayersLib.openlayersMod.Feature]] = js.undefined
  var insertVertexCondition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var pixelTolerance: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[openlayersLib.openlayersMod.sourceNs.Vector] = js.undefined
  var style: js.UndefOr[
    openlayersLib.openlayersMod.styleNs.Style | js.Array[openlayersLib.openlayersMod.styleNs.Style] | openlayersLib.openlayersMod.StyleFunction
  ] = js.undefined
  var wrapX: js.UndefOr[scala.Boolean] = js.undefined
}

