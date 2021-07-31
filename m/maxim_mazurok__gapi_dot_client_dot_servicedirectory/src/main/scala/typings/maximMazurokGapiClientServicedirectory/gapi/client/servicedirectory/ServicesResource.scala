package typings.maximMazurokGapiClientServicedirectory.gapi.client.servicedirectory

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicedirectory.anon.Callback
import typings.maximMazurokGapiClientServicedirectory.anon.Fields
import typings.maximMazurokGapiClientServicedirectory.anon.Name
import typings.maximMazurokGapiClientServicedirectory.anon.Oauthtoken
import typings.maximMazurokGapiClientServicedirectory.anon.Parent
import typings.maximMazurokGapiClientServicedirectory.anon.PrettyPrint
import typings.maximMazurokGapiClientServicedirectory.anon.QuotaUser
import typings.maximMazurokGapiClientServicedirectory.anon.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  /** Creates a service, and returns the new Service. */
  def create(request: Oauthtoken): Request[Service] = js.native
  def create(request: Parent, body: Service): Request[Service] = js.native
  
  /** Deletes a service. This also deletes all endpoints associated with the service. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Callback): Request[js.Object] = js.native
  
  var endpoints: EndpointsResource = js.native
  
  /** Gets a service. */
  def get(): Request[Service] = js.native
  def get(request: Callback): Request[Service] = js.native
  
  /** Gets the IAM Policy for a resource (namespace or service only). */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /** Lists all services belonging to a namespace. */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: Fields): Request[ListServicesResponse] = js.native
  
  def patch(request: Name, body: Service): Request[Service] = js.native
  /** Updates a service. */
  def patch(request: QuotaUser): Request[Service] = js.native
  
  def resolve(request: Callback, body: ResolveServiceRequest): Request[ResolveServiceResponse] = js.native
  /** Returns a service and its associated endpoints. Resolving a service is not considered an active developer method. */
  def resolve(request: Resource): Request[ResolveServiceResponse] = js.native
  
  /** Sets the IAM Policy for a resource (namespace or service only). */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /** Tests IAM permissions for a resource (namespace or service only). */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
