package typings.maximMazurokGapiClientMl.gapi.client.ml

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMl.anon.Accesstoken
import typings.maximMazurokGapiClientMl.anon.Alt
import typings.maximMazurokGapiClientMl.anon.Callback
import typings.maximMazurokGapiClientMl.anon.Fields
import typings.maximMazurokGapiClientMl.anon.Filter
import typings.maximMazurokGapiClientMl.anon.Key
import typings.maximMazurokGapiClientMl.anon.Name
import typings.maximMazurokGapiClientMl.anon.Oauthtoken
import typings.maximMazurokGapiClientMl.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends StObject {
  
  /** Cancels a running job. */
  def cancel(request: Accesstoken): Request[js.Object] = js.native
  def cancel(request: Alt, body: GoogleCloudMlV1CancelJobRequest): Request[js.Object] = js.native
  
  /** Creates a training or a batch prediction job. */
  def create(request: Callback): Request[GoogleCloudMlV1Job] = js.native
  def create(request: Fields, body: GoogleCloudMlV1Job): Request[GoogleCloudMlV1Job] = js.native
  
  /** Describes a job. */
  def get(): Request[GoogleCloudMlV1Job] = js.native
  def get(request: Alt): Request[GoogleCloudMlV1Job] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(): Request[GoogleIamV1Policy] = js.native
  def getIamPolicy(request: Key): Request[GoogleIamV1Policy] = js.native
  
  /** Lists the jobs in the project. If there are no jobs that match the request parameters, the list request returns an empty response body: {}. */
  def list(): Request[GoogleCloudMlV1ListJobsResponse] = js.native
  def list(request: Filter): Request[GoogleCloudMlV1ListJobsResponse] = js.native
  
  /** Updates a specific job resource. Currently the only supported fields to update are `labels`. */
  def patch(request: Name): Request[GoogleCloudMlV1Job] = js.native
  def patch(request: Oauthtoken, body: GoogleCloudMlV1Job): Request[GoogleCloudMlV1Job] = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: GoogleIamV1SetIamPolicyRequest): Request[GoogleIamV1Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: GoogleIamV1TestIamPermissionsRequest): Request[GoogleIamV1TestIamPermissionsResponse] = js.native
}
