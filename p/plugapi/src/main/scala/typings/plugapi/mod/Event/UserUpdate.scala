package typings.plugapi.mod.Event

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserUpdate extends js.Object {
  var avatarID: String
  var curatorPoints: Double
  var dateJoined: String
  var djPoints: Double
  var fans: Double
  var id: String
  var language: String
  var listenerPoints: Double
  var status: Double
  var username: String
}

object UserUpdate {
  @scala.inline
  def apply(
    avatarID: String,
    curatorPoints: Double,
    dateJoined: String,
    djPoints: Double,
    fans: Double,
    id: String,
    language: String,
    listenerPoints: Double,
    status: Double,
    username: String
  ): UserUpdate = {
    val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], curatorPoints = curatorPoints.asInstanceOf[js.Any], dateJoined = dateJoined.asInstanceOf[js.Any], djPoints = djPoints.asInstanceOf[js.Any], fans = fans.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listenerPoints = listenerPoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserUpdate]
  }
}

