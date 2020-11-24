package typings.maximMazurokGapiClientPeople.gapi.client.people

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientPeople.anon.PageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionsResource extends js.Object {
  
  /**
    * Provides a list of the authenticated user's contacts. The request returns a 400 error if `personFields` is not specified. The request returns a 410 error if `sync_token` is
    * specified and is expired. Sync tokens expire after 7 days. A request without `sync_token` should be made and all contacts should be synced.
    */
  def list(): Request[ListConnectionsResponse] = js.native
  def list(request: PageToken): Request[ListConnectionsResponse] = js.native
}
