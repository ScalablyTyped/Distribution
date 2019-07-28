package typings.nodeDashSchedule

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashScheduleMod {
  type JobCallback = js.Function1[/* fireDate */ Date, Unit]
  type Recurrence = Double | Range | String
  type RecurrenceSegment = Recurrence | js.Array[Recurrence]
}
