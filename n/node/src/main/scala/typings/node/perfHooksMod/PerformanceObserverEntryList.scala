package typings.node.perfHooksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PerformanceObserverEntryList extends js.Object {
  /**
    * @return a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime.
    */
  def getEntries(): js.Array[PerformanceEntry] = js.native
  /**
    * @return a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime
    * whose performanceEntry.name is equal to name, and optionally, whose performanceEntry.entryType is equal to type.
    */
  def getEntriesByName(name: String): js.Array[PerformanceEntry] = js.native
  def getEntriesByName(name: String, `type`: String): js.Array[PerformanceEntry] = js.native
  /**
    * @return Returns a list of PerformanceEntry objects in chronological order with respect to performanceEntry.startTime
    * whose performanceEntry.entryType is equal to type.
    */
  def getEntriesByType(`type`: String): js.Array[PerformanceEntry] = js.native
}

