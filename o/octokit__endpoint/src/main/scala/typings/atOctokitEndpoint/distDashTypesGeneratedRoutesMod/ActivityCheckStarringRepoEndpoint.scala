package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityCheckStarringRepoEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ActivityCheckStarringRepoEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ActivityCheckStarringRepoEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ActivityCheckStarringRepoEndpoint]
  }
}

