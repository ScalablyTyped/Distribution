package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitRefShaParams extends js.Object {
  var owner: String
  var ref: String
  var repo: String
}

object ReposGetCommitRefShaParams {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): ReposGetCommitRefShaParams = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposGetCommitRefShaParams]
  }
}

