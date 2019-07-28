package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitActivityStatsEndpoint extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetCommitActivityStatsEndpoint {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetCommitActivityStatsEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposGetCommitActivityStatsEndpoint]
  }
}

