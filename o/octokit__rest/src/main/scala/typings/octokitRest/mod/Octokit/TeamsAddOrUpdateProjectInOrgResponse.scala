package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsAddOrUpdateProjectInOrgResponse extends js.Object {
  var documentation_url: String
  var message: String
}

object TeamsAddOrUpdateProjectInOrgResponse {
  @scala.inline
  def apply(documentation_url: String, message: String): TeamsAddOrUpdateProjectInOrgResponse = {
    val __obj = js.Dynamic.literal(documentation_url = documentation_url.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsAddOrUpdateProjectInOrgResponse]
  }
}

