package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetAllTopicsParams extends js.Object {
  var owner: String
  var repo: String
}

object ReposGetAllTopicsParams {
  @scala.inline
  def apply(owner: String, repo: String): ReposGetAllTopicsParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetAllTopicsParams]
  }
}

