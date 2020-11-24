package typings.maximMazurokGapiClientTrafficdirector.gapi.client.trafficdirector

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientTrafficdirector.anon.Accesstoken
import typings.maximMazurokGapiClientTrafficdirector.anon.Alt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DiscoveryResource extends js.Object {
  
  def client_status(request: Accesstoken): Request[ClientStatusResponse] = js.native
  def client_status(request: Alt, body: ClientStatusRequest): Request[ClientStatusResponse] = js.native
}
