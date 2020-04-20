package typings.opossum.mod

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
    val __obj = js.Dynamic.literal(cacheHits = cacheHits.asInstanceOf[js.Any], cacheMisses = cacheMisses.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], fallbacks = fallbacks.asInstanceOf[js.Any], fires = fires.asInstanceOf[js.Any], latencyMean = latencyMean.asInstanceOf[js.Any], latencyTimes = latencyTimes.asInstanceOf[js.Any], percentiles = percentiles.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], semaphoreRejections = semaphoreRejections.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

