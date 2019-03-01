package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerOptions extends js.Object {
  var connection: js.UndefOr[ConnectionOptions] = js.undefined
  var masterLockTimeout: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var stuckWorkerTimeout: js.UndefOr[scala.Double] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object SchedulerOptions {
  @scala.inline
  def apply(
    connection: ConnectionOptions = null,
    masterLockTimeout: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    stuckWorkerTimeout: scala.Int | scala.Double = null,
    timeout: scala.Int | scala.Double = null
  ): SchedulerOptions = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (masterLockTimeout != null) __obj.updateDynamic("masterLockTimeout")(masterLockTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (stuckWorkerTimeout != null) __obj.updateDynamic("stuckWorkerTimeout")(stuckWorkerTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerOptions]
  }
}

