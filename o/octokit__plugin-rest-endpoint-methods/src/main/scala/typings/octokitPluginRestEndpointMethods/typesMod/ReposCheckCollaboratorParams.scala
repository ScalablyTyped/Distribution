package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCheckCollaboratorParams extends js.Object {
  var owner: String
  var repo: String
  var username: String
}

object ReposCheckCollaboratorParams {
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposCheckCollaboratorParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCheckCollaboratorParams]
  }
}

