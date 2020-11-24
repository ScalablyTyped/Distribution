package typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Accesstoken
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Alt
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Callback
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupItemsResource extends js.Object {
  
  /** Removes an item from a group. */
  def delete(): Request[EmptyResponse] = js.native
  def delete(request: Accesstoken): Request[EmptyResponse] = js.native
  
  /** Creates a group item. */
  def insert(request: Alt): Request[GroupItem] = js.native
  def insert(request: Callback, body: GroupItem): Request[GroupItem] = js.native
  
  /** Returns a collection of group items that match the API request parameters. */
  def list(): Request[ListGroupItemsResponse] = js.native
  def list(request: Fields): Request[ListGroupItemsResponse] = js.native
}
