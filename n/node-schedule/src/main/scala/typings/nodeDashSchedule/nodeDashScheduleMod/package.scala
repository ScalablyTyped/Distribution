package typings.nodeDashSchedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashScheduleMod {
  import typings.std.Date

  type JobCallback = js.Function1[/* fireDate */ Date, Unit]
  type Recurrence = Double | Range | String
  type RecurrenceSegment = Recurrence | js.Array[Recurrence]
}
