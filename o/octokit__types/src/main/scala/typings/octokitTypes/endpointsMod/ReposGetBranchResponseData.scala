package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Enabled
import typings.octokitTypes.anon.Html
import typings.octokitTypes.anon.Parents
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposGetBranchResponseData extends js.Object {
  var _links: Html
  var commit: Parents
  var name: String
  var `protected`: Boolean
  var protection: Enabled
  var protection_url: String
}

object ReposGetBranchResponseData {
  @scala.inline
  def apply(
    _links: Html,
    commit: Parents,
    name: String,
    `protected`: Boolean,
    protection: Enabled,
    protection_url: String
  ): ReposGetBranchResponseData = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], protection = protection.asInstanceOf[js.Any], protection_url = protection_url.asInstanceOf[js.Any])
    __obj.updateDynamic("protected")(`protected`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposGetBranchResponseData]
  }
}

