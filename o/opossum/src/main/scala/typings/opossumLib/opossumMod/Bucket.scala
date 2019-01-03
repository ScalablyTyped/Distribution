package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  var cacheHits: scala.Double
  var cacheMisses: scala.Double
  var failures: scala.Double
  var fallbacks: scala.Double
  var fires: scala.Double
  var latencyTimes: js.Array[scala.Double]
  var percentiles: org.scalablytyped.runtime.NumberDictionary[scala.Double]
  var rejects: scala.Double
  var semaphoreRejections: scala.Double
  var successes: scala.Double
  var timeouts: scala.Double
}

