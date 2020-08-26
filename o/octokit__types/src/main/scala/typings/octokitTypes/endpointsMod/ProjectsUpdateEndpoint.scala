package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`10`
import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  project_id :number,   name :string | undefined,   body :string | undefined,   state :'open' | 'closed' | undefined,   organization_permission :string | undefined,   private :boolean | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsUpdateEndpoint extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.native
  var mediaType: `10` = js.native
  /**
    * The name of the project.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The permission level that determines whether all members of the project's organization can see and/or make changes to the project. Setting `organization_permission` is only available for organization projects. If an organization member belongs to a team with a higher level of access or is a collaborator with a higher level of access, their permission level is not lowered by `organization_permission`. For information on changing access for a team or collaborator, see [Add or update team project permissions](https://developer.github.com/v3/teams/#add-or-update-team-project-permissions) or [Add project collaborator](https://developer.github.com/v3/projects/collaborators/#add-project-collaborator).
    *
    * **Note:** Updating a project's `organization_permission` requires `admin` access to the project.
    *
    * Can be one of:
    * \* `read` - Organization members can read, but not write to or administer this project.
    * \* `write` - Organization members can read and write, but not administer this project.
    * \* `admin` - Organization members can read, write and administer this project.
    * \* `none` - Organization members can only see this project if it is public.
    */
  var organization_permission: js.UndefOr[String] = js.native
  /**
    * Sets the visibility of a project board. Setting `private` is only available for organization and user projects. **Note:** Updating a project's visibility requires `admin` access to the project.
    *
    * Can be one of:
    * \* `false` - Anyone can see the project.
    * \* `true` - Only the user can view a project board created on a user account. Organization members with the appropriate `organization_permission` can see project boards in an organization account.
    */
  var `private`: js.UndefOr[Boolean] = js.native
  var project_id: Double = js.native
  /**
    * State of the project. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.native
}

object ProjectsUpdateEndpoint {
  @scala.inline
  def apply(mediaType: `10`, project_id: Double): ProjectsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateEndpoint]
  }
  @scala.inline
  implicit class ProjectsUpdateEndpointOps[Self <: ProjectsUpdateEndpoint] (val x: Self) extends AnyVal {
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
    def setMediaType(value: `10`): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject_id(value: Double): Self = this.set("project_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOrganization_permission(value: String): Self = this.set("organization_permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrganization_permission: Self = this.set("organization_permission", js.undefined)
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivate: Self = this.set("private", js.undefined)
    @scala.inline
    def setState(value: open | closed): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

