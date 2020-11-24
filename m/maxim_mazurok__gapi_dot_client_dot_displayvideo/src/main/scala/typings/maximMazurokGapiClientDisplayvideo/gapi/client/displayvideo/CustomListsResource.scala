package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.CallbackFieldsFilter
import typings.maximMazurokGapiClientDisplayvideo.anon.CustomListId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CustomListsResource extends js.Object {
  
  /** Gets a custom list. */
  def get(): Request[CustomList] = js.native
  def get(request: CustomListId): Request[CustomList] = js.native
  
  /** Lists custom lists. The order is defined by the order_by parameter. */
  def list(): Request[ListCustomListsResponse] = js.native
  def list(request: CallbackFieldsFilter): Request[ListCustomListsResponse] = js.native
}
