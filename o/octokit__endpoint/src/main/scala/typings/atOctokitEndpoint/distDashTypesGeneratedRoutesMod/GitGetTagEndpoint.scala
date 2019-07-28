package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTagEndpoint extends js.Object {
  var owner: String
  var repo: String
  var tag_sha: String
}

object GitGetTagEndpoint {
  @scala.inline
  def apply(owner: String, repo: String, tag_sha: String): GitGetTagEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag_sha = tag_sha)
  
    __obj.asInstanceOf[GitGetTagEndpoint]
  }
}

