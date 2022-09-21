package typings.node

import typings.node.perfHooksMod.CreateHistogramOptions
import typings.node.perfHooksMod.EventLoopMonitorOptions
import typings.node.perfHooksMod.IntervalHistogram
import typings.node.perfHooksMod.PerformanceObserverCallback
import typings.node.perfHooksMod.Performance_
import typings.node.perfHooksMod.RecordableHistogram
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodePerfHooksMod {
  
  @JSImport("node:perf_hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @since v8.5.0
    */
  @JSImport("node:perf_hooks", "PerformanceEntry")
  @js.native
  /* protected */ open class PerformanceEntry ()
    extends typings.node.perfHooksMod.PerformanceEntry
  
  @JSImport("node:perf_hooks", "PerformanceMark")
  @js.native
  /* protected */ open class PerformanceMark ()
    extends typings.node.perfHooksMod.PerformanceMark
  
  @JSImport("node:perf_hooks", "PerformanceMeasure")
  @js.native
  /* protected */ open class PerformanceMeasure ()
    extends typings.node.perfHooksMod.PerformanceMeasure
  
  /**
    * _This property is an extension by Node.js. It is not available in Web browsers._
    *
    * Provides timing details for Node.js itself. The constructor of this class
    * is not exposed to users.
    * @since v8.5.0
    */
  @JSImport("node:perf_hooks", "PerformanceNodeTiming")
  @js.native
  /* protected */ open class PerformanceNodeTiming ()
    extends typings.node.perfHooksMod.PerformanceNodeTiming
  
  @JSImport("node:perf_hooks", "PerformanceObserver")
  @js.native
  open class PerformanceObserver protected ()
    extends typings.node.perfHooksMod.PerformanceObserver {
    def this(callback: PerformanceObserverCallback) = this()
  }
  
  object constants {
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_ALL_AVAILABLE_GARBAGE")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_ALL_AVAILABLE_GARBAGE: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_ALL_EXTERNAL_MEMORY")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_ALL_EXTERNAL_MEMORY: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_CONSTRUCT_RETAINED")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_CONSTRUCT_RETAINED: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_FORCED")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_FORCED: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_NO")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_NO: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_SCHEDULE_IDLE")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_SCHEDULE_IDLE: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_FLAGS_SYNCHRONOUS_PHANTOM_PROCESSING")
    @js.native
    val NODE_PERFORMANCE_GC_FLAGS_SYNCHRONOUS_PHANTOM_PROCESSING: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_INCREMENTAL")
    @js.native
    val NODE_PERFORMANCE_GC_INCREMENTAL: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_MAJOR")
    @js.native
    val NODE_PERFORMANCE_GC_MAJOR: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_MINOR")
    @js.native
    val NODE_PERFORMANCE_GC_MINOR: Double = js.native
    
    @JSImport("node:perf_hooks", "constants.NODE_PERFORMANCE_GC_WEAKCB")
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
  
  @JSImport("node:perf_hooks", "performance")
  @js.native
  val performance: Performance_ = js.native
}
