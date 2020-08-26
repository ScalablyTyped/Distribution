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

@js.native
trait OrgsUpdateEndpoint extends js.Object {
  /**
    * Billing email address. This address is not publicized.
    */
  var billing_email: js.UndefOr[String] = js.native
  /**
    * The company name.
    */
  var company: js.UndefOr[String] = js.native
  /**
    * Default permission level members have for organization repositories:
    * \* `read` - can pull, but not push to or administer this repository.
    * \* `write` - can pull and push, but not administer this repository.
    * \* `admin` - can pull, push, and administer this repository.
    * \* `none` - no permissions granted by default.
    */
  var default_repository_permission: js.UndefOr[read | write | admin | none] = js.native
  /**
    * The description of the company.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The publicly visible email address.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Toggles whether an organization can use organization projects.
    */
  var has_organization_projects: js.UndefOr[Boolean] = js.native
  /**
    * Toggles whether repositories that belong to the organization can use repository projects.
    */
  var has_repository_projects: js.UndefOr[Boolean] = js.native
  /**
    * The location.
    */
  var location: js.UndefOr[String] = js.native
  /**
    * Specifies which types of repositories non-admin organization members can create. Can be one of:
    * \* `all` - all organization members can create public and private repositories.
    * \* `private` - members can create private repositories. This option is only available to repositories that are part of an organization on GitHub Enterprise Cloud.
    * \* `none` - only admin members can create repositories.
    * **Note:** This parameter is deprecated and will be removed in the future. Its return value ignores internal repositories. Using this parameter overrides values set in `members_can_create_repositories`. See [this note](https://developer.github.com/v3/orgs/#members_can_create_repositories) for details.
    */
  var members_allowed_repository_creation_type: js.UndefOr[all | `private` | none] = js.native
  /**
    * Toggles whether organization members can create internal repositories, which are visible to all enterprise members. You can only allow members to create internal repositories if your organization is associated with an enterprise account using GitHub Enterprise Cloud or GitHub Enterprise Server 2.20+. Can be one of:
    * \* `true` - all organization members can create internal repositories.
    * \* `false` - only organization owners can create internal repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)".
    */
  var members_can_create_internal_repositories: js.UndefOr[Boolean] = js.native
  /**
    * Toggles whether organization members can create private repositories, which are visible to organization members with permission. Can be one of:
    * \* `true` - all organization members can create private repositories.
    * \* `false` - only organization owners can create private repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)".
    */
  var members_can_create_private_repositories: js.UndefOr[Boolean] = js.native
  /**
    * Toggles whether organization members can create public repositories, which are visible to anyone. Can be one of:
    * \* `true` - all organization members can create public repositories.
    * \* `false` - only organization owners can create public repositories.
    * Default: `true`. For more information, see "[Restricting repository creation in your organization](https://docs.github.com/github/setting-up-and-managing-organizations-and-teams/restricting-repository-creation-in-your-organization)".
    */
  var members_can_create_public_repositories: js.UndefOr[Boolean] = js.native
  /**
    * Toggles the ability of non-admin organization members to create repositories. Can be one of:
    * \* `true` - all organization members can create repositories.
    * \* `false` - only organization owners can create repositories.
    * Default: `true`
    * **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details. **Note:** A parameter can override this parameter. See `members_allowed_repository_creation_type` in this table for details.
    */
  var members_can_create_repositories: js.UndefOr[Boolean] = js.native
  /**
    * The shorthand name of the company.
    */
  var name: js.UndefOr[String] = js.native
  @JSName("org")
  var org_ : String = js.native
  /**
    * The Twitter username of the company.
    */
  var twitter_username: js.UndefOr[String] = js.native
}

object OrgsUpdateEndpoint {
  @scala.inline
  def apply(org_ : String): OrgsUpdateEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrgsUpdateEndpoint]
  }
  @scala.inline
  implicit class OrgsUpdateEndpointOps[Self <: OrgsUpdateEndpoint] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOrg_(value: String): Self = this.set("org", value.asInstanceOf[js.Any])
    @scala.inline
    def setBilling_email(value: String): Self = this.set("billing_email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBilling_email: Self = this.set("billing_email", js.undefined)
    @scala.inline
    def setCompany(value: String): Self = this.set("company", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompany: Self = this.set("company", js.undefined)
    @scala.inline
    def setDefault_repository_permission(value: read | write | admin | none): Self = this.set("default_repository_permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefault_repository_permission: Self = this.set("default_repository_permission", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setHas_organization_projects(value: Boolean): Self = this.set("has_organization_projects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHas_organization_projects: Self = this.set("has_organization_projects", js.undefined)
    @scala.inline
    def setHas_repository_projects(value: Boolean): Self = this.set("has_repository_projects", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHas_repository_projects: Self = this.set("has_repository_projects", js.undefined)
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMembers_allowed_repository_creation_type(value: all | `private` | none): Self = this.set("members_allowed_repository_creation_type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers_allowed_repository_creation_type: Self = this.set("members_allowed_repository_creation_type", js.undefined)
    @scala.inline
    def setMembers_can_create_internal_repositories(value: Boolean): Self = this.set("members_can_create_internal_repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers_can_create_internal_repositories: Self = this.set("members_can_create_internal_repositories", js.undefined)
    @scala.inline
    def setMembers_can_create_private_repositories(value: Boolean): Self = this.set("members_can_create_private_repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers_can_create_private_repositories: Self = this.set("members_can_create_private_repositories", js.undefined)
    @scala.inline
    def setMembers_can_create_public_repositories(value: Boolean): Self = this.set("members_can_create_public_repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers_can_create_public_repositories: Self = this.set("members_can_create_public_repositories", js.undefined)
    @scala.inline
    def setMembers_can_create_repositories(value: Boolean): Self = this.set("members_can_create_repositories", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers_can_create_repositories: Self = this.set("members_can_create_repositories", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setTwitter_username(value: String): Self = this.set("twitter_username", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTwitter_username: Self = this.set("twitter_username", js.undefined)
  }
  
}

