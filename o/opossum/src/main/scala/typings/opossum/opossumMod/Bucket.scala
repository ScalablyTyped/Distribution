package typings.opossum.opossumMod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bucket extends js.Object {
  var cacheHits: Double
  var cacheMisses: Double
  var failures: Double
  var fallbacks: Double
  var fires: Double
  var latencyTimes: js.Array[Double]
  var percentiles: NumberDictionary[Double]
  var rejects: Double
  var semaphoreRejections: Double
  var successes: Double
  var timeouts: Double
}

object Bucket {
  @scala.inline
  def apply(
    cacheHits: Double,
    cacheMisses: Double,
    failures: Double,
    fallbacks: Double,
    fires: Double,
    latencyTimes: js.Array[Double],
    percentiles: NumberDictionary[Double],
    rejects: Double,
    semaphoreRejections: Double,
    successes: Double,
    timeouts: Double
  ): Bucket = {
    val __obj = js.Dynamic.literal(cacheHits = cacheHits, cacheMisses = cacheMisses, failures = failures, fallbacks = fallbacks, fires = fires, latencyTimes = latencyTimes, percentiles = percentiles, rejects = rejects, semaphoreRejections = semaphoreRejections, successes = successes, timeouts = timeouts)
  
    __obj.asInstanceOf[Bucket]
  }
}

