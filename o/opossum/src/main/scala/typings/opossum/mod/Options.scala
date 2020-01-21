package typings.opossum.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Determines whether to allow failures without opening the circuit during a brief warmup period (`rollingCountDuration`)
    * This can help in situations where no matter what your `errorThresholdPercentage` is, if the
    * first execution times out or fails, the circuit immediately opens.
    * @default false
    */
  var allowWarmUp: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the return value of the first successful execution of the circuit's function will be cached.
    * Once a value has been cached that value will be returned for every subsequent execution: the cache can be cleared using `clearCache`.
    * (The metrics cacheHit and cacheMiss reflect cache activity.)
    * @default false
    */
  var cache: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of concurrent requests allowed.
    * If the number currently executing function calls is equal to options.capacity, further calls
    * to `fire()` are rejected until at least one of the current requests completes.
    * @default MAX_SAFE_INTEGER
    */
  var capacity: js.UndefOr[Double] = js.undefined
  /**
    * Whether this circuit is enabled upon construction.
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional function that will be called when the circuit's function fails (returns a rejected Promise).
    * If this function returns truthy, the circuit's `failPure` statistics will not be incremented.
    * This is useful, for example, when you don't want HTTP 404 to trip the circuit, but still want to handle it as a failure case.
    */
  var errorFilter: js.UndefOr[js.Function0[Boolean]] = js.undefined
  /**
    * The error percentage at which to open the circuit and start short-circuiting requests to fallback.
    * @default 50
    */
  var errorThresholdPercentage: js.UndefOr[Double] = js.undefined
  /**
    * A grouping key for reporting.
    * Defaults to the computed value of `name`
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * The number of times the circuit can fail before opening.
    * @default 10
    * @deprecated see options.errorThresholdPercentage
    */
  var maxFailures: js.UndefOr[Double] = js.undefined
  /**
    * The circuit name to use when reporting stats.
    * Defaults to the name of the function this circuit controls then falls back to a UUID
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The time in milliseconds to wait before setting the breaker to `halfOpen` state, and trying the action again.
    * @default 30000 (30 seconds)
    */
  var resetTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Sets the number of buckets the rolling statistical window is divided into.
    * So, if options.rollingCountTimeout is 10,000, and options.rollingCountBuckets is 10, then the
    * statistical window will be 1,000 1 second snapshots in the statistical window.
    * @default 10
    */
  var rollingCountBuckets: js.UndefOr[Double] = js.undefined
  /**
    * Sets the duration of the statistical rolling window, in milliseconds.
    * This is how long Opossum keeps metrics for the circuit breaker to use and for publishing.
    * @default 10000
    */
  var rollingCountTimeout: js.UndefOr[Double] = js.undefined
  /**
    * This property indicates whether execution latencies should be tracked and calculated as percentiles.
    * If they are disabled, all summary statistics (mean, percentiles) are returned as -1.
    * @default false
    */
  var rollingPercentilesEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The time in milliseconds that action should be allowed to execute before timing out.
    * @default 10000 (10 seconds)
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * The minimum number of requests within the rolling statistical window that must exist before
    * the circuit breaker can open. This is similar to `allowWarmUp` in that no matter how many
    * failures there are, if the number of requests within the statistical window does not exceed
    * this threshold, the circuit will remain closed.
    * @default 0
    */
  var volumeThreshold: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    allowWarmUp: js.UndefOr[Boolean] = js.undefined,
    cache: js.UndefOr[Boolean] = js.undefined,
    capacity: Int | Double = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    errorFilter: () => Boolean = null,
    errorThresholdPercentage: Int | Double = null,
    group: String = null,
    maxFailures: Int | Double = null,
    name: String = null,
    resetTimeout: Int | Double = null,
    rollingCountBuckets: Int | Double = null,
    rollingCountTimeout: Int | Double = null,
    rollingPercentilesEnabled: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    volumeThreshold: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowWarmUp)) __obj.updateDynamic("allowWarmUp")(allowWarmUp.asInstanceOf[js.Any])
    if (!js.isUndefined(cache)) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (capacity != null) __obj.updateDynamic("capacity")(capacity.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (errorFilter != null) __obj.updateDynamic("errorFilter")(js.Any.fromFunction0(errorFilter))
    if (errorThresholdPercentage != null) __obj.updateDynamic("errorThresholdPercentage")(errorThresholdPercentage.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (maxFailures != null) __obj.updateDynamic("maxFailures")(maxFailures.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resetTimeout != null) __obj.updateDynamic("resetTimeout")(resetTimeout.asInstanceOf[js.Any])
    if (rollingCountBuckets != null) __obj.updateDynamic("rollingCountBuckets")(rollingCountBuckets.asInstanceOf[js.Any])
    if (rollingCountTimeout != null) __obj.updateDynamic("rollingCountTimeout")(rollingCountTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(rollingPercentilesEnabled)) __obj.updateDynamic("rollingPercentilesEnabled")(rollingPercentilesEnabled.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (volumeThreshold != null) __obj.updateDynamic("volumeThreshold")(volumeThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

