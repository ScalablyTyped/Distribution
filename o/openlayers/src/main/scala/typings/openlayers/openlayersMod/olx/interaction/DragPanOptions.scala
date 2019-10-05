package typings.openlayers.openlayersMod.olx.interaction

import typings.openlayers.openlayersMod.EventsConditionType
import typings.openlayers.openlayersMod.Kinetic
import typings.openlayers.openlayersMod.MapBrowserEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DragPanOptions extends js.Object {
  var condition: js.UndefOr[EventsConditionType] = js.undefined
  var kinetic: js.UndefOr[Kinetic] = js.undefined
}

object DragPanOptions {
  @scala.inline
  def apply(condition: /* event */ MapBrowserEvent => Boolean = null, kinetic: Kinetic = null): DragPanOptions = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(js.Any.fromFunction1(condition))
    if (kinetic != null) __obj.updateDynamic("kinetic")(kinetic)
    __obj.asInstanceOf[DragPanOptions]
  }
}

