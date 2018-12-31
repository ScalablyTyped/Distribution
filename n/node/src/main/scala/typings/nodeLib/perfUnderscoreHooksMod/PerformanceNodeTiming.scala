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

