package typings
package nodeDashCronLib.nodeDashCronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledTask extends js.Object {
  def destroy(): scala.Unit
  def start(): this.type
  def stop(): this.type
}

object ScheduledTask {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    start: js.Function0[ScheduledTask],
    stop: js.Function0[ScheduledTask]
  ): ScheduledTask = {
    val __obj = js.Dynamic.literal(destroy = destroy, start = start, stop = stop)
  
    __obj.asInstanceOf[ScheduledTask]
  }
}

