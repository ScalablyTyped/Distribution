package typings.atOctokitEndpoint.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposMergeEndpoint extends js.Object {
  var base: String
  var commit_message: js.UndefOr[String] = js.undefined
  var head: String
  var owner: String
  var repo: String
}

object ReposMergeEndpoint {
  @scala.inline
  def apply(base: String, head: String, owner: String, repo: String, commit_message: String = null): ReposMergeEndpoint = {
    val __obj = js.Dynamic.literal(base = base, head = head, owner = owner, repo = repo)
    if (commit_message != null) __obj.updateDynamic("commit_message")(commit_message)
    __obj.asInstanceOf[ReposMergeEndpoint]
  }
}

