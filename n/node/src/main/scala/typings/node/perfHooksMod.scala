package typings.node

import typings.node.anon.Buffered
import typings.node.anon.BufferedType
import typings.node.nodeAsyncHooksMod.AsyncResource
import typings.node.nodeInts.`0`
import typings.node.nodeStrings.mark
import typings.node.nodeStrings.measure
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perfHooksMod {
  
  @JSImport("perf_hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @since v8.5.0
    */
  @JSImport("perf_hooks", "PerformanceEntry")
  @js.native
  /* protected */ open class PerformanceEntry () extends StObject {
    
    /**
      * Additional detail specific to the `entryType`.
      * @since v16.0.0
      */
    val detail: js.UndefOr[NodeGCPerformanceDetail | Any] = js.native
    
    /**
      * The total number of milliseconds elapsed for this entry. This value will not
      * be meaningful for all Performance Entry types.
      * @since v8.5.0
      */
    val duration: Double = js.native
    
    /**
      * The type of the performance entry. It may be one of:
      *
      * * `'node'` (Node.js only)
      * * `'mark'` (available on the Web)
      * * `'measure'` (available on the Web)
      * * `'gc'` (Node.js only)
      * * `'function'` (Node.js only)
      * * `'http2'` (Node.js only)
      * * `'http'` (Node.js only)
      * @since v8.5.0
      */
    val entryType: EntryType = js.native
    
    /**
      * The name of the performance entry.
      * @since v8.5.0
      */
    val name: String = js.native
    
    /**
      * The high resolution millisecond timestamp marking the starting time of the
      * Performance Entry.
      * @since v8.5.0
      */
    val startTime: Double = js.native
    
    // TODO: Narrow this based on entry type.
    def toJSON(): Any = js.native
  }
  
  @JSImport("perf_hooks", "PerformanceMark")
  @js.native
  /* protected */ open class PerformanceMark () extends PerformanceEntry {
    
    @JSName("duration")
    val duration_PerformanceMark: `0` = js.native
    
    @JSName("entryType")
    val entryType_PerformanceMark: mark = js.native
  }
  
  @JSImport("perf_hooks", "PerformanceMeasure")
  @js.native
  /* protected */ open class PerformanceMeasure () extends PerformanceEntry {
    
    @JSName("entryType")
    val entryType_PerformanceMeasure: measure = js.native
  }
  
  /**
    * _This property is an extension by Node.js. It is not available in Web browsers._
    *
    * Provides timing details for Node.js itself. The constructor of this class
    * is not exposed to users.
    * @since v8.5.0
    */
  @JSImport("perf_hooks", "PerformanceNodeTiming")
  @js.native
  /* protected */ open class PerformanceNodeTiming () extends PerformanceEntry {
    
    /**
      * The high resolution millisecond timestamp at which the Node.js process
      * completed bootstrapping. If bootstrapping has not yet finished, the property
      * has the value of -1.
      * @since v8.5.0
      */
    val bootstrapComplete: Double = js.native
    
    /**
      * The high resolution millisecond timestamp at which the Node.js environment was
      * initialized.
      * @since v8.5.0
      */
    val environment: Double = js.native
    
    /**
      * The high resolution millisecond timestamp of the amount of time the event loop
      * has been idle within the event loop's event provider (e.g. `epoll_wait`). This
      * does not take CPU usage into consideration. If the event loop has not yet
      * started (e.g., in the first tick of the main script), the property has the
      * value of 0.
      * @since v14.10.0, v12.19.0
      */
    val idleTime: Double = js.native
    
    /**
      * The high resolution millisecond timestamp at which the Node.js event loop
      * exited. If the event loop has not yet exited, the property has the value of -1\.
      * It can only have a value of not -1 in a handler of the `'exit'` event.
      * @since v8.5.0
      */
    val loopExit: Double = js.native
    
    /**
      * The high resolution millisecond timestamp at which the Node.js event loop
      * started. If the event loop has not yet started (e.g., in the first tick of the
      * main script), the property has the value of -1.
      * @since v8.5.0
      */
    val loopStart: Double = js.native
    
    /**
      * The high resolution millisecond timestamp at which the V8 platform was
      * initialized.
      * @since v8.5.0
      */
    val v8Start: Double = js.native
  }
  
  @JSImport("perf_hooks", "PerformanceObserver")
  @js.native
  open class PerformanceObserver protected () extends AsyncResource {
    def this(callback: PerformanceObserverCallback) = this()
    
    /**
      * Disconnects the `PerformanceObserver` instance from all notifications.
      * @since v8.5.0
      */
    def disconnect(): Unit = js.native
    
    /**
      * Subscribes the `PerformanceObserver` instance to notifications of new `PerformanceEntry` instances identified either by `options.entryTypes`or `options.type`:
      *
      * ```js
      * const {
      *   performance,
      *   PerformanceObserver
      * } = require('perf_hooks');
      *
      * const obs = new PerformanceObserver((list, observer) => {
      *   // Called once asynchronously. `list` contains three items.
      * });
      * obs.observe({ type: 'mark' });
      *
      * for (let n = 0; n < 3; n++)
      *   performance.mark(`test${n}`);
      * ```
      * @since v8.5.0
      */
    def observe(options: Buffered): Unit = js.native
    def observe(options: BufferedType): Unit = js.native
  }
  
  object constants {
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_ALL_AVAILABLE_GARBAGE")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_ALL_AVAILABLE_GARBAGE: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_ALL_EXTERNAL_MEMORY")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_ALL_EXTERNAL_MEMORY: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_CONSTRUCT_RETAINED")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_CONSTRUCT_RETAINED: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_FORCED")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_FORCED: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_NO")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_NO: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_SCHEDULE_IDLE")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_SCHEDULE_IDLE: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_SYNCHRONOUS_PHANTOM_PROCESSING")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_SYNCHRONOUS_PHANTOM_PROCESSING: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_INCREMENTAL")
    @js.native
    val NODE_PERFORMANCE_GC_INCREMENTAL: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_MAJOR")
    @js.native
    val NODE_PERFORMANCE_GC_MAJOR: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_MINOR")
    @js.native
    val NODE_PERFORMANCE_GC_MINOR: Double = js.native
    
    @JSImport("perf_hooks", "constants.NODE_PERFORMANCE_GC_WEAKCB")
    @js.native
    val NODE_PERFORMANCE_GC_WEAKCB: Double = js.native
  }
  
  /**
    * Returns a `RecordableHistogram`.
    * @since v15.9.0, v14.18.0
    */
  inline def createHistogram(): RecordableHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("createHistogram")().asInstanceOf[RecordableHistogram]
  inline def createHistogram(options: CreateHistogramOptions): RecordableHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("createHistogram")(options.asInstanceOf[js.Any]).asInstanceOf[RecordableHistogram]
  
  /**
    * _This property is an extension by Node.js. It is not available in Web browsers._
    *
    * Creates an `IntervalHistogram` object that samples and reports the event loop
    * delay over time. The delays will be reported in nanoseconds.
    *
    * Using a timer to detect approximate event loop delay works because the
    * execution of timers is tied specifically to the lifecycle of the libuv
    * event loop. That is, a delay in the loop will cause a delay in the execution
    * of the timer, and those delays are specifically what this API is intended to
    * detect.
    *
    * ```js
    * const { monitorEventLoopDelay } = require('perf_hooks');
    * const h = monitorEventLoopDelay({ resolution: 20 });
    * h.enable();
    * // Do something.
    * h.disable();
    * console.log(h.min);
    * console.log(h.max);
    * console.log(h.mean);
    * console.log(h.stddev);
    * console.log(h.percentiles);
    * console.log(h.percentile(50));
    * console.log(h.percentile(99));
    * ```
    * @since v11.10.0
    */
  inline def monitorEventLoopDelay(): IntervalHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorEventLoopDelay")().asInstanceOf[IntervalHistogram]
  inline def monitorEventLoopDelay(options: EventLoopMonitorOptions): IntervalHistogram = ^.asInstanceOf[js.Dynamic].applyDynamic("monitorEventLoopDelay")(options.asInstanceOf[js.Any]).asInstanceOf[IntervalHistogram]
  
  @JSImport("perf_hooks", "performance")
  @js.native
  val performance: Performance_ = js.native
  
  trait CreateHistogramOptions extends StObject {
    
    /**
      * The number of accuracy digits. Must be a number between 1 and 5.
      * @default 3
      */
    var figures: js.UndefOr[Double] = js.undefined
    
    /**
      * The maximum recordable value. Must be an integer value greater than min.
      * @default Number.MAX_SAFE_INTEGER
      */
    var max: js.UndefOr[Double | js.BigInt] = js.undefined
    
    /**
      * The minimum recordable value. Must be an integer value greater than 0.
      * @default 1
      */
    var min: js.UndefOr[Double | js.BigInt] = js.undefined
  }
  object CreateHistogramOptions {
    
    inline def apply(): CreateHistogramOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateHistogramOptions]
    }
    
    extension [Self <: CreateHistogramOptions](x: Self) {
      
      inline def setFigures(value: Double): Self = StObject.set(x, "figures", value.asInstanceOf[js.Any])
      
      inline def setFiguresUndefined: Self = StObject.set(x, "figures", js.undefined)
      
      inline def setMax(value: Double | js.BigInt): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double | js.BigInt): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.nodeStrings.node
    - typings.node.nodeStrings.mark
    - typings.node.nodeStrings.measure
    - typings.node.nodeStrings.gc
    - typings.node.nodeStrings.function
    - typings.node.nodeStrings.http2
    - typings.node.nodeStrings.http
  */
  trait EntryType extends StObject
  object EntryType {
    
    inline def function: typings.node.nodeStrings.function = "function".asInstanceOf[typings.node.nodeStrings.function]
    
    inline def gc: typings.node.nodeStrings.gc = "gc".asInstanceOf[typings.node.nodeStrings.gc]
    
    inline def http: typings.node.nodeStrings.http = "http".asInstanceOf[typings.node.nodeStrings.http]
    
    inline def http2: typings.node.nodeStrings.http2 = "http2".asInstanceOf[typings.node.nodeStrings.http2]
    
    inline def mark: typings.node.nodeStrings.mark = "mark".asInstanceOf[typings.node.nodeStrings.mark]
    
    inline def measure: typings.node.nodeStrings.measure = "measure".asInstanceOf[typings.node.nodeStrings.measure]
    
    inline def node: typings.node.nodeStrings.node = "node".asInstanceOf[typings.node.nodeStrings.node]
  }
  
  trait EventLoopMonitorOptions extends StObject {
    
    /**
      * The sampling rate in milliseconds.
      * Must be greater than zero.
      * @default 10
      */
    var resolution: js.UndefOr[Double] = js.undefined
  }
  object EventLoopMonitorOptions {
    
    inline def apply(): EventLoopMonitorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventLoopMonitorOptions]
    }
    
    extension [Self <: EventLoopMonitorOptions](x: Self) {
      
      inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    }
  }
  
  /**
    * @param util1 The result of a previous call to eventLoopUtilization()
    * @param util2 The result of a previous call to eventLoopUtilization() prior to util1
    */
  type EventLoopUtilityFunction = js.Function2[
    /* util1 */ js.UndefOr[EventLoopUtilization], 
    /* util2 */ js.UndefOr[EventLoopUtilization], 
    EventLoopUtilization
  ]
  
  trait EventLoopUtilization extends StObject {
    
    var active: Double
    
    var idle: Double
    
    var utilization: Double
  }
  object EventLoopUtilization {
    
    inline def apply(active: Double, idle: Double, utilization: Double): EventLoopUtilization = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], utilization = utilization.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventLoopUtilization]
    }
    
    extension [Self <: EventLoopUtilization](x: Self) {
      
      inline def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      inline def setUtilization(value: Double): Self = StObject.set(x, "utilization", value.asInstanceOf[js.Any])
    }
  }
  
  trait Histogram extends StObject {
    
    /**
      * The number of times the event loop delay exceeded the maximum 1 hour event
      * loop delay threshold.
      * @since v11.10.0
      */
    val exceeds: Double
    
    /**
      * The maximum recorded event loop delay.
      * @since v11.10.0
      */
    val max: Double
    
    /**
      * The mean of the recorded event loop delays.
      * @since v11.10.0
      */
    val mean: Double
    
    /**
      * The minimum recorded event loop delay.
      * @since v11.10.0
      */
    val min: Double
    
    /**
      * Returns the value at the given percentile.
      * @since v11.10.0
      * @param percentile A percentile value in the range (0, 100].
      */
    def percentile(percentile: Double): Double
    
    /**
      * Returns a `Map` object detailing the accumulated percentile distribution.
      * @since v11.10.0
      */
    val percentiles: Map[Double, Double]
    
    /**
      * Resets the collected histogram data.
      * @since v11.10.0
      */
    def reset(): Unit
    
    /**
      * The standard deviation of the recorded event loop delays.
      * @since v11.10.0
      */
    val stddev: Double
  }
  object Histogram {
    
    inline def apply(
      exceeds: Double,
      max: Double,
      mean: Double,
      min: Double,
      percentile: Double => Double,
      percentiles: Map[Double, Double],
      reset: () => Unit,
      stddev: Double
    ): Histogram = {
      val __obj = js.Dynamic.literal(exceeds = exceeds.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], percentile = js.Any.fromFunction1(percentile), percentiles = percentiles.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stddev = stddev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Histogram]
    }
    
    extension [Self <: Histogram](x: Self) {
      
      inline def setExceeds(value: Double): Self = StObject.set(x, "exceeds", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setPercentile(value: Double => Double): Self = StObject.set(x, "percentile", js.Any.fromFunction1(value))
      
      inline def setPercentiles(value: Map[Double, Double]): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
      
      inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      inline def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    }
  }
  
  trait IntervalHistogram
    extends StObject
       with Histogram {
    
    /**
      * Disables the update interval timer. Returns `true` if the timer was
      * stopped, `false` if it was already stopped.
      * @since v11.10.0
      */
    def disable(): Boolean
    
    /**
      * Enables the update interval timer. Returns `true` if the timer was
      * started, `false` if it was already started.
      * @since v11.10.0
      */
    def enable(): Boolean
  }
  object IntervalHistogram {
    
    inline def apply(
      disable: () => Boolean,
      enable: () => Boolean,
      exceeds: Double,
      max: Double,
      mean: Double,
      min: Double,
      percentile: Double => Double,
      percentiles: Map[Double, Double],
      reset: () => Unit,
      stddev: Double
    ): IntervalHistogram = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), exceeds = exceeds.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], percentile = js.Any.fromFunction1(percentile), percentiles = percentiles.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stddev = stddev.asInstanceOf[js.Any])
      __obj.asInstanceOf[IntervalHistogram]
    }
    
    extension [Self <: IntervalHistogram](x: Self) {
      
      inline def setDisable(value: () => Boolean): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      inline def setEnable(value: () => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
    }
  }
  
  trait MarkOptions extends StObject {
    
    /**
      * Additional optional detail to include with the mark.
      */
    var detail: js.UndefOr[Any] = js.undefined
    
    /**
      * An optional timestamp to be used as the mark time.
      * @default `performance.now()`.
      */
    var startTime: js.UndefOr[Double] = js.undefined
  }
  object MarkOptions {
    
    inline def apply(): MarkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkOptions]
    }
    
    extension [Self <: MarkOptions](x: Self) {
      
      inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
  
  trait MeasureOptions extends StObject {
    
    /**
      * Additional optional detail to include with the mark.
      */
    var detail: js.UndefOr[Any] = js.undefined
    
    /**
      * Duration between start and end times.
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Timestamp to be used as the end time, or a string identifying a previously recorded mark.
      */
    var end: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Timestamp to be used as the start time, or a string identifying a previously recorded mark.
      */
    var start: js.UndefOr[Double | String] = js.undefined
  }
  object MeasureOptions {
    
    inline def apply(): MeasureOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MeasureOptions]
    }
    
    extension [Self <: MeasureOptions](x: Self) {
      
      inline def setDetail(value: Any): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEnd(value: Double | String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  trait NodeGCPerformanceDetail extends StObject {
    
    /**
      * When `performanceEntry.entryType` is equal to 'gc', the `performance.flags`
      * property contains additional information about garbage collection operation.
      * See perf_hooks.constants for valid values.
      */
    val flags: js.UndefOr[Double] = js.undefined
    
    /**
      * When `performanceEntry.entryType` is equal to 'gc', `the performance.kind` property identifies
      * the type of garbage collection operation that occurred.
      * See perf_hooks.constants for valid values.
      */
    val kind: js.UndefOr[Double] = js.undefined
  }
  object NodeGCPerformanceDetail {
    
    inline def apply(): NodeGCPerformanceDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeGCPerformanceDetail]
    }
    
    extension [Self <: NodeGCPerformanceDetail](x: Self) {
      
      inline def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setKind(value: Double): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    }
  }
  
  type PerformanceObserverCallback = js.Function2[/* list */ PerformanceObserverEntryList, /* observer */ PerformanceObserver, Unit]
  
  @js.native
  trait PerformanceObserverEntryList extends StObject {
    
    /**
      * Returns a list of `PerformanceEntry` objects in chronological order
      * with respect to `performanceEntry.startTime`.
      *
      * ```js
      * const {
      *   performance,
      *   PerformanceObserver
      * } = require('perf_hooks');
      *
      * const obs = new PerformanceObserver((perfObserverList, observer) => {
      *   console.log(perfObserverList.getEntries());
      *
      *    * [
      *    *   PerformanceEntry {
      *    *     name: 'test',
      *    *     entryType: 'mark',
      *    *     startTime: 81.465639,
      *    *     duration: 0
      *    *   },
      *    *   PerformanceEntry {
      *    *     name: 'meow',
      *    *     entryType: 'mark',
      *    *     startTime: 81.860064,
      *    *     duration: 0
      *    *   }
      *    * ]
      *
      *
      *   performance.clearMarks();
      *   performance.clearMeasures();
      *   observer.disconnect();
      * });
      * obs.observe({ type: 'mark' });
      *
      * performance.mark('test');
      * performance.mark('meow');
      * ```
      * @since v8.5.0
      */
    def getEntries(): js.Array[PerformanceEntry] = js.native
    
    /**
      * Returns a list of `PerformanceEntry` objects in chronological order
      * with respect to `performanceEntry.startTime` whose `performanceEntry.name` is
      * equal to `name`, and optionally, whose `performanceEntry.entryType` is equal to`type`.
      *
      * ```js
      * const {
      *   performance,
      *   PerformanceObserver
      * } = require('perf_hooks');
      *
      * const obs = new PerformanceObserver((perfObserverList, observer) => {
      *   console.log(perfObserverList.getEntriesByName('meow'));
      *
      *    * [
      *    *   PerformanceEntry {
      *    *     name: 'meow',
      *    *     entryType: 'mark',
      *    *     startTime: 98.545991,
      *    *     duration: 0
      *    *   }
      *    * ]
      *
      *   console.log(perfObserverList.getEntriesByName('nope')); // []
      *
      *   console.log(perfObserverList.getEntriesByName('test', 'mark'));
      *
      *    * [
      *    *   PerformanceEntry {
      *    *     name: 'test',
      *    *     entryType: 'mark',
      *    *     startTime: 63.518931,
      *    *     duration: 0
      *    *   }
      *    * ]
      *
      *   console.log(perfObserverList.getEntriesByName('test', 'measure')); // []
      *
      *   performance.clearMarks();
      *   performance.clearMeasures();
      *   observer.disconnect();
      * });
      * obs.observe({ entryTypes: ['mark', 'measure'] });
      *
      * performance.mark('test');
      * performance.mark('meow');
      * ```
      * @since v8.5.0
      */
    def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
    def getEntriesByName(name: String, `type`: EntryType): js.Array[PerformanceEntry] = js.native
    
    /**
      * Returns a list of `PerformanceEntry` objects in chronological order
      * with respect to `performanceEntry.startTime` whose `performanceEntry.entryType`is equal to `type`.
      *
      * ```js
      * const {
      *   performance,
      *   PerformanceObserver
      * } = require('perf_hooks');
      *
      * const obs = new PerformanceObserver((perfObserverList, observer) => {
      *   console.log(perfObserverList.getEntriesByType('mark'));
      *
      *    * [
      *    *   PerformanceEntry {
      *    *     name: 'test',
      *    *     entryType: 'mark',
      *    *     startTime: 55.897834,
      *    *     duration: 0
      *    *   },
      *    *   PerformanceEntry {
      *    *     name: 'meow',
      *    *     entryType: 'mark',
      *    *     startTime: 56.350146,
      *    *     duration: 0
      *    *   }
      *    * ]
      *
      *   performance.clearMarks();
      *   performance.clearMeasures();
      *   observer.disconnect();
      * });
      * obs.observe({ type: 'mark' });
      *
      * performance.mark('test');
      * performance.mark('meow');
      * ```
      * @since v8.5.0
      */
    def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
  }
  
  @js.native
  trait Performance_ extends StObject {
    
    /**
      * If name is not provided, removes all PerformanceMark objects from the Performance Timeline.
      * If name is provided, removes only the named mark.
      * @param name
      */
    def clearMarks(): Unit = js.native
    def clearMarks(name: String): Unit = js.native
    
    /**
      * If name is not provided, removes all PerformanceMeasure objects from the Performance Timeline.
      * If name is provided, removes only the named measure.
      * @param name
      * @since v16.7.0
      */
    def clearMeasures(): Unit = js.native
    def clearMeasures(name: String): Unit = js.native
    
    /**
      * eventLoopUtilization is similar to CPU utilization except that it is calculated using high precision wall-clock time.
      * It represents the percentage of time the event loop has spent outside the event loop's event provider (e.g. epoll_wait).
      * No other CPU idle time is taken into consideration.
      */
    def eventLoopUtilization(): EventLoopUtilization = js.native
    def eventLoopUtilization(util1: Unit, util2: EventLoopUtilization): EventLoopUtilization = js.native
    def eventLoopUtilization(util1: EventLoopUtilization): EventLoopUtilization = js.native
    def eventLoopUtilization(util1: EventLoopUtilization, util2: EventLoopUtilization): EventLoopUtilization = js.native
    /**
      * eventLoopUtilization is similar to CPU utilization except that it is calculated using high precision wall-clock time.
      * It represents the percentage of time the event loop has spent outside the event loop's event provider (e.g. epoll_wait).
      * No other CPU idle time is taken into consideration.
      */
    @JSName("eventLoopUtilization")
    var eventLoopUtilization_Original: EventLoopUtilityFunction = js.native
    
    /**
      * Returns a list of `PerformanceEntry` objects in chronological order with respect to `performanceEntry.startTime`.
      * If you are only interested in performance entries of certain types or that have certain names, see
      * `performance.getEntriesByType()` and `performance.getEntriesByName()`.
      * @since v16.7.0
      */
    def getEntries(): js.Array[PerformanceEntry] = js.native
    
    /**
      * Returns a list of `PerformanceEntry` objects in chronological order with respect to `performanceEntry.startTime`
      * whose `performanceEntry.name` is equal to `name`, and optionally, whose `performanceEntry.entryType` is equal to `type`.
      * @param name
      * @param type
      * @since v16.7.0
      */
    def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
    def getEntriesByName(name: String, `type`: EntryType): js.Array[PerformanceEntry] = js.native
    
    /**
      * Returns a list of `PerformanceEntry` objects in chronological order with respect to `performanceEntry.startTime`
      * whose `performanceEntry.entryType` is equal to `type`.
      * @param type
      * @since v16.7.0
      */
    def getEntriesByType(`type`: EntryType): js.Array[PerformanceEntry] = js.native
    
    /**
      * Creates a new PerformanceMark entry in the Performance Timeline.
      * A PerformanceMark is a subclass of PerformanceEntry whose performanceEntry.entryType is always 'mark',
      * and whose performanceEntry.duration is always 0.
      * Performance marks are used to mark specific significant moments in the Performance Timeline.
      * @param name
      * @return The PerformanceMark entry that was created
      */
    def mark(): PerformanceMark = js.native
    def mark(name: String): PerformanceMark = js.native
    def mark(name: String, options: MarkOptions): PerformanceMark = js.native
    def mark(name: Unit, options: MarkOptions): PerformanceMark = js.native
    
    /**
      * Creates a new PerformanceMeasure entry in the Performance Timeline.
      * A PerformanceMeasure is a subclass of PerformanceEntry whose performanceEntry.entryType is always 'measure',
      * and whose performanceEntry.duration measures the number of milliseconds elapsed since startMark and endMark.
      *
      * The startMark argument may identify any existing PerformanceMark in the the Performance Timeline, or may identify
      * any of the timestamp properties provided by the PerformanceNodeTiming class. If the named startMark does not exist,
      * then startMark is set to timeOrigin by default.
      *
      * The endMark argument must identify any existing PerformanceMark in the the Performance Timeline or any of the timestamp
      * properties provided by the PerformanceNodeTiming class. If the named endMark does not exist, an error will be thrown.
      * @param name
      * @param startMark
      * @param endMark
      * @return The PerformanceMeasure entry that was created
      */
    def measure(name: String): PerformanceMeasure = js.native
    def measure(name: String, options: MeasureOptions): PerformanceMeasure = js.native
    def measure(name: String, startMark: String): PerformanceMeasure = js.native
    def measure(name: String, startMark: String, endMark: String): PerformanceMeasure = js.native
    def measure(name: String, startMark: Unit, endMark: String): PerformanceMeasure = js.native
    
    /**
      * An instance of the PerformanceNodeTiming class that provides performance metrics for specific Node.js operational milestones.
      */
    val nodeTiming: PerformanceNodeTiming = js.native
    
    /**
      * @return the current high resolution millisecond timestamp
      */
    def now(): Double = js.native
    
    /**
      * The timeOrigin specifies the high resolution millisecond timestamp from which all performance metric durations are measured.
      */
    val timeOrigin: Double = js.native
    
    /**
      * Wraps a function within a new function that measures the running time of the wrapped function.
      * A PerformanceObserver must be subscribed to the 'function' event type in order for the timing details to be accessed.
      * @param fn
      */
    def timerify[T /* <: js.Function1[/* repeated */ Any, Any] */](fn: T): T = js.native
    def timerify[T /* <: js.Function1[/* repeated */ Any, Any] */](fn: T, options: TimerifyOptions): T = js.native
  }
  
  @js.native
  trait RecordableHistogram
    extends StObject
       with Histogram {
    
    /**
      * Adds the values from other to this histogram.
      * @since v17.4.0, v16.14.0
      * @param other Recordable Histogram to combine with
      */
    def add(other: RecordableHistogram): Unit = js.native
    
    def record(`val`: js.BigInt): Unit = js.native
    /**
      * @since v15.9.0, v14.18.0
      * @param val The amount to record in the histogram.
      */
    def record(`val`: Double): Unit = js.native
    
    /**
      * Calculates the amount of time (in nanoseconds) that has passed since the
      * previous call to `recordDelta()` and records that amount in the histogram.
      *
      * ## Examples
      * @since v15.9.0, v14.18.0
      */
    def recordDelta(): Unit = js.native
  }
  
  trait TimerifyOptions extends StObject {
    
    /**
      * A histogram object created using
      * `perf_hooks.createHistogram()` that will record runtime durations in
      * nanoseconds.
      */
    var histogram: js.UndefOr[RecordableHistogram] = js.undefined
  }
  object TimerifyOptions {
    
    inline def apply(): TimerifyOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimerifyOptions]
    }
    
    extension [Self <: TimerifyOptions](x: Self) {
      
      inline def setHistogram(value: RecordableHistogram): Self = StObject.set(x, "histogram", value.asInstanceOf[js.Any])
      
      inline def setHistogramUndefined: Self = StObject.set(x, "histogram", js.undefined)
    }
  }
}
