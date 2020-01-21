package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PullsCreateResponseBase extends js.Object {
  var label: String
  var ref: String
  var repo: PullsCreateResponseBaseRepo
  var sha: String
  var user: PullsCreateResponseBaseUser
}

object PullsCreateResponseBase {
  @scala.inline
  def apply(
    label: String,
    ref: String,
    repo: PullsCreateResponseBaseRepo,
    sha: String,
    user: PullsCreateResponseBaseUser
  ): PullsCreateResponseBase = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any], sha = sha.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PullsCreateResponseBase]
  }
}

