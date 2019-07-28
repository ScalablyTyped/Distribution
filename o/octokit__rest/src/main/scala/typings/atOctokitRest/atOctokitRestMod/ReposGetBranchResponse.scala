package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponse extends js.Object {
  var _links: ReposGetBranchResponseLinks
  var commit: ReposGetBranchResponseCommit
  var name: String
  var `protected`: Boolean
  var protection: ReposGetBranchResponseProtection
  var protection_url: String
}

object ReposGetBranchResponse {
  @scala.inline
  def apply(
    _links: ReposGetBranchResponseLinks,
    commit: ReposGetBranchResponseCommit,
    name: String,
    `protected`: Boolean,
    protection: ReposGetBranchResponseProtection,
    protection_url: String
  ): ReposGetBranchResponse = {
    val __obj = js.Dynamic.literal(_links = _links, commit = commit, name = name, protection = protection, protection_url = protection_url)
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[ReposGetBranchResponse]
  }
}

