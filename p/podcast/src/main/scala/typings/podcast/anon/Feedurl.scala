package typings.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Feedurl extends js.Object {
  var feed_url: String
}

object Feedurl {
  @scala.inline
  def apply(feed_url: String): Feedurl = {
    val __obj = js.Dynamic.literal(feed_url = feed_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Feedurl]
  }
}

