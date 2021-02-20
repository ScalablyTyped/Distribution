package typings.node

import typings.node.anon.Buffered
import typings.node.asyncHooksMod.AsyncResource
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object perfHooksMod {
  
  @JSImport("perf_hooks", "PerformanceObserver")
  @js.native
  class PerformanceObserver protected () extends AsyncResource {
    def this(callback: PerformanceObserverCallback) = this()
    
    /**
      * Disconnects the PerformanceObserver instance from all notifications.
      */
    def disconnect(): Unit = js.native
    
    /**
      * Subscribes the PerformanceObserver instance to notifications of new PerformanceEntry instances identified by options.entryTypes.
      * When options.buffered is false, the callback will be invoked once for every PerformanceEntry instance.
      * Property buffered defaults to false.
      * @param options
      */
    def observe(options: Buffered): Unit = js.native
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
  
  @JSImport("perf_hooks", "monitorEventLoopDelay")
  @js.native
  def monitorEventLoopDelay(): EventLoopDelayMonitor = js.native
  @JSImport("perf_hooks", "monitorEventLoopDelay")
  @js.native
  def monitorEventLoopDelay(options: EventLoopMonitorOptions): EventLoopDelayMonitor = js.native
  
  @JSImport("perf_hooks", "performance")
  @js.native
  val performance: Performance_ = js.native
  
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
    
    @scala.inline
    def function: typings.node.nodeStrings.function = "function".asInstanceOf[typings.node.nodeStrings.function]
    
    @scala.inline
    def gc: typings.node.nodeStrings.gc = "gc".asInstanceOf[typings.node.nodeStrings.gc]
    
    @scala.inline
    def http: typings.node.nodeStrings.http = "http".asInstanceOf[typings.node.nodeStrings.http]
    
    @scala.inline
    def http2: typings.node.nodeStrings.http2 = "http2".asInstanceOf[typings.node.nodeStrings.http2]
    
    @scala.inline
    def mark: typings.node.nodeStrings.mark = "mark".asInstanceOf[typings.node.nodeStrings.mark]
    
    @scala.inline
    def measure: typings.node.nodeStrings.measure = "measure".asInstanceOf[typings.node.nodeStrings.measure]
    
    @scala.inline
    def node: typings.node.nodeStrings.node = "node".asInstanceOf[typings.node.nodeStrings.node]
  }
  
  @js.native
  trait EventLoopDelayMonitor extends StObject {
    
    /**
      * Disables the event loop delay sample timer. Returns `true` if the timer was stopped, `false` if it was already stopped.
      */
    def disable(): Boolean = js.native
    
    /**
      * Enables the event loop delay sample timer. Returns `true` if the timer was started, `false` if it was already started.
      */
    def enable(): Boolean = js.native
    
    /**
      * The number of times the event loop delay exceeded the maximum 1 hour eventloop delay threshold.
      */
    val exceeds: Double = js.native
    
    /**
      * The maximum recorded event loop delay.
      */
    val max: Double = js.native
    
    /**
      * The mean of the recorded event loop delays.
      */
    val mean: Double = js.native
    
    /**
      * The minimum recorded event loop delay.
      */
    val min: Double = js.native
    
    /**
      * Returns the value at the given percentile.
      * @param percentile A percentile value between 1 and 100.
      */
    def percentile(percentile: Double): Double = js.native
    
    /**
      * A `Map` object detailing the accumulated percentile distribution.
      */
    val percentiles: Map[Double, Double] = js.native
    
    /**
      * Resets the collected histogram data.
      */
    def reset(): Unit = js.native
    
    /**
      * The standard deviation of the recorded event loop delays.
      */
    val stddev: Double = js.native
  }
  object EventLoopDelayMonitor {
    
    @scala.inline
    def apply(
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
    ): EventLoopDelayMonitor = {
      val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), exceeds = exceeds.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], percentile = js.Any.fromFunction1(percentile), percentiles = percentiles.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), stddev = stddev.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventLoopDelayMonitor]
    }
    
    @scala.inline
    implicit class EventLoopDelayMonitorMutableBuilder[Self <: EventLoopDelayMonitor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisable(value: () => Boolean): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEnable(value: () => Boolean): Self = StObject.set(x, "enable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExceeds(value: Double): Self = StObject.set(x, "exceeds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentile(value: Double => Double): Self = StObject.set(x, "percentile", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPercentiles(value: Map[Double, Double]): Self = StObject.set(x, "percentiles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EventLoopMonitorOptions extends StObject {
    
    /**
      * The sampling rate in milliseconds.
      * Must be greater than zero.
      * @default 10
      */
    var resolution: js.UndefOr[Double] = js.native
  }
  object EventLoopMonitorOptions {
    
    @scala.inline
    def apply(): EventLoopMonitorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventLoopMonitorOptions]
    }
    
    @scala.inline
    implicit class EventLoopMonitorOptionsMutableBuilder[Self <: EventLoopMonitorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
    }
  }
  
  @js.native
  trait EventLoopUtilization extends StObject {
    
    var active: Double = js.native
    
    var idle: Double = js.native
    
    var utilization: Double = js.native
  }
  object EventLoopUtilization {
    
    @scala.inline
    def apply(active: Double, idle: Double, utilization: Double): EventLoopUtilization = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], idle = idle.asInstanceOf[js.Any], utilization = utilization.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventLoopUtilization]
    }
    
    @scala.inline
    implicit class EventLoopUtilizationMutableBuilder[Self <: EventLoopUtilization] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Double): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdle(value: Double): Self = StObject.set(x, "idle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUtilization(value: Double): Self = StObject.set(x, "utilization", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PerformanceEntry extends StObject {
    
    /**
      * The total number of milliseconds elapsed for this entry.
      * This value will not be meaningful for all Performance Entry types.
      */
    val duration: Double = js.native
    
    /**
      * The type of the performance entry.
      * Currently it may be one of: 'node', 'mark', 'measure', 'gc', or 'function'.
      */
    val entryType: EntryType = js.native
    
    /**
      * When `performanceEntry.entryType` is equal to 'gc', the `performance.flags`
      * property contains additional information about garbage collection operation.
      * See perf_hooks.constants for valid values.
      */
    val flags: js.UndefOr[Double] = js.native
    
    /**
      * When `performanceEntry.entryType` is equal to 'gc', `the performance.kind` property identifies
      * the type of garbage collection operation that occurred.
      * See perf_hooks.constants for valid values.
      */
    val kind: js.UndefOr[Double] = js.native
    
    /**
      * The name of the performance entry.
      */
    val name: java.lang.String = js.native
    
    /**
      * The high resolution millisecond timestamp marking the starting time of the Performance Entry.
      */
    val startTime: Double = js.native
  }
  object PerformanceEntry {
    
    @scala.inline
    def apply(duration: Double, entryType: EntryType, name: java.lang.String, startTime: Double): PerformanceEntry = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerformanceEntry]
    }
    
    @scala.inline
    implicit class PerformanceEntryMutableBuilder[Self <: PerformanceEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEntryType(value: EntryType): Self = StObject.set(x, "entryType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: Double): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      @scala.inline
      def setKind(value: Double): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PerformanceNodeTiming extends PerformanceEntry {
    
    /**
      * The high resolution millisecond timestamp at which the Node.js process completed bootstrap.
      */
    val bootstrapComplete: Double = js.native
    
    /**
      * The high resolution millisecond timestamp at which the Node.js process completed bootstrapping.
      * If bootstrapping has not yet finished, the property has the value of -1.
      */
    val environment: Double = js.native
    
    /**
      * The high resolution millisecond timestamp at which the Node.js environment was initialized.
      */
    val idleTime: Double = js.native
    
    /**
      * The high resolution millisecond timestamp of the amount of time the event loop has been idle
      *  within the event loop's event provider (e.g. `epoll_wait`). This does not take CPU usage
      * into consideration. If the event loop has not yet started (e.g., in the first tick of the main script),
      *  the property has the value of 0.
      */
    val loopExit: Double = js.native
    
    /**
      * The high resolution millisecond timestamp at which the Node.js event loop started.
      * If the event loop has not yet started (e.g., in the first tick of the main script), the property has the value of -1.
      */
    val loopStart: Double = js.native
    
    /**
      * The high resolution millisecond timestamp at which the V8 platform was initialized.
      */
    val v8Start: Double = js.native
  }
  object PerformanceNodeTiming {
    
    @scala.inline
    def apply(
      bootstrapComplete: Double,
      duration: Double,
      entryType: EntryType,
      environment: Double,
      idleTime: Double,
      loopExit: Double,
      loopStart: Double,
      name: java.lang.String,
      startTime: Double,
      v8Start: Double
    ): PerformanceNodeTiming = {
      val __obj = js.Dynamic.literal(bootstrapComplete = bootstrapComplete.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], entryType = entryType.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], idleTime = idleTime.asInstanceOf[js.Any], loopExit = loopExit.asInstanceOf[js.Any], loopStart = loopStart.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], v8Start = v8Start.asInstanceOf[js.Any])
      __obj.asInstanceOf[PerformanceNodeTiming]
    }
    
    @scala.inline
    implicit class PerformanceNodeTimingMutableBuilder[Self <: PerformanceNodeTiming] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBootstrapComplete(value: Double): Self = StObject.set(x, "bootstrapComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvironment(value: Double): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTime(value: Double): Self = StObject.set(x, "idleTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopExit(value: Double): Self = StObject.set(x, "loopExit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopStart(value: Double): Self = StObject.set(x, "loopStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setV8Start(value: Double): Self = StObject.set(x, "v8Start", value.asInstanceOf[js.Any])
    }
  }
  
  type PerformanceObserverCallback = js.Function2[/* list */ PerformanceObserverEntryList, /* observer */ PerformanceObserver, Unit]
  
  @js.native
  trait PerformanceObserverEntryList extends StObject {
    
    /**
      * @return a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime.
      */
    def getEntries(): js.Array[PerformanceEntry] = js.native
    
    /**
      * @return a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime
      * whose performanceEntry.name is equal to name, and optionally, whose performanceEntry.entryType is equal to type.
      */
    def getEntriesByName(name: java.lang.String): js.Array[PerformanceEntry] = js.native
    def getEntriesByName(name: java.lang.String, `type`: EntryType): js.Array[PerformanceEntry] = js.native
    
    /**
      * @return Returns a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime
      * whose performanceEntry.entryType is equal to type.
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
    def clearMarks(name: java.lang.String): Unit = js.native
    
    /**
      * eventLoopUtilization is similar to CPU utilization except that it is calculated using high precision wall-clock time.
      * It represents the percentage of time the event loop has spent outside the event loop's event provider (e.g. epoll_wait).
      * No other CPU idle time is taken into consideration.
      *
      * @param util1 The result of a previous call to eventLoopUtilization()
      * @param util2 The result of a previous call to eventLoopUtilization() prior to util1
      */
    def eventLoopUtilization(): EventLoopUtilization = js.native
    def eventLoopUtilization(util1: js.UndefOr[scala.Nothing], util2: EventLoopUtilization): EventLoopUtilization = js.native
    def eventLoopUtilization(util1: EventLoopUtilization): EventLoopUtilization = js.native
    def eventLoopUtilization(util1: EventLoopUtilization, util2: EventLoopUtilization): EventLoopUtilization = js.native
    
    /**
      * Creates a new PerformanceMark entry in the Performance Timeline.
      * A PerformanceMark is a subclass of PerformanceEntry whose performanceEntry.entryType is always 'mark',
      * and whose performanceEntry.duration is always 0.
      * Performance marks are used to mark specific significant moments in the Performance Timeline.
      * @param name
      */
    def mark(): Unit = js.native
    def mark(name: java.lang.String): Unit = js.native
    
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
      */
    def measure(name: java.lang.String, startMark: java.lang.String, endMark: java.lang.String): Unit = js.native
    
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
    def timerify[T /* <: js.Function1[/* repeated */ js.Any, _] */](fn: T): T = js.native
  }
}
