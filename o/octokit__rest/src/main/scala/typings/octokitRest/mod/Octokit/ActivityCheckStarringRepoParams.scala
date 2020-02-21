package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityCheckStarringRepoParams extends js.Object {
  var owner: String
  var repo: String
}

object ActivityCheckStarringRepoParams {
  @scala.inline
  def apply(owner: String, repo: String): ActivityCheckStarringRepoParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActivityCheckStarringRepoParams]
  }
}

