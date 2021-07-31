package typings.maximMazurokGapiClientRun.gapi.client.run

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRun.anon.Alt
import typings.maximMazurokGapiClientRun.anon.ApiVersion
import typings.maximMazurokGapiClientRun.anon.Callback
import typings.maximMazurokGapiClientRun.anon.Key
import typings.maximMazurokGapiClientRun.anon.Name
import typings.maximMazurokGapiClientRun.anon.Oauthtoken
import typings.maximMazurokGapiClientRun.anon.OptionsrequestedPolicyVersion
import typings.maximMazurokGapiClientRun.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  def create(request: Key, body: Service): Request[Service] = js.native
  /** Create a service. */
  def create(request: Oauthtoken): Request[Service] = js.native
  
  /** Delete a service. This will cause the Service to stop serving traffic and will delete the child entities like Routes, Configurations and Revisions. */
  def delete(): Request[Status] = js.native
  def delete(request: ApiVersion): Request[Status] = js.native
  
  /** Get information about a service. */
  def get(): Request[Service] = js.native
  def get(request: Alt): Request[Service] = js.native
  
  /** Get the IAM Access Control policy currently in effect for the given Cloud Run service. This result does not include any inherited policies. */
  def getIamPolicy(): Request[Policy] = js.native
  def getIamPolicy(request: OptionsrequestedPolicyVersion): Request[Policy] = js.native
  
  /** List services. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: Callback): Request[ListServicesResponse] = js.native
  
  def replaceService(request: Alt, body: Service): Request[Service] = js.native
  /**
    * Replace a service. Only the spec and metadata labels and annotations are modifiable. After the Update request, Cloud Run will work to make the 'status' match the requested 'spec'.
    * May provide metadata.resourceVersion to enforce update from last read for optimistic concurrency control.
    */
  def replaceService(request: Name): Request[Service] = js.native
  
  /** Sets the IAM Access control policy for the specified Service. Overwrites any existing policy. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Returns permissions that a caller has on the specified Project. There are no permissions required for making this API call. */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
