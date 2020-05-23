package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Changestatus extends js.Object {
  var change_status: Additions
  var committed_at: String
  var url: String
  var user: Eventsurl
  var version: String
}

object Changestatus {
  @scala.inline
  def apply(change_status: Additions, committed_at: String, url: String, user: Eventsurl, version: String): Changestatus = {
    val __obj = js.Dynamic.literal(change_status = change_status.asInstanceOf[js.Any], committed_at = committed_at.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Changestatus]
  }
}

