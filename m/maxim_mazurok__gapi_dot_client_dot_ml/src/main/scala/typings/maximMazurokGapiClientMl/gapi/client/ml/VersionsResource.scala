package typings.maximMazurokGapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMl.anon.Alt
import typings.maximMazurokGapiClientMl.anon.CallbackFields
import typings.maximMazurokGapiClientMl.anon.Fields
import typings.maximMazurokGapiClientMl.anon.FieldsKey
import typings.maximMazurokGapiClientMl.anon.Filter
import typings.maximMazurokGapiClientMl.anon.Oauthtoken
import typings.maximMazurokGapiClientMl.anon.UpdateMask
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VersionsResource extends js.Object {
  
  /**
    * Creates a new version of a model from a trained TensorFlow model. If the version created in the cloud by this call is the first deployed version of the specified model, it will be
    * made the default version of the model. When you add a version to a model that already has one or more versions, the default version does not automatically change. If you want a new
    * version to be the default, you must call projects.models.versions.setDefault.
    */
  def create(request: CallbackFields): Request[GoogleLongrunningOperation] = js.native
  def create(request: Fields, body: GoogleCloudMlV1Version): Request[GoogleLongrunningOperation] = js.native
  
  /**
    * Deletes a model version. Each model can have multiple versions deployed and in use at any given time. Use this method to remove a single version. Note: You cannot delete the version
    * that is set as the default version of the model unless it is the only remaining version.
    */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Alt): Request[GoogleLongrunningOperation] = js.native
  
  /**
    * Gets information about a model version. Models can have multiple versions. You can call projects.models.versions.list to get the same information that this method returns for all of
    * the versions of a model.
    */
  def get(): Request[GoogleCloudMlV1Version] = js.native
  def get(request: Alt): Request[GoogleCloudMlV1Version] = js.native
  
  /**
    * Gets basic information about all the versions of a model. If you expect that a model has many versions, or if you need to handle only a limited number of results at a time, you can
    * request that the list be retrieved in batches (called pages). If there are no versions that match the request parameters, the list request returns an empty response body: {}.
    */
  def list(): Request[GoogleCloudMlV1ListVersionsResponse] = js.native
  def list(request: Filter): Request[GoogleCloudMlV1ListVersionsResponse] = js.native
  
  def patch(request: Oauthtoken, body: GoogleCloudMlV1Version): Request[GoogleLongrunningOperation] = js.native
  /** Updates the specified Version resource. Currently the only update-able fields are `description`, `requestLoggingConfig`, `autoScaling.minNodes`, and `manualScaling.nodes`. */
  def patch(request: UpdateMask): Request[GoogleLongrunningOperation] = js.native
  
  def setDefault(request: Alt, body: GoogleCloudMlV1SetDefaultVersionRequest): Request[GoogleCloudMlV1Version] = js.native
  /**
    * Designates a version to be the default for the model. The default version is used for prediction requests made against the model that don't specify a version. The first version to
    * be created for a model is automatically set as the default. You must make any subsequent changes to the default version setting manually using this method.
    */
  def setDefault(request: FieldsKey): Request[GoogleCloudMlV1Version] = js.native
}
