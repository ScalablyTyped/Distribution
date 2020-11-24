package typings.opossum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Determines whether to allow failures without opening the circuit during a brief warmup period (`rollingCountDuration`)
    * This can help in situations where no matter what your `errorThresholdPercentage` is, if the
    * first execution times out or fails, the circuit immediately opens.
    * @default false
    */
  var allowWarmUp: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the return value of the first successful execution of the circuit's function will be cached.
    * Once a value has been cached that value will be returned for every subsequent execution: the cache can be cleared using `clearCache`.
    * (The metrics cacheHit and cacheMiss reflect cache activity.)
    * @default false
    */
  var cache: js.UndefOr[Boolean] = js.native
  
  /**
    * The number of concurrent requests allowed.
    * If the number currently executing function calls is equal to options.capacity, further calls
    * to `fire()` are rejected until at least one of the current requests completes.
    * @default MAX_SAFE_INTEGER
    */
  var capacity: js.UndefOr[Double] = js.native
  
  /**
    * Whether this circuit is enabled upon construction.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * An optional function that will be called when the circuit's function fails (returns a rejected Promise).
    * If this function returns truthy, the circuit's `failPure` statistics will not be incremented.
    * This is useful, for example, when you don't want HTTP 404 to trip the circuit, but still want to handle it as a failure case.
    */
  var errorFilter: js.UndefOr[js.Function1[/* err */ js.Any, Boolean]] = js.native
  
  /**
    * The error percentage at which to open the circuit and start short-circuiting requests to fallback.
    * @default 50
    */
  var errorThresholdPercentage: js.UndefOr[Double] = js.native
  
  /**
    * A grouping key for reporting.
    * Defaults to the computed value of `name`
    */
  var group: js.UndefOr[String] = js.native
  
  /**
    * The number of times the circuit can fail before opening.
    * @default 10
    * @deprecated see options.errorThresholdPercentage
    */
  var maxFailures: js.UndefOr[Double] = js.native
  
  /**
    * The circuit name to use when reporting stats.
    * Defaults to the name of the function this circuit controls then falls back to a UUID
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * The time in milliseconds to wait before setting the breaker to `halfOpen` state, and trying the action again.
    * @default 30000 (30 seconds)
    */
  var resetTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Sets the number of buckets the rolling statistical window is divided into.
    * So, if options.rollingCountTimeout is 10,000, and options.rollingCountBuckets is 10, then the
    * statistical window will be 1,000 1 second snapshots in the statistical window.
    * @default 10
    */
  var rollingCountBuckets: js.UndefOr[Double] = js.native
  
  /**
    * Sets the duration of the statistical rolling window, in milliseconds.
    * This is how long Opossum keeps metrics for the circuit breaker to use and for publishing.
    * @default 10000
    */
  var rollingCountTimeout: js.UndefOr[Double] = js.native
  
  /**
    * This property indicates whether execution latencies should be tracked and calculated as percentiles.
    * If they are disabled, all summary statistics (mean, percentiles) are returned as -1.
    * @default false
    */
  var rollingPercentilesEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * The time in milliseconds that action should be allowed to execute before timing out.
    * @default 10000 (10 seconds)
    */
  var timeout: js.UndefOr[Double] = js.native
  
  /**
    * The minimum number of requests within the rolling statistical window that must exist before
    * the circuit breaker can open. This is similar to `allowWarmUp` in that no matter how many
    * failures there are, if the number of requests within the statistical window does not exceed
    * this threshold, the circuit will remain closed.
    * @default 0
    */
  var volumeThreshold: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAllowWarmUp(value: Boolean): Self = this.set("allowWarmUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowWarmUp: Self = this.set("allowWarmUp", js.undefined)
    
    @scala.inline
    def setCache(value: Boolean): Self = this.set("cache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    
    @scala.inline
    def setCapacity(value: Double): Self = this.set("capacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCapacity: Self = this.set("capacity", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setErrorFilter(value: /* err */ js.Any => Boolean): Self = this.set("errorFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorFilter: Self = this.set("errorFilter", js.undefined)
    
    @scala.inline
    def setErrorThresholdPercentage(value: Double): Self = this.set("errorThresholdPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorThresholdPercentage: Self = this.set("errorThresholdPercentage", js.undefined)
    
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setMaxFailures(value: Double): Self = this.set("maxFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxFailures: Self = this.set("maxFailures", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setResetTimeout(value: Double): Self = this.set("resetTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetTimeout: Self = this.set("resetTimeout", js.undefined)
    
    @scala.inline
    def setRollingCountBuckets(value: Double): Self = this.set("rollingCountBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollingCountBuckets: Self = this.set("rollingCountBuckets", js.undefined)
    
    @scala.inline
    def setRollingCountTimeout(value: Double): Self = this.set("rollingCountTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollingCountTimeout: Self = this.set("rollingCountTimeout", js.undefined)
    
    @scala.inline
    def setRollingPercentilesEnabled(value: Boolean): Self = this.set("rollingPercentilesEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollingPercentilesEnabled: Self = this.set("rollingPercentilesEnabled", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setVolumeThreshold(value: Double): Self = this.set("volumeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeThreshold: Self = this.set("volumeThreshold", js.undefined)
  }
}
