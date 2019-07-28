package typings.ol.interactionDragPanMod

import typings.ol.eventsConditionMod.Condition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[Condition] = js.undefined
  var kinetic: js.UndefOr[typings.ol.kineticMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(condition: Condition = null, kinetic: typings.ol.kineticMod.default = null): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (kinetic != null) __obj.updateDynamic("kinetic")(kinetic)
    __obj.asInstanceOf[Options]
  }
}

