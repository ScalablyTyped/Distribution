package typings.podcast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFeedurl extends js.Object {
  var feed_url: String
}

object AnonFeedurl {
  @scala.inline
  def apply(feed_url: String): AnonFeedurl = {
    val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFeedurl]
  }
}

