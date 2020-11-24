package typings.maximMazurokGapiClientMonitoring.gapi.client.monitoring

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientMonitoring.anon.Filter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembersResource extends js.Object {
  
  /** Lists the monitored resources that are members of a group. */
  def list(): Request[ListGroupMembersResponse] = js.native
  def list(request: Filter): Request[ListGroupMembersResponse] = js.native
}
