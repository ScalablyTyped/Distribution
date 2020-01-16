package typings.nyaapi.nyaapiMod.pantsu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait User extends js.Object {
  var created_at: String
  var liked_count: Double
  var liking_count: Double
  var md5: String
  var status: UserStatus
  var user_id: Double
  var username: String
}

object User {
  @scala.inline
  def apply(
    created_at: String,
    liked_count: Double,
    liking_count: Double,
    md5: String,
    status: UserStatus,
    user_id: Double,
    username: String
  ): User = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], liked_count = liked_count.asInstanceOf[js.Any], liking_count = liking_count.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[User]
  }
}

