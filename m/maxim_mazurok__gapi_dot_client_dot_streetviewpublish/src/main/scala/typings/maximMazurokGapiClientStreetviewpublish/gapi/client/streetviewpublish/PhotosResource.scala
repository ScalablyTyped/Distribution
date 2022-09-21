package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientStreetviewpublish.anon.Alt
import typings.maximMazurokGapiClientStreetviewpublish.anon.Filter
import typings.maximMazurokGapiClientStreetviewpublish.anon.LanguageCode
import typings.maximMazurokGapiClientStreetviewpublish.anon.PrettyPrint
import typings.maximMazurokGapiClientStreetviewpublish.anon.QuotaUser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhotosResource extends StObject {
  
  def batchDelete(request: Alt, body: BatchDeletePhotosRequest): Request[BatchDeletePhotosResponse] = js.native
  /**
    * Deletes a list of Photos and their metadata. Note that if BatchDeletePhotos fails, either critical fields are missing or there is an authentication error. Even if BatchDeletePhotos
    * succeeds, individual photos in the batch may have failures. These failures are specified in each PhotoResponse.status in BatchDeletePhotosResponse.results. See DeletePhoto for
    * specific failures that can occur per photo.
    */
  def batchDelete(request: PrettyPrint): Request[BatchDeletePhotosResponse] = js.native
  
  /**
    * Gets the metadata of the specified Photo batch. Note that if BatchGetPhotos fails, either critical fields are missing or there is an authentication error. Even if BatchGetPhotos
    * succeeds, individual photos in the batch may have failures. These failures are specified in each PhotoResponse.status in BatchGetPhotosResponse.results. See GetPhoto for specific
    * failures that can occur per photo.
    */
  def batchGet(): Request[BatchGetPhotosResponse] = js.native
  def batchGet(request: LanguageCode): Request[BatchGetPhotosResponse] = js.native
  
  def batchUpdate(request: Alt, body: BatchUpdatePhotosRequest): Request[BatchUpdatePhotosResponse] = js.native
  /**
    * Updates the metadata of Photos, such as pose, place association, connections, etc. Changing the pixels of photos is not supported. Note that if BatchUpdatePhotos fails, either
    * critical fields are missing or there is an authentication error. Even if BatchUpdatePhotos succeeds, individual photos in the batch may have failures. These failures are specified
    * in each PhotoResponse.status in BatchUpdatePhotosResponse.results. See UpdatePhoto for specific failures that can occur per photo. Only the fields specified in updateMask field are
    * used. If `updateMask` is not present, the update applies to all fields. The number of UpdatePhotoRequest messages in a BatchUpdatePhotosRequest must not exceed 20. > Note: To update
    * Pose.altitude, Pose.latLngPair has to be filled as well. Otherwise, the request will fail.
    */
  def batchUpdate(request: QuotaUser): Request[BatchUpdatePhotosResponse] = js.native
  
  /** Lists all the Photos that belong to the user. > Note: Recently created photos that are still being indexed are not returned in the response. */
  def list(): Request[ListPhotosResponse] = js.native
  def list(request: Filter): Request[ListPhotosResponse] = js.native
}
