package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRequestPageBuildEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposRequestPageBuildEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposRequestPageBuildEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRequestPageBuildEndpoint]
  }
}

