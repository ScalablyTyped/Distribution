package typings.maximMazurokGapiClientSqladmin.gapi.client.sqladmin

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSqladmin.anon.Callback
import typings.maximMazurokGapiClientSqladmin.anon.Host
import typings.maximMazurokGapiClientSqladmin.anon.Name
import typings.maximMazurokGapiClientSqladmin.anon.OauthtokenPrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsersResource extends StObject {
  
  /** Deletes a user from a Cloud SQL instance. */
  def delete(): Request[Operation] = js.native
  def delete(request: Host): Request[Operation] = js.native
  
  def insert(request: Callback, body: User): Request[Operation] = js.native
  /** Creates a new user in a Cloud SQL instance. */
  def insert(request: OauthtokenPrettyPrint): Request[Operation] = js.native
  
  /** Lists users in the specified Cloud SQL instance. */
  def list(): Request[UsersListResponse] = js.native
  def list(request: Callback): Request[UsersListResponse] = js.native
  
  def update(request: Host, body: User): Request[Operation] = js.native
  /** Updates an existing user in a Cloud SQL instance. */
  def update(request: Name): Request[Operation] = js.native
}
