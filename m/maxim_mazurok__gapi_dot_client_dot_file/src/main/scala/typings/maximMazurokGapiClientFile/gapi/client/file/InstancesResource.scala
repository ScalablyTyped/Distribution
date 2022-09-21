package typings.maximMazurokGapiClientFile.gapi.client.file

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFile.anon.Callback
import typings.maximMazurokGapiClientFile.anon.Fields
import typings.maximMazurokGapiClientFile.anon.Force
import typings.maximMazurokGapiClientFile.anon.InstanceId
import typings.maximMazurokGapiClientFile.anon.Name
import typings.maximMazurokGapiClientFile.anon.QuotaUser
import typings.maximMazurokGapiClientFile.anon.Resource
import typings.maximMazurokGapiClientFile.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends StObject {
  
  /**
    * Creates an instance. When creating from a backup, the capacity of the new instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger than
    * the minimum capacity of the tier).
    */
  def create(request: InstanceId): Request[Operation] = js.native
  def create(request: QuotaUser, body: Instance): Request[Operation] = js.native
  
  /** Deletes an instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Force): Request[Operation] = js.native
  
  /** Gets the details of a specific instance. */
  def get(): Request[Instance] = js.native
  def get(request: Callback): Request[Instance] = js.native
  
  /** Lists all instances in a project for either a specified location or for all locations. */
  def list(): Request[ListInstancesResponse] = js.native
  def list(request: Fields): Request[ListInstancesResponse] = js.native
  
  def patch(request: Name, body: Instance): Request[Operation] = js.native
  /** Updates the settings of a specific instance. */
  def patch(request: Resource): Request[Operation] = js.native
  
  def restore(request: Callback, body: RestoreInstanceRequest): Request[Operation] = js.native
  /**
    * Restores an existing instance's file share from a backup. The capacity of the instance needs to be equal to or larger than the capacity of the backup (and also equal to or larger
    * than the minimum capacity of the tier).
    */
  def restore(request: UploadType): Request[Operation] = js.native
  
  var snapshots: SnapshotsResource = js.native
}
