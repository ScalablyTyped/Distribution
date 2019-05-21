package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListBranchesForHeadCommitEndpoint extends js.Object {
  var commit_sha: java.lang.String
  var owner: java.lang.String
  var repo: java.lang.String
}

object ReposListBranchesForHeadCommitEndpoint {
  @scala.inline
  def apply(commit_sha: java.lang.String, owner: java.lang.String, repo: java.lang.String): ReposListBranchesForHeadCommitEndpoint = {
    val __obj = js.Dynamic.literal(commit_sha = commit_sha, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposListBranchesForHeadCommitEndpoint]
  }
}

