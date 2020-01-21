package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerOptions extends js.Object {
  var connection: js.UndefOr[ConnectionOptions] = js.undefined
  var masterLockTimeout: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var stuckWorkerTimeout: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object SchedulerOptions {
  @scala.inline
  def apply(
    connection: ConnectionOptions = null,
    masterLockTimeout: Int | Double = null,
    name: String = null,
    stuckWorkerTimeout: Int | Double = null,
    timeout: Int | Double = null
  ): SchedulerOptions = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (masterLockTimeout != null) __obj.updateDynamic("masterLockTimeout")(masterLockTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (stuckWorkerTimeout != null) __obj.updateDynamic("stuckWorkerTimeout")(stuckWorkerTimeout.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerOptions]
  }
}

