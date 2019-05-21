package typings
package atOctokitEndpointLib.distDashTypesGeneratedRoutesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateEndpoint extends js.Object {
  var billing_email: js.UndefOr[java.lang.String] = js.undefined
  var company: js.UndefOr[java.lang.String] = js.undefined
  var default_repository_permission: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var email: js.UndefOr[java.lang.String] = js.undefined
  var has_organization_projects: js.UndefOr[scala.Boolean] = js.undefined
  var has_repository_projects: js.UndefOr[scala.Boolean] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var members_allowed_repository_creation_type: js.UndefOr[java.lang.String] = js.undefined
  var members_can_create_repositories: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var org: java.lang.String
}

object OrgsUpdateEndpoint {
  @scala.inline
  def apply(
    org: java.lang.String,
    billing_email: java.lang.String = null,
    company: java.lang.String = null,
    default_repository_permission: java.lang.String = null,
    description: java.lang.String = null,
    email: java.lang.String = null,
    has_organization_projects: js.UndefOr[scala.Boolean] = js.undefined,
    has_repository_projects: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    members_allowed_repository_creation_type: java.lang.String = null,
    members_can_create_repositories: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): OrgsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(org = org)
    if (billing_email != null) __obj.updateDynamic("billing_email")(billing_email)
    if (company != null) __obj.updateDynamic("company")(company)
    if (default_repository_permission != null) __obj.updateDynamic("default_repository_permission")(default_repository_permission)
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(has_organization_projects)) __obj.updateDynamic("has_organization_projects")(has_organization_projects)
    if (!js.isUndefined(has_repository_projects)) __obj.updateDynamic("has_repository_projects")(has_repository_projects)
    if (location != null) __obj.updateDynamic("location")(location)
    if (members_allowed_repository_creation_type != null) __obj.updateDynamic("members_allowed_repository_creation_type")(members_allowed_repository_creation_type)
    if (!js.isUndefined(members_can_create_repositories)) __obj.updateDynamic("members_can_create_repositories")(members_can_create_repositories)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OrgsUpdateEndpoint]
  }
}

