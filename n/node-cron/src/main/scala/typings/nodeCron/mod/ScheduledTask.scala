package typings.nodeCron.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledTask extends js.Object {
  
  def destroy(): Unit = js.native
  
  def getStatus(): String = js.native
  
  def start(): this.type = js.native
  
  def stop(): this.type = js.native
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
  
  @scala.inline
  implicit class ScheduledTaskOps[Self <: ScheduledTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStatus(value: () => String): Self = this.set("getStatus", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => ScheduledTask): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => ScheduledTask): Self = this.set("stop", js.Any.fromFunction0(value))
  }
}
