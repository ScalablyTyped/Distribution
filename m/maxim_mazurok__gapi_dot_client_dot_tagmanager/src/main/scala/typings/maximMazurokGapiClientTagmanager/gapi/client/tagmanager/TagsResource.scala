package typings.maximMazurokGapiClientTagmanager.gapi.client.tagmanager

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTagmanager.anon.Alt
import typings.maximMazurokGapiClientTagmanager.anon.Callback
import typings.maximMazurokGapiClientTagmanager.anon.Fields
import typings.maximMazurokGapiClientTagmanager.anon.Oauthtoken
import typings.maximMazurokGapiClientTagmanager.anon.Uploadprotocol
import typings.maximMazurokGapiClientTagmanager.anon.Xgafv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TagsResource extends js.Object {
  
  def create(request: Alt, body: Tag): Request[Tag] = js.native
  /** Creates a GTM Tag. */
  def create(request: Uploadprotocol): Request[Tag] = js.native
  
  /** Deletes a GTM Tag. */
  def delete(): Request[Unit] = js.native
  def delete(request: Callback): Request[Unit] = js.native
  
  /** Gets a GTM Tag. */
  def get(): Request[Tag] = js.native
  def get(request: Callback): Request[Tag] = js.native
  
  /** Lists all GTM Tags of a Container. */
  def list(): Request[ListTagsResponse] = js.native
  def list(request: Fields): Request[ListTagsResponse] = js.native
  
  /** Reverts changes to a GTM Tag in a GTM Workspace. */
  def revert(): Request[RevertTagResponse] = js.native
  def revert(request: Oauthtoken): Request[RevertTagResponse] = js.native
  
  def update(request: Oauthtoken, body: Tag): Request[Tag] = js.native
  /** Updates a GTM Tag. */
  def update(request: Xgafv): Request[Tag] = js.native
}
