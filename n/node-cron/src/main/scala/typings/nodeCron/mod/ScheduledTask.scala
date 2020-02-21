package typings.nodeCron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledTask extends js.Object {
  def destroy(): Unit
  def getStatus(): String
  def start(): this.type
  def stop(): this.type
}

object ScheduledTask {
  @scala.inline
  def apply(
    destroy: () => Unit,
    getStatus: () => String,
    start: () => ScheduledTask,
    stop: () => ScheduledTask
  ): ScheduledTask = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), getStatus = js.Any.fromFunction0(getStatus), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[ScheduledTask]
  }
}

