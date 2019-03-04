package typings
package nodeDashResqueLib.nodeDashResqueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkerOptions extends js.Object {
  var connection: js.UndefOr[ConnectionOptions] = js.undefined
  var looping: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var queues: js.Array[java.lang.String]
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object WorkerOptions {
  @scala.inline
  def apply(
    queues: js.Array[java.lang.String],
    connection: ConnectionOptions = null,
    looping: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): WorkerOptions = {
    val __obj = js.Dynamic.literal(queues = queues)
    if (connection != null) __obj.updateDynamic("connection")(connection)
    if (!js.isUndefined(looping)) __obj.updateDynamic("looping")(looping)
    if (name != null) __obj.updateDynamic("name")(name)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerOptions]
  }
}

