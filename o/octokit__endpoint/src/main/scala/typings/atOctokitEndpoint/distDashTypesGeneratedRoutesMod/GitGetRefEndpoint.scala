package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitGetRefEndpoint extends js.Object {
  var owner: String
  var ref: String
  var repo: String
}

object GitGetRefEndpoint {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): GitGetRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[GitGetRefEndpoint]
  }
}

