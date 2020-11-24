package typings.maximMazurokGapiClientReseller.gapi.client.reseller

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientReseller.anon.Alt
import typings.maximMazurokGapiClientReseller.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResellernotifyResource extends js.Object {
  
  /** Returns all the details of the watch corresponding to the reseller. */
  def getwatchdetails(): Request[ResellernotifyGetwatchdetailsResponse] = js.native
  def getwatchdetails(request: Alt): Request[ResellernotifyGetwatchdetailsResponse] = js.native
  
  /** Registers a Reseller for receiving notifications. */
  def register(): Request[ResellernotifyResource] = js.native
  def register(request: Fields): Request[ResellernotifyResource] = js.native
  
  /** Topic name of the PubSub */
  var topicName: js.UndefOr[String] = js.native
  
  /** Unregisters a Reseller for receiving notifications. */
  def unregister(): Request[ResellernotifyResource] = js.native
  def unregister(request: Fields): Request[ResellernotifyResource] = js.native
}
