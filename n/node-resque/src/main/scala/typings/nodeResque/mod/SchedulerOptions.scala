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
    masterLockTimeout: js.UndefOr[Double] = js.undefined,
    name: String = null,
    stuckWorkerTimeout: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined
  ): SchedulerOptions = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(masterLockTimeout)) __obj.updateDynamic("masterLockTimeout")(masterLockTimeout.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(stuckWorkerTimeout)) __obj.updateDynamic("stuckWorkerTimeout")(stuckWorkerTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerOptions]
  }
}

