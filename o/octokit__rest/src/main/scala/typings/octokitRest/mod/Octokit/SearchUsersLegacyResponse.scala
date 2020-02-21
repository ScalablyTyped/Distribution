package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUsersLegacyResponse extends js.Object {
  var users: js.Array[SearchUsersLegacyResponseUsersItem]
}

object SearchUsersLegacyResponse {
  @scala.inline
  def apply(users: js.Array[SearchUsersLegacyResponseUsersItem]): SearchUsersLegacyResponse = {
    val __obj = js.Dynamic.literal(users = users.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchUsersLegacyResponse]
  }
}

