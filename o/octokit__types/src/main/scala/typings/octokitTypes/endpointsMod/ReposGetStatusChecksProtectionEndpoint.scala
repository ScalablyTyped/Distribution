package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetStatusChecksProtectionEndpoint extends js.Object {
  var branch: String
  var owner: String
  var repo: String
}

object ReposGetStatusChecksProtectionEndpoint {
  @scala.inline
  def apply(branch: String, owner: String, repo: String): ReposGetStatusChecksProtectionEndpoint = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetStatusChecksProtectionEndpoint]
  }
}

