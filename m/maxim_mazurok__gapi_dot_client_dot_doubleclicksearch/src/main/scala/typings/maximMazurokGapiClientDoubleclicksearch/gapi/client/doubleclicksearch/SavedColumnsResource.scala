package typings.maximMazurokGapiClientDoubleclicksearch.gapi.client.doubleclicksearch

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDoubleclicksearch.anon.AdvertiserId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SavedColumnsResource extends js.Object {
  
  /** Retrieve the list of saved columns for a specified advertiser. */
  def list(): Request[SavedColumnList] = js.native
  def list(request: AdvertiserId): Request[SavedColumnList] = js.native
}
