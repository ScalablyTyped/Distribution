package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends Bucket {
  var latencyMean: scala.Double
}

object Stats {
  @scala.inline
  def apply(
    cacheHits: scala.Double,
    cacheMisses: scala.Double,
    failures: scala.Double,
    fallbacks: scala.Double,
    fires: scala.Double,
    latencyMean: scala.Double,
    latencyTimes: js.Array[scala.Double],
    percentiles: org.scalablytyped.runtime.NumberDictionary[scala.Double],
    rejects: scala.Double,
    semaphoreRejections: scala.Double,
    successes: scala.Double,
    timeouts: scala.Double
  ): Stats = {
    val __obj = js.Dynamic.literal(cacheHits = cacheHits, cacheMisses = cacheMisses, failures = failures, fallbacks = fallbacks, fires = fires, latencyMean = latencyMean, latencyTimes = latencyTimes, percentiles = percentiles, rejects = rejects, semaphoreRejections = semaphoreRejections, successes = successes, timeouts = timeouts)
  
    __obj.asInstanceOf[Stats]
  }
}

