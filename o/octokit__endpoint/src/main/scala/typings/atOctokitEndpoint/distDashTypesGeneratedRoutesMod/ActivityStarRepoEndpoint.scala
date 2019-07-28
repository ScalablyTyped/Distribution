package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityStarRepoEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ActivityStarRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActivityStarRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ActivityStarRepoEndpoint]
  }
}

