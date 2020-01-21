package typings.nodeSchedule.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-schedule", "RecurrenceRule")
@js.native
class RecurrenceRule protected () extends js.Object {
  def this(
    year: js.UndefOr[RecurrenceSegment],
    month: js.UndefOr[RecurrenceSegment],
    date: js.UndefOr[RecurrenceSegment],
    dayOfWeek: js.UndefOr[RecurrenceSegment],
    hour: js.UndefOr[RecurrenceSegment],
    minute: js.UndefOr[RecurrenceSegment],
    second: js.UndefOr[RecurrenceSegment],
    tz: js.UndefOr[Timezone]
  ) = this()
  /**
    * Day of the month.
    */
  var date: RecurrenceSegment = js.native
  var dayOfWeek: RecurrenceSegment = js.native
  var hour: RecurrenceSegment = js.native
  var minute: RecurrenceSegment = js.native
  var month: RecurrenceSegment = js.native
  var second: RecurrenceSegment = js.native
  var tz: Timezone = js.native
  var year: RecurrenceSegment = js.native
  def nextInvocationDate(base: Date): Date = js.native
}

