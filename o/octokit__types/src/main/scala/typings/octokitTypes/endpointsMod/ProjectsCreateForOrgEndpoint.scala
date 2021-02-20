package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  org :string,   name :string,   body :string | undefined} & @octokit/types.@octokit/types/dist-types/generated/Endpoints.RequiredPreview<'inertia'> */
@js.native
trait ProjectsCreateForOrgEndpoint extends StObject {
  
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.native
  
  var mediaType: `7` = js.native
  
  /**
    * The name of the project.
    */
  var name: String = js.native
  
  @JSName("org")
  var org_ : String = js.native
}
object ProjectsCreateForOrgEndpoint {
  
  @scala.inline
  def apply(mediaType: `7`, name: String, org_ : String): ProjectsCreateForOrgEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("org")(org_.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForOrgEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsCreateForOrgEndpointMutableBuilder[Self <: ProjectsCreateForOrgEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setMediaType(value: `7`): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrg_(value: String): Self = StObject.set(x, "org", value.asInstanceOf[js.Any])
  }
}
