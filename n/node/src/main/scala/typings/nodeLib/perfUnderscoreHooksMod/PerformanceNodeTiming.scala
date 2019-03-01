package typings
package nodeLib.perfUnderscoreHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceNodeTiming extends PerformanceEntry {
  /**
    * The high resolution millisecond timestamp at which the Node.js process completed bootstrap.
    */
  val bootstrapComplete: scala.Double
  /**
    * The high resolution millisecond timestamp at which cluster processing ended.
    */
  val clusterSetupEnd: scala.Double
  /**
    * The high resolution millisecond timestamp at which cluster processing started.
    */
  val clusterSetupStart: scala.Double
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop exited.
    */
  val loopExit: scala.Double
  /**
    * The high resolution millisecond timestamp at which the Node.js event loop started.
    */
  val loopStart: scala.Double
  /**
    * The high resolution millisecond timestamp at which main module load ended.
    */
  val moduleLoadEnd: scala.Double
  /**
    * The high resolution millisecond timestamp at which main module load started.
    */
  val moduleLoadStart: scala.Double
  /**
    * The high resolution millisecond timestamp at which the Node.js process was initialized.
    */
  val nodeStart: scala.Double
  /**
    * The high resolution millisecond timestamp at which preload module load ended.
    */
  val preloadModuleLoadEnd: scala.Double
  /**
    * The high resolution millisecond timestamp at which preload module load started.
    */
  val preloadModuleLoadStart: scala.Double
  /**
    * The high resolution millisecond timestamp at which third_party_main processing ended.
    */
  val thirdPartyMainEnd: scala.Double
  /**
    * The high resolution millisecond timestamp at which third_party_main processing started.
    */
  val thirdPartyMainStart: scala.Double
  /**
    * The high resolution millisecond timestamp at which the V8 platform was initialized.
    */
  val v8Start: scala.Double
}

object PerformanceNodeTiming {
  @scala.inline
  def apply(
    bootstrapComplete: scala.Double,
    clusterSetupEnd: scala.Double,
    clusterSetupStart: scala.Double,
    duration: scala.Double,
    entryType: java.lang.String,
    loopExit: scala.Double,
    loopStart: scala.Double,
    moduleLoadEnd: scala.Double,
    moduleLoadStart: scala.Double,
    name: java.lang.String,
    nodeStart: scala.Double,
    preloadModuleLoadEnd: scala.Double,
    preloadModuleLoadStart: scala.Double,
    startTime: scala.Double,
    thirdPartyMainEnd: scala.Double,
    thirdPartyMainStart: scala.Double,
    v8Start: scala.Double,
    kind: scala.Int | scala.Double = null
  ): PerformanceNodeTiming = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bootstrapComplete")(bootstrapComplete)
    __obj.updateDynamic("clusterSetupEnd")(clusterSetupEnd)
    __obj.updateDynamic("clusterSetupStart")(clusterSetupStart)
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("entryType")(entryType)
    __obj.updateDynamic("loopExit")(loopExit)
    __obj.updateDynamic("loopStart")(loopStart)
    __obj.updateDynamic("moduleLoadEnd")(moduleLoadEnd)
    __obj.updateDynamic("moduleLoadStart")(moduleLoadStart)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("nodeStart")(nodeStart)
    __obj.updateDynamic("preloadModuleLoadEnd")(preloadModuleLoadEnd)
    __obj.updateDynamic("preloadModuleLoadStart")(preloadModuleLoadStart)
    __obj.updateDynamic("startTime")(startTime)
    __obj.updateDynamic("thirdPartyMainEnd")(thirdPartyMainEnd)
    __obj.updateDynamic("thirdPartyMainStart")(thirdPartyMainStart)
    __obj.updateDynamic("v8Start")(v8Start)
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerformanceNodeTiming]
  }
}

