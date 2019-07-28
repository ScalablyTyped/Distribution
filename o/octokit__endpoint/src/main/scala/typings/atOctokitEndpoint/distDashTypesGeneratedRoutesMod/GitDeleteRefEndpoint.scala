package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitDeleteRefEndpoint extends js.Object {
  var owner: String
  var ref: String
  var repo: String
}

object GitDeleteRefEndpoint {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): GitDeleteRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[GitDeleteRefEndpoint]
  }
}

