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

object Bucket {
  @scala.inline
  def apply(
    cacheHits: scala.Double,
    cacheMisses: scala.Double,
    failures: scala.Double,
    fallbacks: scala.Double,
    fires: scala.Double,
    latencyTimes: js.Array[scala.Double],
    percentiles: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    rejects: scala.Double,
    semaphoreRejections: scala.Double,
    successes: scala.Double,
    timeouts: scala.Double
  ): Bucket = {
    val __obj = js.Dynamic.literal(cacheHits = cacheHits, cacheMisses = cacheMisses, failures = failures, fallbacks = fallbacks, fires = fires, latencyTimes = latencyTimes, percentiles = percentiles, rejects = rejects, semaphoreRejections = semaphoreRejections, successes = successes, timeouts = timeouts)
  
    __obj.asInstanceOf[Bucket]
  }
}

