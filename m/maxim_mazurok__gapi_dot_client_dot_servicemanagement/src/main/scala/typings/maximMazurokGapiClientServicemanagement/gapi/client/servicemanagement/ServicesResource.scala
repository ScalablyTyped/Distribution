package typings.maximMazurokGapiClientServicemanagement.gapi.client.servicemanagement

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientServicemanagement.anon.ConsumerId
import typings.maximMazurokGapiClientServicemanagement.anon.Fields
import typings.maximMazurokGapiClientServicemanagement.anon.PrettyPrint
import typings.maximMazurokGapiClientServicemanagement.anon.Resource
import typings.maximMazurokGapiClientServicemanagement.anon.ServiceName
import typings.maximMazurokGapiClientServicemanagement.anon.UploadType
import typings.maximMazurokGapiClientServicemanagement.anon.Uploadprotocol
import typings.maximMazurokGapiClientServicemanagement.anon.View
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServicesResource extends StObject {
  
  var configs: ConfigsResource = js.native
  
  var consumers: ConsumersResource = js.native
  
  /**
    * Creates a new managed service. A managed service is immutable, and is subject to mandatory 30-day data retention. You cannot move a service or recreate it within 30 days after
    * deletion. One producer project can own no more than 500 services. For security and reliability purposes, a production service should be hosted in a dedicated producer project.
    * Operation
    */
  def create(request: Resource): Request[Operation] = js.native
  def create(request: UploadType, body: ManagedService): Request[Operation] = js.native
  
  /**
    * Deletes a managed service. This method will change the service to the `Soft-Delete` state for 30 days. Within this period, service producers may call UndeleteService to restore the
    * service. After 30 days, the service will be permanently deleted. Operation
    */
  def delete(): Request[Operation] = js.native
  def delete(request: Fields): Request[Operation] = js.native
  
  def enable(request: Fields, body: EnableServiceRequest): Request[Operation] = js.native
  /** Enables a service for a project, so it can be used for the project. See [Cloud Auth Guide](https://cloud.google.com/docs/authentication) for more information. Operation */
  def enable(request: ServiceName): Request[Operation] = js.native
  
  def generateConfigReport(request: UploadType, body: GenerateConfigReportRequest): Request[GenerateConfigReportResponse] = js.native
  /**
    * Generates and returns a report (errors, warnings and changes from existing configurations) associated with GenerateConfigReportRequest.new_value If
    * GenerateConfigReportRequest.old_value is specified, GenerateConfigReportRequest will contain a single ChangeReport based on the comparison between
    * GenerateConfigReportRequest.new_value and GenerateConfigReportRequest.old_value. If GenerateConfigReportRequest.old_value is not specified, this method will compare
    * GenerateConfigReportRequest.new_value with the last pushed service configuration.
    */
  def generateConfigReport(request: Uploadprotocol): Request[GenerateConfigReportResponse] = js.native
  
  /** Gets a managed service. Authentication is required unless the service is public. */
  def get(): Request[ManagedService] = js.native
  def get(request: Fields): Request[ManagedService] = js.native
  
  /** Gets a service configuration (version) for a managed service. */
  def getConfig(): Request[Service] = js.native
  def getConfig(request: View): Request[Service] = js.native
  
  /** Gets the access control policy for a resource. Returns an empty policy if the resource exists and does not have a policy set. */
  def getIamPolicy(request: PrettyPrint, body: GetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Lists managed services. Returns all public services. For authenticated users, also returns all services the calling user has "servicemanagement.services.get" permission for.
    * **BETA:** If the caller specifies the `consumer_id`, it returns only the services enabled on the consumer. The `consumer_id` must have the format of "project:{PROJECT-ID}".
    */
  def list(): Request[ListServicesResponse] = js.native
  def list(request: ConsumerId): Request[ListServicesResponse] = js.native
  
  var rollouts: RolloutsResource = js.native
  
  /** Sets the access control policy on the specified resource. Replaces any existing policy. Can return `NOT_FOUND`, `INVALID_ARGUMENT`, and `PERMISSION_DENIED` errors. */
  def setIamPolicy(request: PrettyPrint, body: SetIamPolicyRequest): Request[Policy] = js.native
  
  /**
    * Returns permissions that a caller has on the specified resource. If the resource does not exist, this will return an empty set of permissions, not a `NOT_FOUND` error. Note: This
    * operation is designed to be used for building permission-aware UIs and command-line tools, not for authorization checking. This operation may "fail open" without warning.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
  
  /**
    * Revives a previously deleted managed service. The method restores the service using the configuration at the time the service was deleted. The target service must exist and must
    * have been deleted within the last 30 days. Operation
    */
  def undelete(): Request[Operation] = js.native
  def undelete(request: Fields): Request[Operation] = js.native
}
