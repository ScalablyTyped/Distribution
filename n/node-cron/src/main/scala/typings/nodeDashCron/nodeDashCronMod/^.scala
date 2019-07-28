package typings.nodeDashCron.nodeDashCronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-cron", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def schedule(cronExpression: String, func: js.Function0[Unit]): ScheduledTask = js.native
  def schedule(cronExpression: String, func: js.Function0[Unit], options: ScheduleOptions): ScheduledTask = js.native
  def validate(cronExpression: String): Boolean = js.native
}

