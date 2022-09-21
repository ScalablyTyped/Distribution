package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Accesstoken
import typings.maximMazurokGapiClientRun.anon.AllowMissing
import typings.maximMazurokGapiClientRun.anon.Alt
import typings.maximMazurokGapiClientRun.anon.Etag
import typings.maximMazurokGapiClientRun.anon.Fields
import typings.maximMazurokGapiClientRun.anon.JobId
import typings.maximMazurokGapiClientRun.anon.Key
import typings.maximMazurokGapiClientRun.anon.Name
import typings.maximMazurokGapiClientRun.anon.Oauthtoken
import typings.maximMazurokGapiClientRun.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JobsResource extends StObject {
  
  /** Create a Job. */
  def create(request: Fields): Request[GoogleLongrunningOperation] = js.native
  def create(request: JobId, body: GoogleCloudRunV2Job): Request[GoogleLongrunningOperation] = js.native
  
  /** Deletes a Job. */
  def delete(): Request[GoogleLongrunningOperation] = js.native
  def delete(request: Etag): Request[GoogleLongrunningOperation] = js.native
  
  var executions: ExecutionsResource = js.native
  
  /** Gets information about a Job. */
  def get(): Request[GoogleCloudRunV2Job] = js.native
  def get(request: Accesstoken): Request[GoogleCloudRunV2Job] = js.native
  
  /** Get the IAM Access Control policy currently in effect for the given Job. This result does not include any inherited policies. */
  def getIamPolicy(): Request[GoogleIamV1Policy] = js.native
  def getIamPolicy(request: Key): Request[GoogleIamV1Policy] = js.native
  
  /** List Jobs. */
  def list(): Request[GoogleCloudRunV2ListJobsResponse] = js.native
  def list(request: Alt): Request[GoogleCloudRunV2ListJobsResponse] = js.native
  
  /** Updates a Job. */
  def patch(request: AllowMissing): Request[GoogleLongrunningOperation] = js.native
  def patch(request: Name, body: GoogleCloudRunV2Job): Request[GoogleLongrunningOperation] = js.native
  
  def run(request: Accesstoken, body: GoogleCloudRunV2RunJobRequest): Request[GoogleLongrunningOperation] = js.native
  /** Triggers creation of a new Execution of this Job. */
  def run(request: Oauthtoken): Request[GoogleLongrunningOperation] = js.native
  
  /** Sets the IAM Access control policy for the specified Job. Overwrites any existing policy. */
  def setIamPolicy(request: PrettyPrint, body: GoogleIamV1SetIamPolicyRequest): Request[GoogleIamV1Policy] = js.native
  
  /** Returns permissions that a caller has on the specified Project. There are no permissions required for making this API call. */
  def testIamPermissions(request: PrettyPrint, body: GoogleIamV1TestIamPermissionsRequest): Request[GoogleIamV1TestIamPermissionsResponse] = js.native
}
