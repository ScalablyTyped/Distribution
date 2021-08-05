package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.admin
import typings.octokitTypes.octokitTypesStrings.inertia
import typings.octokitTypes.octokitTypesStrings.read
import typings.octokitTypes.octokitTypesStrings.write
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsAddCollaboratorEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  /**
    * The permission to grant the collaborator. Note that, if you choose not to pass any parameters, you'll need to set `Content-Length` to zero when calling out to this endpoint. For more information, see "[HTTP verbs](https://developer.github.com/v3/#http-verbs)." Can be one of:
    * \* `read` - can read, but not write to or administer this project.
    * \* `write` - can read and write, but not administer this project.
    * \* `admin` - can read, write and administer this project.
    */
  var permission: js.UndefOr[read | write | admin] = js.undefined
  
  var project_id: Double
  
  var username: String
}
object ProjectsAddCollaboratorEndpoint {
  
  inline def apply(mediaType: `0`[inertia], project_id: Double, username: String): ProjectsAddCollaboratorEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], project_id = project_id.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsAddCollaboratorEndpoint]
  }
  
  extension [Self <: ProjectsAddCollaboratorEndpoint](x: Self) {
    
    inline def setPermission(value: read | write | admin): Self = StObject.set(x, "permission", value.asInstanceOf[js.Any])
    
    inline def setPermissionUndefined: Self = StObject.set(x, "permission", js.undefined)
    
    inline def setProject_id(value: Double): Self = StObject.set(x, "project_id", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
