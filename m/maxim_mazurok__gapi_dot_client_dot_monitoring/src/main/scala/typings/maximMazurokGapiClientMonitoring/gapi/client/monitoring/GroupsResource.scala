package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Alt
import typings.maximMazurokGapiClientMonitoring.anon.AncestorsOfGroup
import typings.maximMazurokGapiClientMonitoring.anon.Oauthtoken
import typings.maximMazurokGapiClientMonitoring.anon.PrettyPrint
import typings.maximMazurokGapiClientMonitoring.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends StObject {
  
  /** Creates a new group. */
  def create(request: Oauthtoken): Request[Group] = js.native
  def create(request: PrettyPrint, body: Group): Request[Group] = js.native
  
  /** Deletes an existing group. */
  def delete(): Request[js.Object] = js.native
  def delete(request: QuotaUser): Request[js.Object] = js.native
  
  /** Gets a single group. */
  def get(): Request[Group] = js.native
  def get(request: Alt): Request[Group] = js.native
  
  /** Lists the existing groups. */
  def list(): Request[ListGroupsResponse] = js.native
  def list(request: AncestorsOfGroup): Request[ListGroupsResponse] = js.native
  
  var members: MembersResource = js.native
  
  /** Updates an existing group. You can change any group attributes except name. */
  def update(request: Oauthtoken): Request[Group] = js.native
  def update(request: PrettyPrint, body: Group): Request[Group] = js.native
}
