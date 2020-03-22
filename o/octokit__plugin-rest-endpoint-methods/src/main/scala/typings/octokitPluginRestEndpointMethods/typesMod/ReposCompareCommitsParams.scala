package typings.octokitPluginRestEndpointMethods.typesMod

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
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], head = head.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposCompareCommitsParams]
  }
}

