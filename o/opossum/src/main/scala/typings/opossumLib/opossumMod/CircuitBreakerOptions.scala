package typings
package opossumLib.opossumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircuitBreakerOptions extends js.Object {
  /**
    * Determines whether to allow failures without opening the circuit during a brief warmup period
    * This can help in situations where no matter what your `errorThresholdPercentage` is, if the
    * first execution times out or fails, the circuit immediately opens.
    * @default false
    */
  var allowWarmUp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, the value from the first call to `fire` will be cached an subsequent calls
    * will not execute the `action` function, but return the cached value instead.
    * @default false
    */
  var cache: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The number of concurrent requests allowed.
    * If the number currently executing function calls is equal to options.capacity, further calls
    * to `fire()` are rejected until at least one of the current requests completes.
    * @default MAX_SAFE_INTEGER
    */
  var capacity: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether this circuit is enabled upon construction.
    * @default true
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The error percentage at which to open the circuit and start short-circuiting requests to fallback.
    */
  var errorThresholdPercentage: js.UndefOr[scala.Double] = js.undefined
  /**
    * A grouping key for reporting.
    * Defaults to the computed value of options.name
    */
  var group: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The number of times the circuit can fail before opening.
    * @deprecated see options.errorThresholdPercentage
    */
  var maxFailures: js.UndefOr[scala.Double] = js.undefined
  /**
    * The circuit name to use when reporting stats.
    * Defaults to the name of the action function then falls back to a UUID
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The time in milliseconds to wait before setting the breaker to `halfOpen` state, and trying the action again.
    */
  var resetTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the number of buckets the rolling statistical window is divided into.
    * So, if options.rollingCountTimeout is 10,000, and options.rollingCountBuckets is 10, then the
    * statistical window will be 1,000 1 second snapshots in the statistical window.
    * @default 10
    */
  var rollingCountBuckets: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the duration of the statistical rolling window, in milliseconds.
    * This is how long Opossum keeps metrics for the circuit breaker to use and for publishing.
    * @default 10000
    */
  var rollingCountTimeout: js.UndefOr[scala.Double] = js.undefined
  /**
    * This property indicates whether execution latencies should be tracked and calculated as percentiles.
    * If they are disabled, all summary statistics (mean, percentiles) are returned as -1.
    * @default true
    */
  var rollingPercentilesEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The time in milliseconds that action should be allowed to execute before timing out.
    * Timeout can be disabled by setting this to `false`.
    */
  var timeout: js.UndefOr[scala.Double | opossumLib.opossumLibNumbers.`false`] = js.undefined
  /**
    * The minimum number of requests within the rolling statistical window that must exist before
    * the circuit breaker can open. This is similar to `allowWarmUp` in that no matter how many
    * failures there are, if the number of requests within the statistical window does not exceed
    * this threshold, the circuit will remain closed.
    * @default 0
    */
  var volumeThreshold: js.UndefOr[scala.Double] = js.undefined
}

object CircuitBreakerOptions {
  @scala.inline
  def apply(
    allowWarmUp: js.UndefOr[scala.Boolean] = js.undefined,
    cache: js.UndefOr[scala.Boolean] = js.undefined,
    capacity: scala.Int | scala.Double = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    errorThresholdPercentage: scala.Int | scala.Double = null,
    group: java.lang.String = null,
    maxFailures: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    resetTimeout: scala.Int | scala.Double = null,
    rollingCountBuckets: scala.Int | scala.Double = null,
    rollingCountTimeout: scala.Int | scala.Double = null,
    rollingPercentilesEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Double | opossumLib.opossumLibNumbers.`false` = null,
    volumeThreshold: scala.Int | scala.Double = null
  ): CircuitBreakerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWarmUp)) __obj.updateDynamic("allowWarmUp")(allowWarmUp)
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache)
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (errorThresholdPercentage != null) __obj.updateDynamic("errorThresholdPercentage")(errorThresholdPercentage.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group)
    if (maxFailures != null) __obj.updateDynamic("maxFailures")(maxFailures.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (resetTimeout != null) __obj.updateDynamic("resetTimeout")(resetTimeout.asInstanceOf[js.Any])
    if (rollingCountBuckets != null) __obj.updateDynamic("rollingCountBuckets")(rollingCountBuckets.asInstanceOf[js.Any])
    if (rollingCountTimeout != null) __obj.updateDynamic("rollingCountTimeout")(rollingCountTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rollingPercentilesEnabled)) __obj.updateDynamic("rollingPercentilesEnabled")(rollingPercentilesEnabled)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (volumeThreshold != null) __obj.updateDynamic("volumeThreshold")(volumeThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[CircuitBreakerOptions]
  }
}

