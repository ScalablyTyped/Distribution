package typings.nanoscheduler.mod.scheduler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Schedule work to be completed when the user agent is idle. Weighs 270 bytes compressed.
  */
@js.native
trait NanoScheduler extends js.Object {
  
  /**
    * Push a callback into the scheduler, to be executed when the user agent is idle.
    */
  def push(cb: js.Function0[Unit]): Unit = js.native
  
  def schedule(): Unit = js.native
  
  def setTimeout(cb: js.Function0[Unit]): Unit = js.native
}
object NanoScheduler {
  
  @scala.inline
  def apply(push: js.Function0[Unit] => Unit, schedule: () => Unit, setTimeout: js.Function0[Unit] => Unit): NanoScheduler = {
    val __obj = js.Dynamic.literal(push = js.Any.fromFunction1(push), schedule = js.Any.fromFunction0(schedule), setTimeout = js.Any.fromFunction1(setTimeout))
    __obj.asInstanceOf[NanoScheduler]
  }
  
  @scala.inline
  implicit class NanoSchedulerOps[Self <: NanoScheduler] (val x: Self) extends AnyVal {
    
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
    def setPush(value: js.Function0[Unit] => Unit): Self = this.set("push", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSchedule(value: () => Unit): Self = this.set("schedule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetTimeout(value: js.Function0[Unit] => Unit): Self = this.set("setTimeout", js.Any.fromFunction1(value))
  }
}
