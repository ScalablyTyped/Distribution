package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientDisplayvideo.anon.AdvertiserId
import typings.maximMazurokGapiClientDisplayvideo.anon.Fields
import typings.maximMazurokGapiClientDisplayvideo.anon.KeyLocationListId
import typings.maximMazurokGapiClientDisplayvideo.anon.ResourceUploadType
import typings.maximMazurokGapiClientDisplayvideo.anon.UpdateMaskUploadType
import typings.maximMazurokGapiClientDisplayvideo.anon.UploadTypeUploadprotocol
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationListsResource extends js.Object {
  
  var assignedLocations: AssignedLocationsResource = js.native
  
  def create(request: AdvertiserId, body: LocationList): Request[LocationList] = js.native
  /** Creates a new location list. Returns the newly created location list if successful. */
  def create(request: ResourceUploadType): Request[LocationList] = js.native
  
  /** Gets a location list. */
  def get(): Request[LocationList] = js.native
  def get(request: KeyLocationListId): Request[LocationList] = js.native
  
  /** Lists location lists based on a given advertiser id. */
  def list(): Request[ListLocationListsResponse] = js.native
  def list(request: Fields): Request[ListLocationListsResponse] = js.native
  
  /** Updates a location list. Returns the updated location list if successful. */
  def patch(request: UpdateMaskUploadType): Request[LocationList] = js.native
  def patch(request: UploadTypeUploadprotocol, body: LocationList): Request[LocationList] = js.native
}
