package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCombinedStatusForRefEndpoint extends js.Object {
  var owner: String
  var ref: String
  var repo: String
}

object ReposGetCombinedStatusForRefEndpoint {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): ReposGetCombinedStatusForRefEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[ReposGetCombinedStatusForRefEndpoint]
  }
}

