package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddFirebaseRequest extends StObject {
  
  /**
    * Deprecated. Instead, to set a Project's default GCP resource location, call [`FinalizeDefaultLocation`](../projects.defaultLocation/finalize) after you add Firebase resources to the
    * GCP `Project`. The ID of the Project's default GCP resource location. The location must be one of the available [GCP resource
    * locations](https://firebase.google.com/docs/projects/locations).
    */
  var locationId: js.UndefOr[String] = js.undefined
}
object AddFirebaseRequest {
  
  inline def apply(): AddFirebaseRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddFirebaseRequest]
  }
  
  extension [Self <: AddFirebaseRequest](x: Self) {
    
    inline def setLocationId(value: String): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
  }
}
