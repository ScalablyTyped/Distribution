package typings.octokitPluginRestEndpointMethods.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeamsCheckManagesRepoInOrgResponse extends js.Object {
  var organization: TeamsCheckManagesRepoInOrgResponseOrganization
  var parent: TeamsCheckManagesRepoInOrgResponseParent
  var permissions: TeamsCheckManagesRepoInOrgResponsePermissions
  var source: TeamsCheckManagesRepoInOrgResponseSource
}

object TeamsCheckManagesRepoInOrgResponse {
  @scala.inline
  def apply(
    organization: TeamsCheckManagesRepoInOrgResponseOrganization,
    parent: TeamsCheckManagesRepoInOrgResponseParent,
    permissions: TeamsCheckManagesRepoInOrgResponsePermissions,
    source: TeamsCheckManagesRepoInOrgResponseSource
  ): TeamsCheckManagesRepoInOrgResponse = {
    val __obj = js.Dynamic.literal(organization = organization.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TeamsCheckManagesRepoInOrgResponse]
  }
}

