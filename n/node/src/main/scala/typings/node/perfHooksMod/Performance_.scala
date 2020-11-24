package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Performance_ extends js.Object {
  
  /**
    * If name is not provided, removes all PerformanceMark objects from the Performance Timeline.
    * If name is provided, removes only the named mark.
    * @param name
    */
  def clearMarks(): Unit = js.native
  def clearMarks(name: String): Unit = js.native
  
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
  def mark(name: String): Unit = js.native
  
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
  def measure(name: String, startMark: String, endMark: String): Unit = js.native
  
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
