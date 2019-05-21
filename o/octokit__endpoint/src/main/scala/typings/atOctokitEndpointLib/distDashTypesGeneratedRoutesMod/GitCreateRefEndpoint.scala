package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateRefEndpoint extends js.Object {
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
  var sha: java.lang.String
}

object GitCreateRefEndpoint {
  @scala.inline
  def apply(owner: java.lang.String, ref: java.lang.String, repo: java.lang.String, sha: java.lang.String): GitCreateRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[GitCreateRefEndpoint]
  }
}

