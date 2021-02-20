package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebase.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailableLocationsResource extends StObject {
  
  /**
    * Lists the valid Google Cloud Platform (GCP) resource locations for the specified Project (including a FirebaseProject). One of these locations can be selected as the Project's
    * [_default_ GCP resource location](https://firebase.google.com/docs/projects/locations), which is the geographical location where the Project's resources, such as Cloud Firestore,
    * will be provisioned by default. However, if the default GCP resource location has already been set for the Project, then this setting cannot be changed. This call checks for any
    * possible [location restrictions](https://cloud.google.com/resource-manager/docs/organization-policy/defining-locations) for the specified Project and, thus, might return a subset of
    * all possible GCP resource locations. To list all GCP resource locations (regardless of any restrictions), call the endpoint without specifying a unique project identifier (that is,
    * `/v1beta1/{parent=projects/-}/listAvailableLocations`). To call `ListAvailableLocations` with a specified project, a member must be at minimum a Viewer of the Project. Calls without
    * a specified project do not require any specific project permissions.
    */
  def list(): Request[ListAvailableLocationsResponse] = js.native
  def list(request: Oauthtoken): Request[ListAvailableLocationsResponse] = js.native
}
