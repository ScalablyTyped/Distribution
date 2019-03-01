package typings
package openlayersLib.openlayersMod.olxNs.interactionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPanOptions extends js.Object {
  var condition: js.UndefOr[openlayersLib.openlayersMod.EventsConditionType] = js.undefined
  var kinetic: js.UndefOr[openlayersLib.openlayersMod.Kinetic] = js.undefined
}

object DragPanOptions {
  @scala.inline
  def apply(
    condition: openlayersLib.openlayersMod.EventsConditionType = null,
    kinetic: openlayersLib.openlayersMod.Kinetic = null
  ): DragPanOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (kinetic != null) __obj.updateDynamic("kinetic")(kinetic)
    __obj.asInstanceOf[DragPanOptions]
  }
}

