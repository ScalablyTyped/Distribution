package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirebaseProject extends StObject {
  
  /**
    * Set of user-defined annotations for the FirebaseProject as per [AIP-128](https://google.aip.dev/128#annotations). These annotations are intended solely for developers and
    * client-side tools Firebase services will not mutate this annotation set.
    */
  var annotations: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The user-assigned display name of the Project. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * This checksum is computed by the server based on the value of other fields, and may be sent on update requests to ensure the client has an up-to-date value before proceeding.
    * [AIP-154](https://google.aip.dev/154#declarative-friendly-resources). This etag is strongly validated.
    */
  var etag: js.UndefOr[String] = js.undefined
  
  /**
    * The resource name of the Project, in the format: projects/PROJECT_IDENTIFIER PROJECT_IDENTIFIER: the Project's [`ProjectNumber`](../projects#FirebaseProject.FIELDS.project_number)
    * ***(recommended)*** or its [`ProjectId`](../projects#FirebaseProject.FIELDS.project_id). Learn more about using project identifiers in Google's [AIP 2510
    * standard](https://google.aip.dev/cloud/2510). Note that the value for PROJECT_IDENTIFIER in any response body will be the `ProjectId`.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. A user-assigned unique identifier for the Project. This identifier may appear in URLs or names for some Firebase resources associated with the Project, but it should
    * generally be treated as a convenience alias to reference the Project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /**
    * Output only. The globally unique, Google-assigned canonical identifier for the Project. Use this identifier when configuring integrations and/or making API calls to Firebase or
    * third-party services.
    */
  var projectNumber: js.UndefOr[String] = js.undefined
  
  /** Output only. The default Firebase resources associated with the Project. */
  var resources: js.UndefOr[DefaultResources] = js.undefined
  
  /**
    * Output only. The lifecycle state of the Project. Updates to the state must be performed via com.google.cloudresourcemanager.v1.Projects.DeleteProject and
    * com.google.cloudresourcemanager.v1.Projects.UndeleteProject
    */
  var state: js.UndefOr[String] = js.undefined
}
object FirebaseProject {
  
  inline def apply(): FirebaseProject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirebaseProject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirebaseProject] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    inline def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    inline def setResources(value: DefaultResources): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
