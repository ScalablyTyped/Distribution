package typings
package olLib.interactionDragPanMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var condition: js.UndefOr[olLib.eventsConditionMod.Condition] = js.undefined
  var kinetic: js.UndefOr[olLib.kineticMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(condition: olLib.eventsConditionMod.Condition = null, kinetic: olLib.kineticMod.default = null): Options = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition)
    if (kinetic != null) __obj.updateDynamic("kinetic")(kinetic)
    __obj.asInstanceOf[Options]
  }
}

