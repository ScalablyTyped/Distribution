package typings.octokitRest.mod.Octokit

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
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponse]
  }
}

