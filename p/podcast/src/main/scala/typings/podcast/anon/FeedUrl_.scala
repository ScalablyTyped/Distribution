package typings.podcast.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeedUrl_ extends js.Object {
  var feedUrl: String = js.native
}

object FeedUrl_ {
  @scala.inline
  def apply(feedUrl: String): FeedUrl_ = {
    val __obj = js.Dynamic.literal(feedUrl = feedUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeedUrl_]
  }
  @scala.inline
  implicit class FeedUrl_Ops[Self <: FeedUrl_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFeedUrl(value: String): Self = this.set("feedUrl", value.asInstanceOf[js.Any])
  }
  
}

