package typings
package nextgenDashEventsLib.nextgenDashEventsMod.NextGenEventsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scope extends js.Object {
  var queue: js.Array[_]
  var ready: scala.Boolean
}

object Scope {
  @scala.inline
  def apply(queue: js.Array[_], ready: scala.Boolean): Scope = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("queue")(queue)
    __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[Scope]
  }
}

