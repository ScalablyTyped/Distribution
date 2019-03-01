package typings
package nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Listeners extends js.Object {
  var error: js.Array[Func]
  var interrupt: js.Array[Func]
  var newListener: js.Array[Func]
  var removeListener: js.Array[Func]
}

object Listeners {
  @scala.inline
  def apply(
    error: js.Array[Func],
    interrupt: js.Array[Func],
    newListener: js.Array[Func],
    removeListener: js.Array[Func]
  ): Listeners = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("interrupt")(interrupt)
    __obj.updateDynamic("newListener")(newListener)
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.asInstanceOf[Listeners]
  }
}

