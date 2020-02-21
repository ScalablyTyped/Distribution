package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsUpdateResponseBase extends js.Object {
  var label: String
  var ref: String
  var repo: PullsUpdateResponseBaseRepo
  var sha: String
  var user: PullsUpdateResponseBaseUser
}

object PullsUpdateResponseBase {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsUpdateResponseBaseRepo,
    sha: String,
    user: PullsUpdateResponseBaseUser
  ): PullsUpdateResponseBase = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsUpdateResponseBase]
  }
}

