package typings.nodeSchedule

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type JobCallback = js.Function1[/* fireDate */ typings.std.Date, scala.Unit]
  
  type Recurrence = scala.Double | typings.nodeSchedule.mod.Range | java.lang.String
  
  type RecurrenceSegment = typings.nodeSchedule.mod.Recurrence | js.Array[typings.nodeSchedule.mod.Recurrence]
  
  type Timezone = java.lang.String
}
