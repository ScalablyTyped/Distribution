package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseProject extends StObject {
  
  /** The user-assigned display name of the Project. */
  var displayName: js.UndefOr[String] = js.native
  
  /**
    * The resource name of the Project, in the format: projects/PROJECT_IDENTIFIER PROJECT_IDENTIFIER: the Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number)
    * ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510
    * standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Immutable. A user-assigned unique identifier for the Project. This identifier may appear in URLs or names for some Firebase resources associated with the Project, but it should
    * generally be treated as a convenience alias to reference the Project.
    */
  var projectId: js.UndefOr[String] = js.native
  
  /**
    * Immutable. The globally unique, Google-assigned canonical identifier for the Project. Use this identifier when configuring integrations and/or making API calls to Firebase or
    * third-party services.
    */
  var projectNumber: js.UndefOr[String] = js.native
  
  /** The default Firebase resources associated with the Project. */
  var resources: js.UndefOr[DefaultResources] = js.native
  
  /**
    * Output only. The lifecycle state of the Project. Updates to the state must be performed via com.google.cloudresourcemanager.v1.Projects.DeleteProject and
    * com.google.cloudresourcemanager.v1.Projects.UndeleteProject
    */
  var state: js.UndefOr[String] = js.native
}
object FirebaseProject {
  
  @scala.inline
  def apply(): FirebaseProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseProject]
  }
  
  @scala.inline
  implicit class FirebaseProjectMutableBuilder[Self <: FirebaseProject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    @scala.inline
    def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    @scala.inline
    def setResources(value: DefaultResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
