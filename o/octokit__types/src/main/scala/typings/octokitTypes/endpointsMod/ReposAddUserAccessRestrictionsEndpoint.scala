package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddUserAccessRestrictionsEndpoint extends js.Object {
  var branch: String
  var owner: String
  var repo: String
  /**
    * users parameter
    */
  var users: js.Array[String]
}

object ReposAddUserAccessRestrictionsEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String, users: js.Array[String]): ReposAddUserAccessRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAddUserAccessRestrictionsEndpoint]
  }
}

