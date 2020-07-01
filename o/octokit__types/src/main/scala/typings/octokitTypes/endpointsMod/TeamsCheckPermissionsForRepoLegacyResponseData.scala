package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.Allowmergecommit
import typings.octokitTypes.anon.Eventsurl
import typings.octokitTypes.anon.Maintain
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCheckPermissionsForRepoLegacyResponseData extends js.Object {
  var organization: Eventsurl
  var parent: Allowmergecommit
  var permissions: Maintain
  var source: Allowmergecommit
}

object TeamsCheckPermissionsForRepoLegacyResponseData {
  @scala.inline
  def apply(organization: Eventsurl, parent: Allowmergecommit, permissions: Maintain, source: Allowmergecommit): TeamsCheckPermissionsForRepoLegacyResponseData = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamsCheckPermissionsForRepoLegacyResponseData]
  }
}

