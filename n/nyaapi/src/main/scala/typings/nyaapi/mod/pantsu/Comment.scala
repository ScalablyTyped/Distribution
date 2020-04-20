package typings.nyaapi.mod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Comment extends js.Object {
  var content: String
  var date: String
  var user_avatar: String
  var user_id: Double
  var user_status: String
  var username: String
}

object Comment {
  @scala.inline
  def apply(
    content: String,
    date: String,
    user_avatar: String,
    user_id: Double,
    user_status: String,
    username: String
  ): Comment = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], user_avatar = user_avatar.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], user_status = user_status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

