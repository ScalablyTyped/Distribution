package typings.podcast.podcastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedItunesOwner extends js.Object {
  var email: String
  var name: String
}

object FeedItunesOwner {
  @scala.inline
  def apply(email: String, name: String): FeedItunesOwner = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[FeedItunesOwner]
  }
}

