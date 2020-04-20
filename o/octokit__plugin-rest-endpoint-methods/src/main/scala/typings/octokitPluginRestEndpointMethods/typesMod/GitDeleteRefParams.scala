package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitDeleteRefParams extends js.Object {
  var owner: String
  var ref: String
  var repo: String
}

object GitDeleteRefParams {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): GitDeleteRefParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitDeleteRefParams]
  }
}

