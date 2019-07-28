package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposCompareCommitsParams extends js.Object {
  var base: String
  var head: String
  var owner: String
  var repo: String
}

object ReposCompareCommitsParams {
  @scala.inline
  def apply(base: String, head: String, owner: String, repo: String): ReposCompareCommitsParams = {
    val __obj = js.Dynamic.literal(base = base, head = head, owner = owner, repo = repo)
  
    __obj.asInstanceOf[ReposCompareCommitsParams]
  }
}

