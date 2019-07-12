package typings
package podcastLib.podcastMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeedItunesOwner extends js.Object {
  var email: java.lang.String
  var name: java.lang.String
}

object FeedItunesOwner {
  @scala.inline
  def apply(email: java.lang.String, name: java.lang.String): FeedItunesOwner = {
    val __obj = js.Dynamic.literal(email = email, name = name)
  
    __obj.asInstanceOf[FeedItunesOwner]
  }
}

