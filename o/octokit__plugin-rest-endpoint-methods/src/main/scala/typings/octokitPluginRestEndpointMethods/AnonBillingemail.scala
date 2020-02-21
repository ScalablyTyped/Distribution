package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBillingemail extends js.Object {
  var billing_email: AnonType
  var company: AnonType
  var default_repository_permission: AnonEnum
  var description: AnonType
  var email: AnonType
  var has_organization_projects: AnonType
  var has_repository_projects: AnonType
  var location: AnonType
  var members_allowed_repository_creation_type: AnonEnum
  var members_can_create_internal_repositories: AnonType
  var members_can_create_private_repositories: AnonType
  var members_can_create_public_repositories: AnonType
  var members_can_create_repositories: AnonType
  var name: AnonType
  var org: AnonRequired
}

object AnonBillingemail {
  @scala.inline
  def apply(
    billing_email: AnonType,
    company: AnonType,
    default_repository_permission: AnonEnum,
    description: AnonType,
    email: AnonType,
    has_organization_projects: AnonType,
    has_repository_projects: AnonType,
    location: AnonType,
    members_allowed_repository_creation_type: AnonEnum,
    members_can_create_internal_repositories: AnonType,
    members_can_create_private_repositories: AnonType,
    members_can_create_public_repositories: AnonType,
    members_can_create_repositories: AnonType,
    name: AnonType,
    org: AnonRequired
  ): AnonBillingemail = {
    val __obj = js.Dynamic.literal(billing_email = billing_email.asInstanceOf[js.Any], company = company.asInstanceOf[js.Any], default_repository_permission = default_repository_permission.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], has_organization_projects = has_organization_projects.asInstanceOf[js.Any], has_repository_projects = has_repository_projects.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], members_allowed_repository_creation_type = members_allowed_repository_creation_type.asInstanceOf[js.Any], members_can_create_internal_repositories = members_can_create_internal_repositories.asInstanceOf[js.Any], members_can_create_private_repositories = members_can_create_private_repositories.asInstanceOf[js.Any], members_can_create_public_repositories = members_can_create_public_repositories.asInstanceOf[js.Any], members_can_create_repositories = members_can_create_repositories.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], org = org.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBillingemail]
  }
}

