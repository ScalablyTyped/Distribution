package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetTagEndpoint extends js.Object {
  var owner: java.lang.String
  var repo: java.lang.String
  var tag_sha: java.lang.String
}

object GitGetTagEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, repo: java.lang.String, tag_sha: java.lang.String): GitGetTagEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo, tag_sha = tag_sha)
  
    __obj.asInstanceOf[GitGetTagEndpoint]
  }
}

