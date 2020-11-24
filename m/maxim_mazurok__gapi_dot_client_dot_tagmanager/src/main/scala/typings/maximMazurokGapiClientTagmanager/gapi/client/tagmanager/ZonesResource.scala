package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.Fields
import typings.maximMazurokGapiClientTagmanager.anon.KeyOauthtoken
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientTagmanager.anon.OauthtokenPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ZonesResource extends js.Object {
  
  def create(request: Alt, body: Zone): Request[Zone] = js.native
  /** Creates a GTM Zone. */
  def create(request: KeyOauthtoken): Request[Zone] = js.native
  
  /** Deletes a GTM Zone. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Zone. */
  def get(): Request[Zone] = js.native
  def get(request: Callback): Request[Zone] = js.native
  
  /** Lists all GTM Zones of a GTM container workspace. */
  def list(): Request[ListZonesResponse] = js.native
  def list(request: Fields): Request[ListZonesResponse] = js.native
  
  /** Reverts changes to a GTM Zone in a GTM Workspace. */
  def revert(): Request[RevertZoneResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertZoneResponse] = js.native
  
  /** Updates a GTM Zone. */
  def update(request: OauthtokenPath): Request[Zone] = js.native
  def update(request: Oauthtoken, body: Zone): Request[Zone] = js.native
}
