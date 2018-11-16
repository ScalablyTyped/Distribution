package typings
package nodeDashScheduleLib.nodeDashScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", "Invocation")
@js.native
class Invocation protected () extends js.Object {
  def this(job: Job, fireDate: stdLib.Date, recurrenceRule: RecurrenceRule) = this()
  var fireDate: stdLib.Date = js.native
  var job: Job = js.native
  var recurrenceRule: RecurrenceRule = js.native
  var timerID: scala.Double = js.native
}

