package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(owner = owner, ref = ref, repo = repo)
  
    __obj.asInstanceOf[ReposGetCommitParams]
  }
}

