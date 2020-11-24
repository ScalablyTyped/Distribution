package typings.maximMazurokGapiClientFirebasedatabase.gapi.client.firebasedatabase

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientFirebasedatabase.anon.Accesstoken
import typings.maximMazurokGapiClientFirebasedatabase.anon.Alt
import typings.maximMazurokGapiClientFirebasedatabase.anon.Callback
import typings.maximMazurokGapiClientFirebasedatabase.anon.Fields
import typings.maximMazurokGapiClientFirebasedatabase.anon.Key
import typings.maximMazurokGapiClientFirebasedatabase.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstancesResource extends js.Object {
  
  /**
    * Requests that a new DatabaseInstance be created. The state of a successfully created DatabaseInstance is ACTIVE. Only available for projects on the Blaze plan. Projects can be
    * upgraded using the Cloud Billing API https://cloud.google.com/billing/reference/rest/v1/projects/updateBillingInfo. Note that it might take a few minutes for billing enablement
    * state to propagate to Firebase systems.
    */
  def create(request: Accesstoken): Request[DatabaseInstance] = js.native
  def create(request: Alt, body: DatabaseInstance): Request[DatabaseInstance] = js.native
  
  /**
    * Marks a DatabaseInstance to be deleted. The DatabaseInstance will be purged within 30 days. The default database cannot be deleted. IDs for deleted database instances may never be
    * recovered or re-used. The Database may only be deleted if it is already in a DISABLED state.
    */
  def delete(): Request[DatabaseInstance] = js.native
  def delete(request: Callback): Request[DatabaseInstance] = js.native
  
  def disable(request: Callback, body: DisableDatabaseInstanceRequest): Request[DatabaseInstance] = js.native
  /**
    * Disables a DatabaseInstance. The database can be re-enabled later using ReenableDatabaseInstance. When a database is disabled, all reads and writes are denied, including view access
    * in the Firebase console.
    */
  def disable(request: Fields): Request[DatabaseInstance] = js.native
  
  /** Gets the DatabaseInstance identified by the specified resource name. */
  def get(): Request[DatabaseInstance] = js.native
  def get(request: Callback): Request[DatabaseInstance] = js.native
  
  /**
    * Lists each DatabaseInstance associated with the specified parent project. The list items are returned in no particular order, but will be a consistent view of the database instances
    * when additional requests are made with a `pageToken`. The resulting list contains instances in any STATE. The list results may be stale by a few seconds. Use GetDatabaseInstance for
    * consistent reads.
    */
  def list(): Request[ListDatabaseInstancesResponse] = js.native
  def list(request: Key): Request[ListDatabaseInstancesResponse] = js.native
  
  def reenable(request: Callback, body: ReenableDatabaseInstanceRequest): Request[DatabaseInstance] = js.native
  /** Enables a DatabaseInstance. The database must have been disabled previously using DisableDatabaseInstance. The state of a successfully reenabled DatabaseInstance is ACTIVE. */
  def reenable(request: Name): Request[DatabaseInstance] = js.native
}
