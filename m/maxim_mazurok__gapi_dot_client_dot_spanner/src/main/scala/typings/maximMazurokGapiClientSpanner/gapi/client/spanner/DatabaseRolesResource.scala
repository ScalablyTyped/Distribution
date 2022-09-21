package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientSpanner.anon.Callback
import typings.maximMazurokGapiClientSpanner.anon.PrettyPrint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DatabaseRolesResource extends StObject {
  
  /** Lists Cloud Spanner database roles. */
  def list(): Request[ListDatabaseRolesResponse] = js.native
  def list(request: Callback): Request[ListDatabaseRolesResponse] = js.native
  
  /**
    * Returns permissions that the caller has on the specified database or backup resource. Attempting this RPC on a non-existent Cloud Spanner database will result in a NOT_FOUND error
    * if the user has `spanner.databases.list` permission on the containing Cloud Spanner instance. Otherwise returns an empty set of permissions. Calling this method on a backup that
    * does not exist will result in a NOT_FOUND error if the user has `spanner.backups.list` permission on the containing instance.
    */
  def testIamPermissions(request: PrettyPrint, body: TestIamPermissionsRequest): Request[TestIamPermissionsResponse] = js.native
}
