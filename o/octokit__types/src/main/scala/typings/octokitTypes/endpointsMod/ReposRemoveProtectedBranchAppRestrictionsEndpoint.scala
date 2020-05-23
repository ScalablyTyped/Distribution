package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposRemoveProtectedBranchAppRestrictionsEndpoint extends js.Object {
  /**
    * apps parameter
    */
  var apps: js.Array[String]
  var branch: String
  var owner: String
  var repo: String
}

object ReposRemoveProtectedBranchAppRestrictionsEndpoint {
  @scala.inline
  def apply(apps: js.Array[String], branch: String, owner: String, repo: String): ReposRemoveProtectedBranchAppRestrictionsEndpoint = {
    val __obj = js.Dynamic.literal(apps = apps.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposRemoveProtectedBranchAppRestrictionsEndpoint]
  }
}

