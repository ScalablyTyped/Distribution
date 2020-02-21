package typings.octokitRest.mod.Octokit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCheckIfMergedParams extends js.Object {
  var owner: String
  var pull_number: Double
  var repo: String
}

object PullsCheckIfMergedParams {
  @scala.inline
  def apply(owner: String, pull_number: Double, repo: String): PullsCheckIfMergedParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], pull_number = pull_number.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCheckIfMergedParams]
  }
}

