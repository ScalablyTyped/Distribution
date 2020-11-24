package typings.maximMazurokGapiClientRedis.gapi.client.redis

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientRedis.anon.Accesstoken
import typings.maximMazurokGapiClientRedis.anon.Alt
import typings.maximMazurokGapiClientRedis.anon.Callback
import typings.maximMazurokGapiClientRedis.anon.Fields
import typings.maximMazurokGapiClientRedis.anon.Key
import typings.maximMazurokGapiClientRedis.anon.Name
import typings.maximMazurokGapiClientRedis.anon.Oauthtoken
import typings.maximMazurokGapiClientRedis.anon.PrettyPrint
import typings.maximMazurokGapiClientRedis.anon.QuotaUser
import typings.maximMazurokGapiClientRedis.anon.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends js.Object {
  
  /**
    * Creates a Redis instance based on the specified tier and memory size. By default, the instance is accessible from the project's [default
    * network](https://cloud.google.com/vpc/docs/vpc). The creation is executed asynchronously and callers may check the returned operation to track its progress. Once the operation is
    * completed the Redis instance will be fully functional. Completed longrunning.Operation will contain the new instance object in the response field. The returned operation is
    * automatically deleted after a few hours, so there is no need to call DeleteOperation.
    */
  def create(request: Accesstoken): Request[Operation] = js.native
  def create(request: Alt, body: Instance): Request[Operation] = js.native
  
  /** Deletes a specific Redis instance. Instance stops serving and data is deleted. */
  def delete(): Request[Operation] = js.native
  def delete(request: Callback): Request[Operation] = js.native
  
  def export(request: Callback, body: ExportInstanceRequest): Request[Operation] = js.native
  /**
    * Export Redis instance data into a Redis RDB format file in Cloud Storage. Redis will continue serving during this operation. The returned operation is automatically deleted after a
    * few hours, so there is no need to call DeleteOperation.
    */
  def export(request: Fields): Request[Operation] = js.native
  
  def failover(request: Callback, body: FailoverInstanceRequest): Request[Operation] = js.native
  /** Initiates a failover of the primary node to current replica node for a specific STANDARD tier Cloud Memorystore for Redis instance. */
  def failover(request: Key): Request[Operation] = js.native
  
  /** Gets the details of a specific Redis instance. */
  def get(): Request[Instance] = js.native
  def get(request: Callback): Request[Instance] = js.native
  
  /**
    * Gets the AUTH string for a Redis instance. If AUTH is not enabled for the instance the response will be empty. This information is not included in the details returned to
    * GetInstance.
    */
  def getAuthString(): Request[InstanceAuthString] = js.native
  def getAuthString(request: Callback): Request[InstanceAuthString] = js.native
  
  def `import`(request: Callback, body: ImportInstanceRequest): Request[Operation] = js.native
  /**
    * Import a Redis RDB snapshot file from Cloud Storage into a Redis instance. Redis may stop serving during this operation. Instance state will be IMPORTING for entire operation. When
    * complete, the instance will contain only data from the imported file. The returned operation is automatically deleted after a few hours, so there is no need to call DeleteOperation.
    */
  def `import`(request: Name): Request[Operation] = js.native
  
  /**
    * Lists all Redis instances owned by a project in either the specified location (region) or all locations. The location should have the following format: *
    * `projects/{project_id}/locations/{location_id}` If `location_id` is specified as `-` (wildcard), then all regions available to the project are queried, and the results are
    * aggregated.
    */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: Oauthtoken): Request[ListInstancesResponse] = js.native
  
  /**
    * Updates the metadata and configuration of a specific Redis instance. Completed longrunning.Operation will contain the new instance object in the response field. The returned
    * operation is automatically deleted after a few hours, so there is no need to call DeleteOperation.
    */
  def patch(request: PrettyPrint): Request[Operation] = js.native
  def patch(request: QuotaUser, body: Instance): Request[Operation] = js.native
  
  def upgrade(request: Callback, body: UpgradeInstanceRequest): Request[Operation] = js.native
  /** Upgrades Redis instance to the newer Redis version specified in the request. */
  def upgrade(request: Resource): Request[Operation] = js.native
}
