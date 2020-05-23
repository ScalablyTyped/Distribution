package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetCommitEndpoint extends js.Object {
  var owner: String
  var ref: String
  var repo: String
}

object ReposGetCommitEndpoint {
  @scala.inline
  def apply(owner: String, ref: String, repo: String): ReposGetCommitEndpoint = {
    val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], ref = ref.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetCommitEndpoint]
  }
}

