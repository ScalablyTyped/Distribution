package typings.maximMazurokGapiClientVision.gapi.client.vision

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVision.anon.Name
import typings.maximMazurokGapiClientVision.anon.PageSize
import typings.maximMazurokGapiClientVision.anon.ReferenceImageId
import typings.maximMazurokGapiClientVision.anon.Uploadprotocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReferenceImagesResource extends StObject {
  
  /**
    * Creates and returns a new ReferenceImage resource. The `bounding_poly` field is optional. If `bounding_poly` is not specified, the system will try to detect regions of interest in
    * the image that are compatible with the product_category on the parent product. If it is specified, detection is ALWAYS skipped. The system converts polygons into non-rotated
    * rectangles. Note that the pipeline will resize the image if the image resolution is too large to process (above 50MP). Possible errors: * Returns INVALID_ARGUMENT if the image_uri
    * is missing or longer than 4096 characters. * Returns INVALID_ARGUMENT if the product does not exist. * Returns INVALID_ARGUMENT if bounding_poly is not provided, and nothing
    * compatible with the parent product's product_category is detected. * Returns INVALID_ARGUMENT if bounding_poly contains more than 10 polygons.
    */
  def create(request: ReferenceImageId): Request[ReferenceImage] = js.native
  def create(request: Uploadprotocol, body: ReferenceImage): Request[ReferenceImage] = js.native
  
  /**
    * Permanently deletes a reference image. The image metadata will be deleted right away, but search queries against ProductSets containing the image may still work until all related
    * caches are refreshed. The actual image files are not deleted from Google Cloud Storage.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets information associated with a ReferenceImage. Possible errors: * Returns NOT_FOUND if the specified image does not exist. */
  def get(): Request[ReferenceImage] = js.native
  def get(request: Name): Request[ReferenceImage] = js.native
  
  /** Lists reference images. Possible errors: * Returns NOT_FOUND if the parent product does not exist. * Returns INVALID_ARGUMENT if the page_size is greater than 100, or less than 1. */
  def list(): Request[ListReferenceImagesResponse] = js.native
  def list(request: PageSize): Request[ListReferenceImagesResponse] = js.native
}
