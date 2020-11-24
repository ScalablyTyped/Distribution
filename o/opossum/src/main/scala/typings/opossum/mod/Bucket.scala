package typings.opossum.mod

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bucket extends js.Object {
  
  var cacheHits: Double = js.native
  
  var cacheMisses: Double = js.native
  
  var failures: Double = js.native
  
  var fallbacks: Double = js.native
  
  var fires: Double = js.native
  
  var latencyTimes: js.Array[Double] = js.native
  
  var percentiles: NumberDictionary[Double] = js.native
  
  var rejects: Double = js.native
  
  var semaphoreRejections: Double = js.native
  
  var successes: Double = js.native
  
  var timeouts: Double = js.native
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
    val __obj = js.Dynamic.literal(cacheHits = cacheHits.asInstanceOf[js.Any], cacheMisses = cacheMisses.asInstanceOf[js.Any], failures = failures.asInstanceOf[js.Any], fallbacks = fallbacks.asInstanceOf[js.Any], fires = fires.asInstanceOf[js.Any], latencyTimes = latencyTimes.asInstanceOf[js.Any], percentiles = percentiles.asInstanceOf[js.Any], rejects = rejects.asInstanceOf[js.Any], semaphoreRejections = semaphoreRejections.asInstanceOf[js.Any], successes = successes.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bucket]
  }
  
  @scala.inline
  implicit class BucketOps[Self <: Bucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCacheHits(value: Double): Self = this.set("cacheHits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheMisses(value: Double): Self = this.set("cacheMisses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailures(value: Double): Self = this.set("failures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFallbacks(value: Double): Self = this.set("fallbacks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFires(value: Double): Self = this.set("fires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatencyTimesVarargs(value: Double*): Self = this.set("latencyTimes", js.Array(value :_*))
    
    @scala.inline
    def setLatencyTimes(value: js.Array[Double]): Self = this.set("latencyTimes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPercentiles(value: NumberDictionary[Double]): Self = this.set("percentiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejects(value: Double): Self = this.set("rejects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemaphoreRejections(value: Double): Self = this.set("semaphoreRejections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccesses(value: Double): Self = this.set("successes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeouts(value: Double): Self = this.set("timeouts", value.asInstanceOf[js.Any])
  }
}
