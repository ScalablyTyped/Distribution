package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectsUpdateParams extends js.Object {
  /**
    * The description of the project.
    */
  var body: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the project.
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The permission level that determines whether all members of the project's organization can see and/or make changes to the project. Setting `organization_permission` is only available for organization projects. If an organization member belongs to a team with a higher level of access or is a collaborator with a higher level of access, their permission level is not lowered by `organization_permission`. For information on changing access for a team or collaborator, see [Add or update team project](https://developer.github.com/v3/teams/#add-or-update-team-project) or [Add user as a collaborator](https://developer.github.com/v3/projects/collaborators/#add-user-as-a-collaborator).  ,*   ,* **Note:** Updating a project's `organization_permission` requires `admin` access to the project.  ,*   ,* Can be one of:  ,* \* `read` - Organization members can read, but not write to or administer this project.  ,* \* `write` - Organization members can read and write, but not administer this project.  ,* \* `admin` - Organization members can read, write and administer this project.  ,* \* `none` - Organization members can only see this project if it is public.
    */
  var organization_permission: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Page number of the results to fetch.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Results per page (max 100)
    */
  var per_page: js.UndefOr[scala.Double] = js.undefined
  /**
    * Sets the visibility of a project board. Setting `private` is only available for organization and user projects. **Note:** Updating a project's visibility requires `admin` access to the project.  ,*   ,* Can be one of:  ,* \* `false` - Anyone can see the project.  ,* \* `true` - Only the user can view a project board created on a user account. Organization members with the appropriate `organization_permission` can see project boards in an organization account.
    */
  var `private`: js.UndefOr[scala.Boolean] = js.undefined
  var project_id: scala.Double
  /**
    * State of the project. Either `open` or `closed`.
    */
  var state: js.UndefOr[
    atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed
  ] = js.undefined
}

object ProjectsUpdateParams {
  @scala.inline
  def apply(
    project_id: scala.Double,
    body: java.lang.String = null,
    name: java.lang.String = null,
    organization_permission: java.lang.String = null,
    page: scala.Int | scala.Double = null,
    per_page: scala.Int | scala.Double = null,
    `private`: js.UndefOr[scala.Boolean] = js.undefined,
    state: atOctokitRestLib.atOctokitRestLibStrings.open | atOctokitRestLib.atOctokitRestLibStrings.closed = null
  ): ProjectsUpdateParams = {
    val __obj = js.Dynamic.literal(project_id = project_id)
    if (body != null) __obj.updateDynamic("body")(body)
    if (name != null) __obj.updateDynamic("name")(name)
    if (organization_permission != null) __obj.updateDynamic("organization_permission")(organization_permission)
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (per_page != null) __obj.updateDynamic("per_page")(per_page.asInstanceOf[js.Any])
    if (!js.isUndefined(`private`)) __obj.updateDynamic("private")(`private`)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateParams]
  }
}

