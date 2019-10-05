package typings.node.perfUnderscoreHooksMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Performance extends js.Object {
  /**
    * An instance of the PerformanceNodeTiming class that provides performance metrics for specific Node.js operational milestones.
    */
  val nodeTiming: PerformanceNodeTiming = js.native
  /**
    * The timeOrigin specifies the high resolution millisecond timestamp from which all performance metric durations are measured.
    */
  val timeOrigin: Double = js.native
  /**
    * If name is not provided, removes all PerformanceFunction objects from the Performance Timeline.
    * If name is provided, removes entries with name.
    * @param name
    */
  def clearFunctions(): Unit = js.native
  def clearFunctions(name: java.lang.String): Unit = js.native
  /**
    * If name is not provided, removes all PerformanceMark objects from the Performance Timeline.
    * If name is provided, removes only the named mark.
    * @param name
    */
  def clearMarks(): Unit = js.native
  def clearMarks(name: java.lang.String): Unit = js.native
  /**
    * If name is not provided, removes all PerformanceMeasure objects from the Performance Timeline.
    * If name is provided, removes only objects whose performanceEntry.name matches name.
    */
  def clearMeasures(): Unit = js.native
  def clearMeasures(name: java.lang.String): Unit = js.native
  /**
    * Returns a list of all PerformanceEntry objects in chronological order with respect to performanceEntry.startTime.
    * @return list of all PerformanceEntry objects
    */
  def getEntries(): js.Array[PerformanceEntry] = js.native
  /**
    * Returns a list of all PerformanceEntry objects in chronological order with respect to performanceEntry.startTime
    * whose performanceEntry.name is equal to name, and optionally, whose performanceEntry.entryType is equal to type.
    * @param name
    * @param type
    * @return list of all PerformanceEntry objects
    */
  def getEntriesByName(name: java.lang.String): js.Array[PerformanceEntry] = js.native
  def getEntriesByName(name: java.lang.String, `type`: java.lang.String): js.Array[PerformanceEntry] = js.native
  /**
    * Returns a list of all PerformanceEntry objects in chronological order with respect to performanceEntry.startTime
    * whose performanceEntry.entryType is equal to type.
    * @param type
    * @return list of all PerformanceEntry objects
    */
  def getEntriesByType(`type`: java.lang.String): js.Array[PerformanceEntry] = js.native
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
    * @return the current high resolution millisecond timestamp
    */
  def now(): Double = js.native
  /**
    * Wraps a function within a new function that measures the running time of the wrapped function.
    * A PerformanceObserver must be subscribed to the 'function' event type in order for the timing details to be accessed.
    * @param fn
    */
  def timerify[T /* <: js.Function1[/* repeated */ js.Any, _] */](fn: T): T = js.native
}

@JSImport("perf_hooks", "performance")
@js.native
object performance extends TopLevel[Performance]

