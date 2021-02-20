package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Accesstoken
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.Fields
import typings.maximMazurokGapiClientTagmanager.anon.Fingerprint
import typings.maximMazurokGapiClientTagmanager.anon.Key
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnvironmentsResource extends StObject {
  
  /** Creates a GTM Environment. */
  def create(request: Accesstoken): Request[Environment] = js.native
  def create(request: Alt, body: Environment): Request[Environment] = js.native
  
  /** Deletes a GTM Environment. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Environment. */
  def get(): Request[Environment] = js.native
  def get(request: Callback): Request[Environment] = js.native
  
  /** Lists all GTM Environments of a GTM Container. */
  def list(): Request[ListEnvironmentsResponse] = js.native
  def list(request: Fields): Request[ListEnvironmentsResponse] = js.native
  
  def reauthorize(request: Callback, body: Environment): Request[Environment] = js.native
  /** Re-generates the authorization code for a GTM Environment. */
  def reauthorize(request: Key): Request[Environment] = js.native
  
  /** Updates a GTM Environment. */
  def update(request: Fingerprint): Request[Environment] = js.native
  def update(request: Oauthtoken, body: Environment): Request[Environment] = js.native
}
