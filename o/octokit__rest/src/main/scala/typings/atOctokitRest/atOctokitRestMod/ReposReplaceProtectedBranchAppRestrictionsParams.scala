package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposReplaceProtectedBranchAppRestrictionsParams extends js.Object {
  var apps: js.Array[String]
  var branch: String
  var owner: String
  var repo: String
}

object ReposReplaceProtectedBranchAppRestrictionsParams {
  @scala.inline
  def apply(apps: js.Array[String], branch: String, owner: String, repo: String): ReposReplaceProtectedBranchAppRestrictionsParams = {
    val __obj = js.Dynamic.literal(apps = apps, branch = branch, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposReplaceProtectedBranchAppRestrictionsParams]
  }
}

