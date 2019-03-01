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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cacheHits")(cacheHits)
    __obj.updateDynamic("cacheMisses")(cacheMisses)
    __obj.updateDynamic("failures")(failures)
    __obj.updateDynamic("fallbacks")(fallbacks)
    __obj.updateDynamic("fires")(fires)
    __obj.updateDynamic("latencyMean")(latencyMean)
    __obj.updateDynamic("latencyTimes")(latencyTimes)
    __obj.updateDynamic("percentiles")(percentiles)
    __obj.updateDynamic("rejects")(rejects)
    __obj.updateDynamic("semaphoreRejections")(semaphoreRejections)
    __obj.updateDynamic("successes")(successes)
    __obj.updateDynamic("timeouts")(timeouts)
    __obj.asInstanceOf[Stats]
  }
}

