package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveProtectedBranchAppRestrictionsParams extends js.Object {
  var apps: js.Array[String]
  var branch: String
  var owner: String
  var repo: String
}

object ReposRemoveProtectedBranchAppRestrictionsParams {
  @scala.inline
  def apply(apps: js.Array[String], branch: String, owner: String, repo: String): ReposRemoveProtectedBranchAppRestrictionsParams = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposRemoveProtectedBranchAppRestrictionsParams]
  }
}

