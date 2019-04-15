package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OrgsUpdateParams extends js.Object {
  /**
    * Billing email address. This address is not publicized.
    */
  var billing_email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The company name.
    */
  var company: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Default permission level members have for organization repositories:
    * \* `read` - can pull, but not push to or administer this repository.
    * \* `write` - can pull and push, but not administer this repository.
    * \* `admin` - can pull, push, and administer this repository.
    * \* `none` - no permissions granted by default.
    */
  var default_repository_permission: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.read | atOctokitRestLib.atOctokitRestLibStrings.write | atOctokitRestLib.atOctokitRestLibStrings.admin | atOctokitRestLib.atOctokitRestLibStrings.none
  ] = js.undefined
  /**
    * The description of the company.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The publicly visible email address.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Toggles whether organization projects are enabled for the organization.
    */
  var has_organization_projects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Toggles whether repository projects are enabled for repositories that belong to the organization.
    */
  var has_repository_projects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The location.
    */
  var location: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies which types of repositories non-admin organization members can create. Can be one of:
    * \* `all` - all organization members can create public and private repositories.
    * \* `private` - members can create private repositories. This option is only available to repositories that are part of an organization on [GitHub Business Cloud](https://github.com/pricing/business-cloud).
    * \* `none` - only admin members can create repositories.
    * **Note:** Using this parameter will override values set in `members_can_create_repositories`. See [this note](#members_can_create_repositories) for details.
    */
  var members_allowed_repository_creation_type: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.`private` | atOctokitRestLib.atOctokitRestLibStrings.none
  ] = js.undefined
  /**
    * Toggles the ability of non-admin organization members to create repositories. Can be one of:
    * \* `true` - all organization members can create repositories.
    * \* `false` - only admin members can create repositories.
    * Default: `true`
    * **Note:** Another parameter can override the this parameter. See [this note](#members_can_create_repositories) for details. **Note:** Another parameter can override the this parameter. See [this note](#members_can_create_repositories) for details.
    */
  var members_can_create_repositories: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The shorthand name of the company.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  var org: java.lang.String
}

object OrgsUpdateParams {
  @scala.inline
  def apply(
    org: java.lang.String,
    billing_email: java.lang.String = null,
    company: java.lang.String = null,
    default_repository_permission: atOctokitRestLib.atOctokitRestLibStrings.read | atOctokitRestLib.atOctokitRestLibStrings.write | atOctokitRestLib.atOctokitRestLibStrings.admin | atOctokitRestLib.atOctokitRestLibStrings.none = null,
    description: java.lang.String = null,
    email: java.lang.String = null,
    has_organization_projects: js.UndefOr[scala.Boolean] = js.undefined,
    has_repository_projects: js.UndefOr[scala.Boolean] = js.undefined,
    location: java.lang.String = null,
    members_allowed_repository_creation_type: atOctokitRestLib.atOctokitRestLibStrings.all | atOctokitRestLib.atOctokitRestLibStrings.`private` | atOctokitRestLib.atOctokitRestLibStrings.none = null,
    members_can_create_repositories: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null
  ): OrgsUpdateParams = {
    val __obj = js.Dynamic.literal(org = org)
    if (billing_email != null) __obj.updateDynamic("billing_email")(billing_email)
    if (company != null) __obj.updateDynamic("company")(company)
    if (default_repository_permission != null) __obj.updateDynamic("default_repository_permission")(default_repository_permission.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description)
    if (email != null) __obj.updateDynamic("email")(email)
    if (!js.isUndefined(has_organization_projects)) __obj.updateDynamic("has_organization_projects")(has_organization_projects)
    if (!js.isUndefined(has_repository_projects)) __obj.updateDynamic("has_repository_projects")(has_repository_projects)
    if (location != null) __obj.updateDynamic("location")(location)
    if (members_allowed_repository_creation_type != null) __obj.updateDynamic("members_allowed_repository_creation_type")(members_allowed_repository_creation_type.asInstanceOf[js.Any])
    if (!js.isUndefined(members_can_create_repositories)) __obj.updateDynamic("members_can_create_repositories")(members_can_create_repositories)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[OrgsUpdateParams]
  }
}

