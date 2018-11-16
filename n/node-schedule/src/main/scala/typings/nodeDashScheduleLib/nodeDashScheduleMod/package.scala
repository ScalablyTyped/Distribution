package typings
package nodeDashScheduleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object nodeDashScheduleMod {
  type JobCallback = js.Function1[/* fireDate */ stdLib.Date, scala.Unit]
  type Recurrence = scala.Double | Range | java.lang.String
  type RecurrenceSegment = Recurrence | js.Array[Recurrence]
}
