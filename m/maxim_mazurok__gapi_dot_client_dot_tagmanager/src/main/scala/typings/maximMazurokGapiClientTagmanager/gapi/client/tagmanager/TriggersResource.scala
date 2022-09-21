package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.Fields
import typings.maximMazurokGapiClientTagmanager.anon.FieldsKey
import typings.maximMazurokGapiClientTagmanager.anon.FingerprintKey
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggersResource extends StObject {
  
  def create(request: Alt, body: Trigger): Request[Trigger] = js.native
  /** Creates a GTM Trigger. */
  def create(request: FieldsKey): Request[Trigger] = js.native
  
  /** Deletes a GTM Trigger. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Trigger. */
  def get(): Request[Trigger] = js.native
  def get(request: Callback): Request[Trigger] = js.native
  
  /** Lists all GTM Triggers of a Container. */
  def list(): Request[ListTriggersResponse] = js.native
  def list(request: Fields): Request[ListTriggersResponse] = js.native
  
  /** Reverts changes to a GTM Trigger in a GTM Workspace. */
  def revert(): Request[RevertTriggerResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertTriggerResponse] = js.native
  
  /** Updates a GTM Trigger. */
  def update(request: FingerprintKey): Request[Trigger] = js.native
  def update(request: Oauthtoken, body: Trigger): Request[Trigger] = js.native
}
