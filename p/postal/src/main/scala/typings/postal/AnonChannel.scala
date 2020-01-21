package typings.postal

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var context: js.UndefOr[js.Any] = js.undefined
  var topic: js.UndefOr[String] = js.undefined
}

object AnonChannel {
  @scala.inline
  def apply(channel: String = null, context: js.Any = null, topic: String = null): AnonChannel = {
    val __obj = js.Dynamic.literal()
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (topic != null) __obj.updateDynamic("topic")(topic.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
}

