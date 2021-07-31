package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSqladmin.anon.Callback
import typings.maximMazurokGapiClientSqladmin.anon.Instance
import typings.maximMazurokGapiClientSqladmin.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabasesResource extends StObject {
  
  /** Deletes a database from a Cloud SQL instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: typings.maximMazurokGapiClientSqladmin.anon.Database): Request[Operation] = js.native
  
  /** Retrieves a resource containing information about a database inside a Cloud SQL instance. */
  def get(): Request[Database] = js.native
  def get(request: typings.maximMazurokGapiClientSqladmin.anon.Database): Request[Database] = js.native
  
  def insert(request: Callback, body: Database): Request[Operation] = js.native
  /** Inserts a resource containing information about a database inside a Cloud SQL instance. */
  def insert(request: Instance): Request[Operation] = js.native
  
  /** Lists databases in the specified Cloud SQL instance. */
  def list(): Request[DatabasesListResponse] = js.native
  def list(request: Callback): Request[DatabasesListResponse] = js.native
  
  def patch(request: typings.maximMazurokGapiClientSqladmin.anon.Database, body: Database): Request[Operation] = js.native
  /** Partially updates a resource containing information about a database inside a Cloud SQL instance. This method supports patch semantics. */
  def patch(request: Key): Request[Operation] = js.native
  
  def update(request: typings.maximMazurokGapiClientSqladmin.anon.Database, body: Database): Request[Operation] = js.native
  /** Updates a resource containing information about a database inside a Cloud SQL instance. */
  def update(request: Key): Request[Operation] = js.native
}
