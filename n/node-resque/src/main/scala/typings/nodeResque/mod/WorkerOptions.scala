package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
  var connection: js.UndefOr[ConnectionOptions] = js.undefined
  var looping: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var queues: js.Array[String]
  var timeout: js.UndefOr[Double] = js.undefined
}

object WorkerOptions {
  @scala.inline
  def apply(
    queues: js.Array[String],
    connection: ConnectionOptions = null,
    looping: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    timeout: Int | Double = null
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal(queues = queues.asInstanceOf[js.Any])
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    if (!js.isUndefined(looping)) __obj.updateDynamic("looping")(looping.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
}

