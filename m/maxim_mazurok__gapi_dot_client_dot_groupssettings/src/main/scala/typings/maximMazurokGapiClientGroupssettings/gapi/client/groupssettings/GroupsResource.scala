package typings.maximMazurokGapiClientGroupssettings.gapi.client.groupssettings

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientGroupssettings.anon.Alt
import typings.maximMazurokGapiClientGroupssettings.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends js.Object {
  
  /** Gets one resource by id. */
  def get(): Request[Groups] = js.native
  def get(request: Alt): Request[Groups] = js.native
  
  def patch(request: Alt, body: Groups): Request[Groups] = js.native
  /** Updates an existing resource. This method supports patch semantics. */
  def patch(request: Fields): Request[Groups] = js.native
  
  def update(request: Alt, body: Groups): Request[Groups] = js.native
  /** Updates an existing resource. */
  def update(request: Fields): Request[Groups] = js.native
}
