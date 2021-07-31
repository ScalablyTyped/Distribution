package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.`0`
import typings.octokitTypes.octokitTypesStrings.inertia
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectsCreateForRepoEndpoint
  extends StObject
     with RequiredPreview[inertia] {
  
  /**
    * The description of the project.
    */
  var body: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the project.
    */
  var name: String
  
  var owner: String
  
  var repo: String
}
object ProjectsCreateForRepoEndpoint {
  
  @scala.inline
  def apply(mediaType: `0`[inertia], name: String, owner: String, repo: String): ProjectsCreateForRepoEndpoint = {
    val __obj = js.Dynamic.literal(mediaType = mediaType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectsCreateForRepoEndpoint]
  }
  
  @scala.inline
  implicit class ProjectsCreateForRepoEndpointMutableBuilder[Self <: ProjectsCreateForRepoEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepo(value: String): Self = StObject.set(x, "repo", value.asInstanceOf[js.Any])
  }
}
