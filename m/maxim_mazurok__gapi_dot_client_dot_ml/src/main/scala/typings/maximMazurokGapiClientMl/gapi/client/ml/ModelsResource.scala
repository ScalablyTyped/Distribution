package typings.maximMazurokGapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMl.anon.Alt
import typings.maximMazurokGapiClientMl.anon.Fields
import typings.maximMazurokGapiClientMl.anon.Filter
import typings.maximMazurokGapiClientMl.anon.Key
import typings.maximMazurokGapiClientMl.anon.KeyName
import typings.maximMazurokGapiClientMl.anon.KeyOauthtoken
import typings.maximMazurokGapiClientMl.anon.Oauthtoken
import typings.maximMazurokGapiClientMl.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ModelsResource extends js.Object {
  
  def create(request: Fields, body: GoogleCloudMlV1Model): Request[GoogleCloudMlV1Model] = js.native
  /**
    * Creates a model which will later contain one or more versions. You must add at least one version before you can request predictions from the model. Add versions by calling
    * projects.models.versions.create.
    */
  def create(request: KeyOauthtoken): Request[GoogleCloudMlV1Model] = js.native
  
  /** Deletes a model. You can only delete a model if there are no versions in it. You can delete versions by calling projects.models.versions.delete. */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Alt): Request[GoogleLongrunningOperation] = js.native
  
  /** Gets information about a model, including its name, the description (if set), and the default version (if at least one version of the model has been deployed). */
  def get(): Request[GoogleCloudMlV1Model] = js.native
  def get(request: Alt): Request[GoogleCloudMlV1Model] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[GoogleIamV1Policy] = js.native
  def getIamPolicy(request: Key): Request[GoogleIamV1Policy] = js.native
  
  /**
    * Lists the models in a project. Each project can contain multiple models, and each model can have multiple versions. If there are no models that match the request parameters, the
    * list request returns an empty response body: {}.
    */
  def list(): Request[GoogleCloudMlV1ListModelsResponse] = js.native
  def list(request: Filter): Request[GoogleCloudMlV1ListModelsResponse] = js.native
  
  /** Updates a specific model resource. Currently the only supported fields to update are `description` and `default_version.name`. */
  def patch(request: KeyName): Request[GoogleLongrunningOperation] = js.native
  def patch(request: Oauthtoken, body: GoogleCloudMlV1Model): Request[GoogleLongrunningOperation] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: GoogleIamV1SetIamPolicyRequest): Request[GoogleIamV1Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: GoogleIamV1TestIamPermissionsRequest): Request[GoogleIamV1TestIamPermissionsResponse] = js.native
  
  var versions: VersionsResource = js.native
}
