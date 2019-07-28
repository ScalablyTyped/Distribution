package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitActivityStatsParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetCommitActivityStatsParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetCommitActivityStatsParams = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetCommitActivityStatsParams]
  }
}

