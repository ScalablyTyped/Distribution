package typings.opossum

import org.scalablytyped.runtime.NumberDictionary
import typings.node.eventsMod.EventEmitter
import typings.opossum.opossumStrings.cacheHit
import typings.opossum.opossumStrings.cacheMiss
import typings.opossum.opossumStrings.close
import typings.opossum.opossumStrings.failure
import typings.opossum.opossumStrings.fallback
import typings.opossum.opossumStrings.fire
import typings.opossum.opossumStrings.healthCheckFailed
import typings.opossum.opossumStrings.open
import typings.opossum.opossumStrings.reject
import typings.opossum.opossumStrings.semaphoreLocked
import typings.opossum.opossumStrings.shutdown
import typings.opossum.opossumStrings.snapshot
import typings.opossum.opossumStrings.success
import typings.opossum.opossumStrings.timeout
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("opossum", JSImport.Namespace)
  @js.native
  class ^[TI /* <: js.Array[js.Any] */, TR] protected () extends CircuitBreaker[TI, TR] {
    def this(action: js.Function1[/* args */ TI, js.Promise[TR]]) = this()
    def this(action: js.Function1[/* args */ TI, js.Promise[TR]], options: Options) = this()
  }
  @JSImport("opossum", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def isOurError(error: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOurError")(error.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Bucket extends StObject {
    
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
    
    inline def apply(
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
    
    extension [Self <: Bucket](x: Self) {
      
      inline def setCacheHits(value: Double): Self = StObject.set(x, "cacheHits", value.asInstanceOf[js.Any])
      
      inline def setCacheMisses(value: Double): Self = StObject.set(x, "cacheMisses", value.asInstanceOf[js.Any])
      
      inline def setFailures(value: Double): Self = StObject.set(x, "failures", value.asInstanceOf[js.Any])
      
      inline def setFallbacks(value: Double): Self = StObject.set(x, "fallbacks", value.asInstanceOf[js.Any])
      
      inline def setFires(value: Double): Self = StObject.set(x, "fires", value.asInstanceOf[js.Any])
      
      inline def setLatencyTimes(value: js.Array[Double]): Self = StObject.set(x, "latencyTimes", value.asInstanceOf[js.Any])
      
      inline def setLatencyTimesVarargs(value: Double*): Self = StObject.set(x, "latencyTimes", js.Array(value :_*))
      
      inline def setPercentiles(value: NumberDictionary[Double]): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
      
      inline def setRejects(value: Double): Self = StObject.set(x, "rejects", value.asInstanceOf[js.Any])
      
      inline def setSemaphoreRejections(value: Double): Self = StObject.set(x, "semaphoreRejections", value.asInstanceOf[js.Any])
      
      inline def setSuccesses(value: Double): Self = StObject.set(x, "successes", value.asInstanceOf[js.Any])
      
      inline def setTimeouts(value: Double): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CircuitBreaker[TI /* <: js.Array[js.Any] */, TR] extends EventEmitter {
    
    /**
      * Clears the cache of this CircuitBreaker
      */
    def clearCache(): Unit = js.native
    
    /**
      * Closes the breaker, allowing the action to execute again
      */
    def close(): Unit = js.native
    
    val closed: Boolean = js.native
    
    /**
      * Disables this circuit, causing all calls to the circuit's function to be
      * executed without circuit or fallback protection.
      */
    def disable(): Unit = js.native
    
    /**
      * Enables this circuit. If the circuit is the disabled state, it will be re-enabled.
      * If not, this is essentially a noop.
      */
    def enable(): Unit = js.native
    
    val enabled: Boolean = js.native
    
    /**
      * Provide a fallback function for this CircuitBreaker.
      * This function will be executed when the circuit is fired and fails.
      * It will always be preceded by a `failure` event, and `breaker.fire` returns a rejected Promise.
      */
    def fallback(func: js.Function1[/* repeated */ js.Any, js.Any]): this.type = js.native
    def fallback(func: CircuitBreaker[js.Array[js.Any], js.Any]): this.type = js.native
    
    /**
      * Execute the action for this circuit.
      * If the action fails or times out, the returned promise will be rejected.
      * If the action succeeds, the promise will resolve with the resolved value from action.
      * If a fallback function was provided, it will be invoked in the event of any failure or timeout.
      */
    def fire(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TI is not an array type */ args: TI
    ): js.Promise[TR] = js.native
    
    val group: String = js.native
    
    val halfOpen: Boolean = js.native
    
    /**
      * Provide a health check function to be called periodically.
      * The function should return a Promise. If the promise is rejected the circuit will open.
      * This is in addition to the existing circuit behavior as defined by the
      * `errorThresholdPercentage` option passed to the constructor.
      * For example, if the health check function provided here always returns a resolved promise,
      * the circuit can still trip and open if there are failures exceeding the configured threshold.
      * The health check function is executed within the circuit breaker's execution context,
      * so this within the function is the circuit breaker itself.
      *
      * The interval is the amount of time between calls to the health check function.
      * Default: 5000 (5 seconds)
      */
    def healthCheck(func: js.Function0[js.Promise[Unit]]): Unit = js.native
    def healthCheck(func: js.Function0[js.Promise[Unit]], interval: Double): Unit = js.native
    
    val isShutdown: Boolean = js.native
    
    val name: String = js.native
    
    @JSName("on")
    def on_cacheHit(event: cacheHit, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_cacheMiss(event: cacheMiss, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_failure(
      event: failure,
      listener: js.Function3[/* err */ Error, /* latencyMs */ Double, /* args */ TI, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_fallback(event: fallback, listener: js.Function2[/* result */ js.Any, /* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_fire(event: fire, listener: js.Function1[/* args */ TI, Unit]): this.type = js.native
    /* tslint:disable:unified-signatures */
    @JSName("on")
    def on_halfOpen(
      event: typings.opossum.opossumStrings.halfOpen,
      listener: js.Function1[/* resetTimeout */ Double, Unit]
    ): this.type = js.native
    @JSName("on")
    def on_healthCheckFailed(event: healthCheckFailed, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_open(event: open, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_reject(event: reject, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_semaphoreLocked(event: semaphoreLocked, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    @JSName("on")
    def on_shutdown(event: shutdown, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_success(event: success, listener: js.Function2[/* result */ TR, /* latencyMs */ Double, Unit]): this.type = js.native
    @JSName("on")
    def on_timeout(event: timeout, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
    
    /**
      * Opens the breaker.
      * Each time the breaker is fired while the circuit is opened, a failed Promise is
      * returned, or if any fallback function has been provided, it is invoked.
      */
    def open(): Unit = js.native
    
    val opened: Boolean = js.native
    
    val pendingClose: Boolean = js.native
    
    /**
      * Shuts down this circuit breaker.
      * All subsequent calls to the circuit will fail, returning a rejected promise.
      */
    def shutdown(): Unit = js.native
    
    val stats: Stats = js.native
    
    val status: Status = js.native
    
    val volumeThreshold: Double = js.native
    
    val warmUp: Boolean = js.native
  }
  
  trait Options extends StObject {
    
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
    var errorFilter: js.UndefOr[js.Function1[/* err */ js.Any, Boolean]] = js.undefined
    
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
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAllowWarmUp(value: Boolean): Self = StObject.set(x, "allowWarmUp", value.asInstanceOf[js.Any])
      
      inline def setAllowWarmUpUndefined: Self = StObject.set(x, "allowWarmUp", js.undefined)
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCapacity(value: Double): Self = StObject.set(x, "capacity", value.asInstanceOf[js.Any])
      
      inline def setCapacityUndefined: Self = StObject.set(x, "capacity", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setErrorFilter(value: /* err */ js.Any => Boolean): Self = StObject.set(x, "errorFilter", js.Any.fromFunction1(value))
      
      inline def setErrorFilterUndefined: Self = StObject.set(x, "errorFilter", js.undefined)
      
      inline def setErrorThresholdPercentage(value: Double): Self = StObject.set(x, "errorThresholdPercentage", value.asInstanceOf[js.Any])
      
      inline def setErrorThresholdPercentageUndefined: Self = StObject.set(x, "errorThresholdPercentage", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setMaxFailures(value: Double): Self = StObject.set(x, "maxFailures", value.asInstanceOf[js.Any])
      
      inline def setMaxFailuresUndefined: Self = StObject.set(x, "maxFailures", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setResetTimeout(value: Double): Self = StObject.set(x, "resetTimeout", value.asInstanceOf[js.Any])
      
      inline def setResetTimeoutUndefined: Self = StObject.set(x, "resetTimeout", js.undefined)
      
      inline def setRollingCountBuckets(value: Double): Self = StObject.set(x, "rollingCountBuckets", value.asInstanceOf[js.Any])
      
      inline def setRollingCountBucketsUndefined: Self = StObject.set(x, "rollingCountBuckets", js.undefined)
      
      inline def setRollingCountTimeout(value: Double): Self = StObject.set(x, "rollingCountTimeout", value.asInstanceOf[js.Any])
      
      inline def setRollingCountTimeoutUndefined: Self = StObject.set(x, "rollingCountTimeout", js.undefined)
      
      inline def setRollingPercentilesEnabled(value: Boolean): Self = StObject.set(x, "rollingPercentilesEnabled", value.asInstanceOf[js.Any])
      
      inline def setRollingPercentilesEnabledUndefined: Self = StObject.set(x, "rollingPercentilesEnabled", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setVolumeThreshold(value: Double): Self = StObject.set(x, "volumeThreshold", value.asInstanceOf[js.Any])
      
      inline def setVolumeThresholdUndefined: Self = StObject.set(x, "volumeThreshold", js.undefined)
    }
  }
  
  trait Stats
    extends StObject
       with Bucket {
    
    var latencyMean: Double
  }
  object Stats {
    
    inline def apply(
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
    
    extension [Self <: Stats](x: Self) {
      
      inline def setLatencyMean(value: Double): Self = StObject.set(x, "latencyMean", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Status extends EventEmitter {
    
    @JSName("on")
    def on_snapshot(event: snapshot, listener: js.Function1[/* snapshot */ Stats, Unit]): this.type = js.native
    
    var stats: Stats = js.native
    
    var window: Window = js.native
  }
  
  type Window = js.Array[Bucket]
}
