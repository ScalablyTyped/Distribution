package typings.nodeDashCron.nodeDashCronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-cron", "schedule")
@js.native
object schedule extends js.Object {
  def apply(cronExpression: String, func: js.Function0[Unit]): ScheduledTask = js.native
  def apply(cronExpression: String, func: js.Function0[Unit], options: ScheduleOptions): ScheduledTask = js.native
}

