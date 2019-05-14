package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateRef_Options extends js.Object {
  var owner: java.lang.String
  var ref: java.lang.String
  var repo: java.lang.String
  var sha: java.lang.String
}

object GitCreateRef_Options {
  @scala.inline
  def apply(owner: java.lang.String, ref: java.lang.String, repo: java.lang.String, sha: java.lang.String): GitCreateRef_Options = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo, sha = sha)
  
    __obj.asInstanceOf[GitCreateRef_Options]
  }
}

