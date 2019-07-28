package typings.opossum.opossumMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends Bucket {
  var latencyMean: Double
}

object Stats {
  @scala.inline
  def apply(
    cacheHits: Double,
    cacheMisses: Double,
    failures: Double,
    fallbacks: Double,
    fires: Double,
    latencyMean: Double,
    latencyTimes: js.Array[Double],
    percentiles: NumberDictionary[Double],
    rejects: Double,
    semaphoreRejections: Double,
    successes: Double,
    timeouts: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(cacheHits = cacheHits, cacheMisses = cacheMisses, failures = failures, fallbacks = fallbacks, fires = fires, latencyMean = latencyMean, latencyTimes = latencyTimes, percentiles = percentiles, rejects = rejects, semaphoreRejections = semaphoreRejections, successes = successes, timeouts = timeouts)
  
    __obj.asInstanceOf[Stats]
  }
}

