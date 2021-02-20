package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  name :string,   body :string | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsCreateForAuthenticatedUserEndpoint extends StObject {
  
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.native
  
  var mediaType: `7` = js.native
  
  /**
    * The name of the project.
    */
  var name: String = js.native
}
object ProjectsCreateForAuthenticatedUserEndpoint {
  
  @scala.inline
  def apply(mediaType: `7`, name: String): ProjectsCreateForAuthenticatedUserEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForAuthenticatedUserEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsCreateForAuthenticatedUserEndpointMutableBuilder[Self <: ProjectsCreateForAuthenticatedUserEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
