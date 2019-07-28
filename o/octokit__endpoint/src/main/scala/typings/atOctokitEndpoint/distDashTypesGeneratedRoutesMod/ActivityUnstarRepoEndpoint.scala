package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityUnstarRepoEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ActivityUnstarRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActivityUnstarRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ActivityUnstarRepoEndpoint]
  }
}

