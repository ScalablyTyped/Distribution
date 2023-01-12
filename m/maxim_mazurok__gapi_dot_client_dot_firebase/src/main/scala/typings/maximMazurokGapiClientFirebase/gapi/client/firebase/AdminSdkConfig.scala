package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminSdkConfig extends StObject {
  
  /** The default Firebase Realtime Database URL. */
  var databaseURL: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the Project's default GCP resource location. The location is one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations). This field
    * is omitted if the default GCP resource location has not been finalized yet. To set a Project's default GCP resource location, call
    * [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase resources to the Project.
    */
  var locationId: js.UndefOr[String] = js.undefined
  
  /**
    * Immutable. A user-assigned unique identifier for the `FirebaseProject`. This identifier may appear in URLs or names for some Firebase resources associated with the Project, but it
    * should generally be treated as a convenience alias to reference the Project.
    */
  var projectId: js.UndefOr[String] = js.undefined
  
  /** The default Cloud Storage for Firebase storage bucket name. */
  var storageBucket: js.UndefOr[String] = js.undefined
}
object AdminSdkConfig {
  
  inline def apply(): AdminSdkConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminSdkConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AdminSdkConfig] (val x: Self) extends AnyVal {
    
    inline def setDatabaseURL(value: String): Self = StObject.set(x, "databaseURL", value.asInstanceOf[js.Any])
    
    inline def setDatabaseURLUndefined: Self = StObject.set(x, "databaseURL", js.undefined)
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectIdUndefined: Self = StObject.set(x, "projectId", js.undefined)
    
    inline def setStorageBucket(value: String): Self = StObject.set(x, "storageBucket", value.asInstanceOf[js.Any])
    
    inline def setStorageBucketUndefined: Self = StObject.set(x, "storageBucket", js.undefined)
  }
}
