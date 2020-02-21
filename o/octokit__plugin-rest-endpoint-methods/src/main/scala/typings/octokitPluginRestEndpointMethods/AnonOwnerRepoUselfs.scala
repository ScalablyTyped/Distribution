package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOwnerRepoUselfs extends js.Object {
  var owner: AnonRequired
  var repo: AnonRequired
  var use_lfs: AnonEnumRequired
}

object AnonOwnerRepoUselfs {
  @scala.inline
  def apply(owner: AnonRequired, repo: AnonRequired, use_lfs: AnonEnumRequired): AnonOwnerRepoUselfs = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], use_lfs = use_lfs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonOwnerRepoUselfs]
  }
}

