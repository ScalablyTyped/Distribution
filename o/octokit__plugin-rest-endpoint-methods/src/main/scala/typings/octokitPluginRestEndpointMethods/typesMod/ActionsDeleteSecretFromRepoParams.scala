package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionsDeleteSecretFromRepoParams extends js.Object {
  var name: String
  var owner: String
  var repo: String
}

object ActionsDeleteSecretFromRepoParams {
  @scala.inline
  def apply(name: String, owner: String, repo: String): ActionsDeleteSecretFromRepoParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsDeleteSecretFromRepoParams]
  }
}

