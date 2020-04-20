package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchParams extends js.Object {
  var branch: String
  var owner: String
  var repo: String
}

object ReposGetBranchParams {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposGetBranchParams = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchParams]
  }
}

