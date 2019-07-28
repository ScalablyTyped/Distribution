package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateRefEndpoint extends js.Object {
  var owner: String
  var ref: String
  var repo: String
  var sha: String
}

object GitCreateRefEndpoint {
  @scala.inline
  def apply(owner: String, ref: String, repo: String, sha: String): GitCreateRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[GitCreateRefEndpoint]
  }
}

