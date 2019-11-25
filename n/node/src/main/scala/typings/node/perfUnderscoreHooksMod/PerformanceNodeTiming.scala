package typings.node.perfUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceNodeTiming extends PerformanceEntry {
  /**
    * The high resolution millisecond timestamp at which the Node.js process completed bootstrap.
    */
  val bootstrapComplete: Double
  /**
    * The high resolution millisecond timestamp at which cluster processing ended.
    */
  val clusterSetupEnd: Double
  /**
    * The high resolution millisecond timestamp at which cluster processing started.
    */
  val clusterSetupStart: Double
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop exited.
    */
  val loopExit: Double
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop started.
    */
  val loopStart: Double
  /**
    * The high resolution millisecond timestamp at which main module load ended.
    */
  val moduleLoadEnd: Double
  /**
    * The high resolution millisecond timestamp at which main module load started.
    */
  val moduleLoadStart: Double
  /**
    * The high resolution millisecond timestamp at which the Node.js process was initialized.
    */
  val nodeStart: Double
  /**
    * The high resolution millisecond timestamp at which preload module load ended.
    */
  val preloadModuleLoadEnd: Double
  /**
    * The high resolution millisecond timestamp at which preload module load started.
    */
  val preloadModuleLoadStart: Double
  /**
    * The high resolution millisecond timestamp at which third_party_main processing ended.
    */
  val thirdPartyMainEnd: Double
  /**
    * The high resolution millisecond timestamp at which third_party_main processing started.
    */
  val thirdPartyMainStart: Double
  /**
    * The high resolution millisecond timestamp at which the V8 platform was initialized.
    */
  val v8Start: Double
}

object PerformanceNodeTiming {
  @scala.inline
  def apply(
    bootstrapComplete: Double,
    clusterSetupEnd: Double,
    clusterSetupStart: Double,
    duration: Double,
    entryType: java.lang.String,
    loopExit: Double,
    loopStart: Double,
    moduleLoadEnd: Double,
    moduleLoadStart: Double,
    name: java.lang.String,
    nodeStart: Double,
    preloadModuleLoadEnd: Double,
    preloadModuleLoadStart: Double,
    startTime: Double,
    thirdPartyMainEnd: Double,
    thirdPartyMainStart: Double,
    v8Start: Double,
    kind: Int | Double = null
  ): PerformanceNodeTiming = {
    val __obj = js.Dynamic.literal(bootstrapComplete = bootstrapComplete.asInstanceOf[js.Any], clusterSetupEnd = clusterSetupEnd.asInstanceOf[js.Any], clusterSetupStart = clusterSetupStart.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], loopExit = loopExit.asInstanceOf[js.Any], loopStart = loopStart.asInstanceOf[js.Any], moduleLoadEnd = moduleLoadEnd.asInstanceOf[js.Any], moduleLoadStart = moduleLoadStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nodeStart = nodeStart.asInstanceOf[js.Any], preloadModuleLoadEnd = preloadModuleLoadEnd.asInstanceOf[js.Any], preloadModuleLoadStart = preloadModuleLoadStart.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], thirdPartyMainEnd = thirdPartyMainEnd.asInstanceOf[js.Any], thirdPartyMainStart = thirdPartyMainStart.asInstanceOf[js.Any], v8Start = v8Start.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNodeTiming]
  }
}

