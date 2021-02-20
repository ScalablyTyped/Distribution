package typings.maximMazurokGapiClientVision.gapi.client.vision

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVision.anon.AccesstokenAlt
import typings.maximMazurokGapiClientVision.anon.AltCallback
import typings.maximMazurokGapiClientVision.anon.Key
import typings.maximMazurokGapiClientVision.anon.Name
import typings.maximMazurokGapiClientVision.anon.PageSize
import typings.maximMazurokGapiClientVision.anon.PageToken
import typings.maximMazurokGapiClientVision.anon.ProductId
import typings.maximMazurokGapiClientVision.anon.UpdateMask
import typings.maximMazurokGapiClientVision.anon.Xgafv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends StObject {
  
  /**
    * Creates and returns a new product resource. Possible errors: * Returns INVALID_ARGUMENT if display_name is missing or longer than 4096 characters. * Returns INVALID_ARGUMENT if
    * description is longer than 4096 characters. * Returns INVALID_ARGUMENT if product_category is missing or invalid.
    */
  def create(request: ProductId): Request[Product] = js.native
  def create(request: Xgafv, body: Product): Request[Product] = js.native
  
  /**
    * Permanently deletes a product and its reference images. Metadata of the product and all its images will be deleted right away, but search queries against ProductSets containing the
    * product may still work until all related caches are refreshed.
    */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets information associated with a Product. Possible errors: * Returns NOT_FOUND if the Product does not exist. */
  def get(): Request[Product] = js.native
  def get(request: Name): Request[Product] = js.native
  
  /** Lists products in an unspecified order. Possible errors: * Returns INVALID_ARGUMENT if page_size is greater than 100 or less than 1. */
  /**
    * Lists the Products in a ProductSet, in an unspecified order. If the ProductSet does not exist, the products field of the response will be empty. Possible errors: * Returns
    * INVALID_ARGUMENT if page_size is greater than 100 or less than 1.
    */
  def list(): Request[ListProductsResponse] = js.native
  def list(request: PageSize): Request[ListProductsResponse] = js.native
  def list(request: PageToken): Request[ListProductsInProductSetResponse] = js.native
  
  def patch(request: AccesstokenAlt, body: Product): Request[Product] = js.native
  /**
    * Makes changes to a Product resource. Only the `display_name`, `description`, and `labels` fields can be updated right now. If labels are updated, the change will not be reflected in
    * queries until the next index time. Possible errors: * Returns NOT_FOUND if the Product does not exist. * Returns INVALID_ARGUMENT if display_name is present in update_mask but is
    * missing from the request or longer than 4096 characters. * Returns INVALID_ARGUMENT if description is present in update_mask but is longer than 4096 characters. * Returns
    * INVALID_ARGUMENT if product_category is present in update_mask.
    */
  def patch(request: UpdateMask): Request[Product] = js.native
  
  /**
    * Asynchronous API to delete all Products in a ProductSet or all Products that are in no ProductSet. If a Product is a member of the specified ProductSet in addition to other
    * ProductSets, the Product will still be deleted. It is recommended to not delete the specified ProductSet until after this operation has completed. It is also recommended to not add
    * any of the Products involved in the batch delete to a new ProductSet while this operation is running because those Products may still end up deleted. It's not possible to undo the
    * PurgeProducts operation. Therefore, it is recommended to keep the csv files used in ImportProductSets (if that was how you originally built the Product Set) before starting
    * PurgeProducts, in case you need to re-import the data after deletion. If the plan is to purge all of the Products from a ProductSet and then re-use the empty ProductSet to re-import
    * new Products into the empty ProductSet, you must wait until the PurgeProducts operation has finished for that ProductSet. The google.longrunning.Operation API can be used to keep
    * track of the progress and results of the request. `Operation.metadata` contains `BatchOperationMetadata`. (progress)
    */
  def purge(request: AltCallback): Request[Operation] = js.native
  def purge(request: Key, body: PurgeProductsRequest): Request[Operation] = js.native
  
  var referenceImages: ReferenceImagesResource = js.native
}
