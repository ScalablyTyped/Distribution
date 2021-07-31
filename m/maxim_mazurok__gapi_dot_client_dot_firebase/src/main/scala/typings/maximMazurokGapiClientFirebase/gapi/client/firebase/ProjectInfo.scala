package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectInfo extends StObject {
  
  /** The user-assigned display name of the GCP `Project`, for example: `My App` */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Project's default GCP resource location. The location is one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations). Not all
    * Projects will have this field populated. If it is not populated, it means that the Project does not yet have a default GCP resource location. To set a Project's default GCP resource
    * location, call [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase resources to the Project.
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the GCP `Project` to which Firebase resources can be added, in the format: projects/PROJECT_IDENTIFIER Refer to the `FirebaseProject`
    * [`name`](../projects#FirebaseProject.FIELDS.name) field for details about PROJECT_IDENTIFIER values.
    */
  var project: js.UndefOr[String] = js.undefined
}
object ProjectInfo {
  
  @scala.inline
  def apply(): ProjectInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectInfo]
  }
  
  @scala.inline
  implicit class ProjectInfoMutableBuilder[Self <: ProjectInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    @scala.inline
    def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    @scala.inline
    def setProject(value: String): Self = StObject.set(x, "project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectUndefined: Self = StObject.set(x, "project", js.undefined)
  }
}
