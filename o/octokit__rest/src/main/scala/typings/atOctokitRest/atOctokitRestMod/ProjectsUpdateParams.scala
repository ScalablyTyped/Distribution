package typings.atOctokitRest.atOctokitRestMod

import typings.atOctokitRest.atOctokitRestStrings.closed
import typings.atOctokitRest.atOctokitRestStrings.open
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateParams extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  /**
    * The name of the project.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The permission level that determines whether all members of the project's organization can see and/or make changes to the project. Setting `organization_permission` is only available for organization projects. If an organization member belongs to a team with a higher level of access or is a collaborator with a higher level of access, their permission level is not lowered by `organization_permission`. For information on changing access for a team or collaborator, see [Add or update team project](https://developer.github.com/v3/teams/#add-or-update-team-project) or [Add user as a collaborator](https://developer.github.com/v3/projects/collaborators/#add-user-as-a-collaborator).
    *
    * **Note:** Updating a project's `organization_permission` requires `admin` access to the project.
    *
    * Can be one of:
    * \* `read` - Organization members can read, but not write to or administer this project.
    * \* `write` - Organization members can read and write, but not administer this project.
    * \* `admin` - Organization members can read, write and administer this project.
    * \* `none` - Organization members can only see this project if it is public.
    */
  var organization_permission: js.UndefOr[String] = js.undefined
  /**
    * Sets the visibility of a project board. Setting `private` is only available for organization and user projects. **Note:** Updating a project's visibility requires `admin` access to the project.
    *
    * Can be one of:
    * \* `false` - Anyone can see the project.
    * \* `true` - Only the user can view a project board created on a user account. Organization members with the appropriate `organization_permission` can see project boards in an organization account.
    */
  var `private`: js.UndefOr[Boolean] = js.undefined
  var project_id: Double
  /**
    * State of the project. Either `open` or `closed`.
    */
  var state: js.UndefOr[open | closed] = js.undefined
}

object ProjectsUpdateParams {
  @scala.inline
  def apply(
    project_id: Double,
    body: String = null,
    name: String = null,
    organization_permission: String = null,
    `private`: js.UndefOr[Boolean] = js.undefined,
    state: open | closed = null
  ): ProjectsUpdateParams = {
    val __obj = js.Dynamic.literal(project_id = project_id.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (organization_permission != null) __obj.updateDynamic("organization_permission")(organization_permission.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateParams]
  }
}

