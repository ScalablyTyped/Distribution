package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.Fields
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientTagmanager.anon.Resource
import typings.maximMazurokGapiClientTagmanager.anon.UploadType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientsResource extends StObject {
  
  def create(request: Alt, body: Client): Request[Client] = js.native
  /** Creates a GTM Client. */
  def create(request: Resource): Request[Client] = js.native
  
  /** Deletes a GTM Client. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Client. */
  def get(): Request[Client] = js.native
  def get(request: Callback): Request[Client] = js.native
  
  /** Lists all GTM Clients of a GTM container workspace. */
  def list(): Request[ListClientsResponse] = js.native
  def list(request: Fields): Request[ListClientsResponse] = js.native
  
  /** Reverts changes to a GTM Client in a GTM Workspace. */
  def revert(): Request[RevertClientResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertClientResponse] = js.native
  
  def update(request: Oauthtoken, body: Client): Request[Client] = js.native
  /** Updates a GTM Client. */
  def update(request: UploadType): Request[Client] = js.native
}
