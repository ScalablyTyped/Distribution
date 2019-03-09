package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerformanceObserver extends js.Object {
  def disconnect(): scala.Unit
  def observe(options: PerformanceObserverInit): scala.Unit
  def takeRecords(): PerformanceEntryList
}

@JSGlobal("PerformanceObserver")
@js.native
object PerformanceObserver
  extends org.scalablytyped.runtime.Instantiable1[/* callback */ PerformanceObserverCallback, PerformanceObserver]

