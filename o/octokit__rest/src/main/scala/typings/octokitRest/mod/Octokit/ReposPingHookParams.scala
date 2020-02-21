package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposPingHookParams extends js.Object {
  var hook_id: Double
  var owner: String
  var repo: String
}

object ReposPingHookParams {
  @scala.inline
  def apply(hook_id: Double, owner: String, repo: String): ReposPingHookParams = {
    val __obj = js.Dynamic.literal(hook_id = hook_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposPingHookParams]
  }
}

