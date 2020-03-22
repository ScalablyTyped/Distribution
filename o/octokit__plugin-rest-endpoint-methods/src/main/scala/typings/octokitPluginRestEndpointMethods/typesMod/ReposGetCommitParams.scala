package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitParams extends js.Object {
  var owner: String
  var ref: String
  var repo: String
}

object ReposGetCommitParams {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): ReposGetCommitParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitParams]
  }
}

