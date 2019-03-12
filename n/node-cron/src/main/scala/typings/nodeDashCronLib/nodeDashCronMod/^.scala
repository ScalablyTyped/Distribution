package typings
package nodeDashCronLib.nodeDashCronMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-cron", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def schedule(cronExpression: java.lang.String, func: js.Function0[scala.Unit]): ScheduledTask = js.native
  def schedule(cronExpression: java.lang.String, func: js.Function0[scala.Unit], options: ScheduleOptions): ScheduledTask = js.native
  def validate(cronExpression: java.lang.String): scala.Boolean = js.native
}

