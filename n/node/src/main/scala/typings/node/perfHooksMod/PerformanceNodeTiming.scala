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
    * The high resolution millisecond timestamp at which cluster processing ended.
    */
  val clusterSetupEnd: Double = js.native
  /**
    * The high resolution millisecond timestamp at which cluster processing started.
    */
  val clusterSetupStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop exited.
    */
  val loopExit: Double = js.native
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop started.
    */
  val loopStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which main module load ended.
    */
  val moduleLoadEnd: Double = js.native
  /**
    * The high resolution millisecond timestamp at which main module load started.
    */
  val moduleLoadStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which the Node.js process was initialized.
    */
  val nodeStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which preload module load ended.
    */
  val preloadModuleLoadEnd: Double = js.native
  /**
    * The high resolution millisecond timestamp at which preload module load started.
    */
  val preloadModuleLoadStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which third_party_main processing ended.
    */
  val thirdPartyMainEnd: Double = js.native
  /**
    * The high resolution millisecond timestamp at which third_party_main processing started.
    */
  val thirdPartyMainStart: Double = js.native
  /**
    * The high resolution millisecond timestamp at which the V8 platform was initialized.
    */
  val v8Start: Double = js.native
}

object PerformanceNodeTiming {
  @scala.inline
  def apply(
    bootstrapComplete: Double,
    clusterSetupEnd: Double,
    clusterSetupStart: Double,
    duration: Double,
    entryType: EntryType,
    loopExit: Double,
    loopStart: Double,
    moduleLoadEnd: Double,
    moduleLoadStart: Double,
    name: String,
    nodeStart: Double,
    preloadModuleLoadEnd: Double,
    preloadModuleLoadStart: Double,
    startTime: Double,
    thirdPartyMainEnd: Double,
    thirdPartyMainStart: Double,
    v8Start: Double
  ): PerformanceNodeTiming = {
    val __obj = js.Dynamic.literal(bootstrapComplete = bootstrapComplete.asInstanceOf[js.Any], clusterSetupEnd = clusterSetupEnd.asInstanceOf[js.Any], clusterSetupStart = clusterSetupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], loopExit = loopExit.asInstanceOf[js.Any], loopStart = loopStart.asInstanceOf[js.Any], moduleLoadEnd = moduleLoadEnd.asInstanceOf[js.Any], moduleLoadStart = moduleLoadStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeStart = nodeStart.asInstanceOf[js.Any], preloadModuleLoadEnd = preloadModuleLoadEnd.asInstanceOf[js.Any], preloadModuleLoadStart = preloadModuleLoadStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], thirdPartyMainEnd = thirdPartyMainEnd.asInstanceOf[js.Any], thirdPartyMainStart = thirdPartyMainStart.asInstanceOf[js.Any], v8Start = v8Start.asInstanceOf[js.Any])
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
    def setClusterSetupEnd(value: Double): Self = this.set("clusterSetupEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterSetupStart(value: Double): Self = this.set("clusterSetupStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoopExit(value: Double): Self = this.set("loopExit", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoopStart(value: Double): Self = this.set("loopStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleLoadEnd(value: Double): Self = this.set("moduleLoadEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setModuleLoadStart(value: Double): Self = this.set("moduleLoadStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeStart(value: Double): Self = this.set("nodeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreloadModuleLoadEnd(value: Double): Self = this.set("preloadModuleLoadEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreloadModuleLoadStart(value: Double): Self = this.set("preloadModuleLoadStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setThirdPartyMainEnd(value: Double): Self = this.set("thirdPartyMainEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setThirdPartyMainStart(value: Double): Self = this.set("thirdPartyMainStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setV8Start(value: Double): Self = this.set("v8Start", value.asInstanceOf[js.Any])
  }
  
}

