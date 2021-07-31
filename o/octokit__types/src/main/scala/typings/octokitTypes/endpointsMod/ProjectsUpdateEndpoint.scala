package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.closed
import typings.octokitTypes.octokitTypesStrings.inertia
import typings.octokitTypes.octokitTypesStrings.open
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsUpdateEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project.
    */
  var name: js.UndefOr[String] = js.undefined
  
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
object ProjectsUpdateEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[inertia], project_id: Double): ProjectsUpdateEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsUpdateEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsUpdateEndpointMutableBuilder[Self <: ProjectsUpdateEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setOrganization_permission(value: String): Self = StObject.set(x, "organization_permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization_permissionUndefined: Self = StObject.set(x, "organization_permission", js.undefined)
    
    @scala.inline
    def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateUndefined: Self = StObject.set(x, "private", js.undefined)
    
    @scala.inline
    def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: open | closed): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
