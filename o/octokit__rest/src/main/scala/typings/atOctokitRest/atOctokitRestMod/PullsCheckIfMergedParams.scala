package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(owner = owner, pull_number = pull_number, repo = repo)
  
    __obj.asInstanceOf[PullsCheckIfMergedParams]
  }
}

