package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerformanceNodeTiming extends PerformanceEntry {
  
  /**
    * The high resolution millisecond timestamp at which the Node.js process completed bootstrap.
    */
  val bootstrapComplete: Double = js.native
  
  /**
    * The high resolution millisecond timestamp at which the Node.js process completed bootstrapping.
    * If bootstrapping has not yet finished, the property has the value of -1.
    */
  val environment: Double = js.native
  
  /**
    * The high resolution millisecond timestamp at which the Node.js environment was initialized.
    */
  val idleTime: Double = js.native
  
  /**
    * The high resolution millisecond timestamp of the amount of time the event loop has been idle
    *  within the event loop's event provider (e.g. `epoll_wait`). This does not take CPU usage
    * into consideration. If the event loop has not yet started (e.g., in the first tick of the main script),
    *  the property has the value of 0.
    */
  val loopExit: Double = js.native
  
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop started.
    * If the event loop has not yet started (e.g., in the first tick of the main script), the property has the value of -1.
    */
  val loopStart: Double = js.native
  
  /**
    * The high resolution millisecond timestamp at which the V8 platform was initialized.
    */
  val v8Start: Double = js.native
}
object PerformanceNodeTiming {
  
  @scala.inline
  def apply(
    bootstrapComplete: Double,
    duration: Double,
    entryType: EntryType,
    environment: Double,
    idleTime: Double,
    loopExit: Double,
    loopStart: Double,
    name: String,
    startTime: Double,
    v8Start: Double
  ): PerformanceNodeTiming = {
    val __obj = js.Dynamic.literal(bootstrapComplete = bootstrapComplete.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], idleTime = idleTime.asInstanceOf[js.Any], loopExit = loopExit.asInstanceOf[js.Any], loopStart = loopStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], v8Start = v8Start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNodeTiming]
  }
  
  @scala.inline
  implicit class PerformanceNodeTimingOps[Self <: PerformanceNodeTiming] (val x: Self) extends AnyVal {
    
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
    def setBootstrapComplete(value: Double): Self = this.set("bootstrapComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnvironment(value: Double): Self = this.set("environment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdleTime(value: Double): Self = this.set("idleTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopExit(value: Double): Self = this.set("loopExit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopStart(value: Double): Self = this.set("loopStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setV8Start(value: Double): Self = this.set("v8Start", value.asInstanceOf[js.Any])
  }
}
