package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.`private`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.all
import typings.octokitTypes.octokitTypesStrings.none
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.write
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateEndpoint extends js.Object {
  /**
    * Billing email address. This address is not publicized.
    */
  var billing_email: js.UndefOr[String] = js.undefined
  /**
    * The company name.
    */
  var company: js.UndefOr[String] = js.undefined
  /**
    * Default permission level members have for organization repositories:
    * \* `read` - can pull, but not push to or administer this repository.
    * \* `write` - can pull and push, but not administer this repository.
    * \* `admin` - can pull, push, and administer this repository.
    * \* `none` - no permissions granted by default.
    */
  var default_repository_permission: js.UndefOr[read | write | admin | none] = js.undefined
  /**
    * The description of the company.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The publicly visible email address.
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * Toggles whether an organization can use organization projects.
    */
  var has_organization_projects: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggles whether repositories that belong to the organization can use repository projects.
    */
  var has_repository_projects: js.UndefOr[Boolean] = js.undefined
  /**
    * The location.
    */
  var location: js.UndefOr[String] = js.undefined
  /**
    * Specifies which types of repositories non-admin organization members can create. Can be one of:
    * \* `all` - all organization members can create public and private repositories.
    * \* `private` - members can create private repositories. This option is only available to repositories that are part of an organization on GitHub Enterprise Cloud.
    * \* `none` - only admin members can create repositories.
    * **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See [this note](https://developer.github.com/v3/orgs/#members_can_create_repositories) for details.
    */
  var members_allowed_repository_creation_type: js.UndefOr[all | `private` | none] = js.undefined
  /**
    * Toggles whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. Can be one of:
    * \* `true` - all organization members can create internal repositories.
    * \* `false` - only organization owners can create internal repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://help.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation.
    */
  var members_can_create_internal_repositories: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggles whether organization members can create private repositories, which are visible to organization members with permission. Can be one of:
    * \* `true` - all organization members can create private repositories.
    * \* `false` - only organization owners can create private repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://help.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation.
    */
  var members_can_create_private_repositories: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggles whether organization members can create public repositories, which are visible to anyone. Can be one of:
    * \* `true` - all organization members can create public repositories.
    * \* `false` - only organization owners can create public repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://help.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)" in the GitHub Help documentation.
    */
  var members_can_create_public_repositories: js.UndefOr[Boolean] = js.undefined
  /**
    * Toggles the ability of non-admin organization members to create repositories. Can be one of:
    * \* `true` - all organization members can create repositories.
    * \* `false` - only organization owners can create repositories.
    * Default: `true`
    * **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.
    */
  var members_can_create_repositories: js.UndefOr[Boolean] = js.undefined
  /**
    * The shorthand name of the company.
    */
  var name: js.UndefOr[String] = js.undefined
  @JSName("org")
  var org_ : String
}

object OrgsUpdateEndpoint {
  @scala.inline
  def apply(
    org_ : String,
    billing_email: String = null,
    company: String = null,
    default_repository_permission: read | write | admin | none = null,
    description: String = null,
    email: String = null,
    has_organization_projects: js.UndefOr[Boolean] = js.undefined,
    has_repository_projects: js.UndefOr[Boolean] = js.undefined,
    location: String = null,
    members_allowed_repository_creation_type: all | `private` | none = null,
    members_can_create_internal_repositories: js.UndefOr[Boolean] = js.undefined,
    members_can_create_private_repositories: js.UndefOr[Boolean] = js.undefined,
    members_can_create_public_repositories: js.UndefOr[Boolean] = js.undefined,
    members_can_create_repositories: js.UndefOr[Boolean] = js.undefined,
    name: String = null
  ): OrgsUpdateEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    if (billing_email != null) __obj.updateDynamic("billing_email")(billing_email.asInstanceOf[js.Any])
    if (company != null) __obj.updateDynamic("company")(company.asInstanceOf[js.Any])
    if (default_repository_permission != null) __obj.updateDynamic("default_repository_permission")(default_repository_permission.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(has_organization_projects)) __obj.updateDynamic("has_organization_projects")(has_organization_projects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(has_repository_projects)) __obj.updateDynamic("has_repository_projects")(has_repository_projects.get.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (members_allowed_repository_creation_type != null) __obj.updateDynamic("members_allowed_repository_creation_type")(members_allowed_repository_creation_type.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_internal_repositories)) __obj.updateDynamic("members_can_create_internal_repositories")(members_can_create_internal_repositories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_private_repositories)) __obj.updateDynamic("members_can_create_private_repositories")(members_can_create_private_repositories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_public_repositories)) __obj.updateDynamic("members_can_create_public_repositories")(members_can_create_public_repositories.get.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_repositories)) __obj.updateDynamic("members_can_create_repositories")(members_can_create_repositories.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateEndpoint]
  }
}

