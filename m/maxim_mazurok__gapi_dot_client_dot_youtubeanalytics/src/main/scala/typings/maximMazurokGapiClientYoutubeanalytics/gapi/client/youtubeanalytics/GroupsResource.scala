package typings.maximMazurokGapiClientYoutubeanalytics.gapi.client.youtubeanalytics

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Accesstoken
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Callback
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Id
import typings.maximMazurokGapiClientYoutubeanalytics.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupsResource extends js.Object {
  
  /** Deletes a group. */
  def delete(): Request[EmptyResponse] = js.native
  def delete(request: Accesstoken): Request[EmptyResponse] = js.native
  
  def insert(request: Callback, body: Group): Request[Group] = js.native
  /** Creates a group. */
  def insert(request: Key): Request[Group] = js.native
  
  /**
    * Returns a collection of groups that match the API request parameters. For example, you can retrieve all groups that the authenticated user owns, or you can retrieve one or more
    * groups by their unique IDs.
    */
  def list(): Request[ListGroupsResponse] = js.native
  def list(request: Id): Request[ListGroupsResponse] = js.native
  
  def update(request: Callback, body: Group): Request[Group] = js.native
  /** Modifies a group. For example, you could change a group's title. */
  def update(request: Key): Request[Group] = js.native
}
