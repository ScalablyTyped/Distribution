package typings.meteor.Tracker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Computation extends js.Object {
  
  var firstRun: Boolean = js.native
  
  def invalidate(): Unit = js.native
  
  var invalidated: Boolean = js.native
  
  def onInvalidate(callback: js.Function): Unit = js.native
  
  def onStop(callback: js.Function): Unit = js.native
  
  def stop(): Unit = js.native
  
  var stopped: Boolean = js.native
}
object Computation {
  
  @scala.inline
  def apply(
    firstRun: Boolean,
    invalidate: () => Unit,
    invalidated: Boolean,
    onInvalidate: js.Function => Unit,
    onStop: js.Function => Unit,
    stop: () => Unit,
    stopped: Boolean
  ): Computation = {
    val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], invalidate = js.Any.fromFunction0(invalidate), invalidated = invalidated.asInstanceOf[js.Any], onInvalidate = js.Any.fromFunction1(onInvalidate), onStop = js.Any.fromFunction1(onStop), stop = js.Any.fromFunction0(stop), stopped = stopped.asInstanceOf[js.Any])
    __obj.asInstanceOf[Computation]
  }
  
  @scala.inline
  implicit class ComputationOps[Self <: Computation] (val x: Self) extends AnyVal {
    
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
    def setFirstRun(value: Boolean): Self = this.set("firstRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalidate(value: () => Unit): Self = this.set("invalidate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvalidated(value: Boolean): Self = this.set("invalidated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnInvalidate(value: js.Function => Unit): Self = this.set("onInvalidate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStop(value: js.Function => Unit): Self = this.set("onStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopped(value: Boolean): Self = this.set("stopped", value.asInstanceOf[js.Any])
  }
}
