package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCheckCollaboratorEndpoint extends js.Object {
  var owner: String
  var repo: String
  var username: String
}

object ReposCheckCollaboratorEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, username: String): ReposCheckCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, username = username)
  
    __obj.asInstanceOf[ReposCheckCollaboratorEndpoint]
  }
}

