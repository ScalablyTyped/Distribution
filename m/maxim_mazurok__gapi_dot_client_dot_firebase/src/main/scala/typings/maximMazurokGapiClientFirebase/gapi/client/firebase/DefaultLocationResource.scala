package typings.maximMazurokGapiClientFirebase.gapi.client.firebase

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebase.anon.Fields
import typings.maximMazurokGapiClientFirebase.anon.Parent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultLocationResource extends StObject {
  
  def finalize(request: Fields, body: FinalizeDefaultLocationRequest): Request[Operation] = js.native
  /**
    * Sets the default Google Cloud Platform (GCP) resource location for the specified FirebaseProject. This method creates an App Engine application with a [default Cloud Storage
    * bucket](https://cloud.google.com/appengine/docs/standard/python/googlecloudstorageclient/setting-up-cloud-storage#activating_a_cloud_storage_bucket), located in the specified
    * [`locationId`](#body.request_body.FIELDS.location_id). This location must be one of the available [GCP resource locations](https://firebase.google.com/docs/projects/locations).
    * After the default GCP resource location is finalized, or if it was already set, it cannot be changed. The default GCP resource location for the specified `FirebaseProject` might
    * already be set because either the underlying GCP `Project` already has an App Engine application or `FinalizeDefaultLocation` was previously called with a specified `locationId`.
    * Any new calls to `FinalizeDefaultLocation` with a *different* specified `locationId` will return a 409 error. The result of this call is an [`Operation`](../../v1beta1/operations),
    * which can be used to track the provisioning process. The [`response`](../../v1beta1/operations#Operation.FIELDS.response) type of the `Operation` is google.protobuf.Empty. The
    * `Operation` can be polled by its `name` using GetOperation until `done` is true. When `done` is true, the `Operation` has either succeeded or failed. If the `Operation` has
    * succeeded, its [`response`](../../v1beta1/operations#Operation.FIELDS.response) will be set to a google.protobuf.Empty; if the `Operation` has failed, its `error` will be set to a
    * google.rpc.Status. The `Operation` is automatically deleted after completion, so there is no need to call DeleteOperation. All fields listed in the [request body](#request-body) are
    * required. To call `FinalizeDefaultLocation`, a member must be an Owner of the Project.
    */
  def finalize(request: Parent): Request[Operation] = js.native
}
