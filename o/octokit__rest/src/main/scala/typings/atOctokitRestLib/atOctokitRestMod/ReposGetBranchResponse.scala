package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponse extends js.Object {
  var _links: ReposGetBranchResponseLinks
  var commit: ReposGetBranchResponseCommit
  var name: java.lang.String
  var `protected`: scala.Boolean
  var protection: ReposGetBranchResponseProtection
  var protection_url: java.lang.String
}

object ReposGetBranchResponse {
  @scala.inline
  def apply(
    _links: ReposGetBranchResponseLinks,
    commit: ReposGetBranchResponseCommit,
    name: java.lang.String,
    `protected`: scala.Boolean,
    protection: ReposGetBranchResponseProtection,
    protection_url: java.lang.String
  ): ReposGetBranchResponse = {
    val __obj = js.Dynamic.literal(_links = _links, commit = commit, name = name, protection = protection, protection_url = protection_url)
    __obj.updateDynamic("protected")(`protected`)
    __obj.asInstanceOf[ReposGetBranchResponse]
  }
}

