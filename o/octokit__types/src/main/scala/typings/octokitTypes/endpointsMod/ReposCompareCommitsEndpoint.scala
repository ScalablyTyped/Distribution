package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsEndpoint extends js.Object {
  var base: String
  var head: String
  var owner: String
  var repo: String
}

object ReposCompareCommitsEndpoint {
  @scala.inline
  def apply(base: String, head: String, owner: String, repo: String): ReposCompareCommitsEndpoint = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposCompareCommitsEndpoint]
  }
}

