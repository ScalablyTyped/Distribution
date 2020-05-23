package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Starredat extends js.Object {
  var starred_at: String
  var user: Eventsurl
}

object Starredat {
  @scala.inline
  def apply(starred_at: String, user: Eventsurl): Starredat = {
    val __obj = js.Dynamic.literal(starred_at = starred_at.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Starredat]
  }
}

