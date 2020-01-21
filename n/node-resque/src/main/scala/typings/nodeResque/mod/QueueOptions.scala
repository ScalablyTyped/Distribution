package typings.nodeResque.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueOptions extends js.Object {
  var connection: js.UndefOr[ConnectionOptions] = js.undefined
}

object QueueOptions {
  @scala.inline
  def apply(connection: ConnectionOptions = null): QueueOptions = {
    val __obj = js.Dynamic.literal()
    if (connection != null) __obj.updateDynamic("connection")(connection.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueOptions]
  }
}

