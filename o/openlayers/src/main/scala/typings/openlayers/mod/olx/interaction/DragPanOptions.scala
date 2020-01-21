package typings.openlayers.mod.olx.interaction

import typings.openlayers.mod.EventsConditionType
import typings.openlayers.mod.Kinetic
import typings.openlayers.mod.MapBrowserEvent
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
    if (kinetic != null) __obj.updateDynamic("kinetic")(kinetic.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragPanOptions]
  }
}

