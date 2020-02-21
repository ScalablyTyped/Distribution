package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityStopWatchingRepoLegacyParams extends js.Object {
  var owner: String
  var repo: String
}

object ActivityStopWatchingRepoLegacyParams {
  @scala.inline
  def apply(owner: String, repo: String): ActivityStopWatchingRepoLegacyParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityStopWatchingRepoLegacyParams]
  }
}

