package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirebaseProject extends js.Object {
  
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
  implicit class FirebaseProjectOps[Self <: FirebaseProject] (val x: Self) extends AnyVal {
    
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
    def setDisplayName(value: String): Self = this.set("displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("displayName", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setProjectId(value: String): Self = this.set("projectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    
    @scala.inline
    def setProjectNumber(value: String): Self = this.set("projectNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProjectNumber: Self = this.set("projectNumber", js.undefined)
    
    @scala.inline
    def setResources(value: DefaultResources): Self = this.set("resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResources: Self = this.set("resources", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
}
