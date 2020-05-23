package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Teams extends js.Object {
  var teams: js.Array[Description]
  var teams_url: String
  var url: String
  var users: js.Array[Eventsurl]
  var users_url: String
}

object Teams {
  @scala.inline
  def apply(
    teams: js.Array[Description],
    teams_url: String,
    url: String,
    users: js.Array[Eventsurl],
    users_url: String
  ): Teams = {
    val __obj = js.Dynamic.literal(teams = teams.asInstanceOf[js.Any], teams_url = teams_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], users_url = users_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Teams]
  }
}

