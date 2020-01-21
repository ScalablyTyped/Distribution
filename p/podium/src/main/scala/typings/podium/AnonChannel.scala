package typings.podium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChannel extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var name: String
  var tags: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AnonChannel {
  @scala.inline
  def apply(name: String, channel: String = null, tags: String | js.Array[String] = null): AnonChannel = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChannel]
  }
}

