package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientManufacturers.anon.Accesstoken
import typings.maximMazurokGapiClientManufacturers.anon.Alt
import typings.maximMazurokGapiClientManufacturers.anon.Callback
import typings.maximMazurokGapiClientManufacturers.anon.Fields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductsResource extends js.Object {
  
  /** Deletes the product from a Manufacturer Center account. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Accesstoken): Request[js.Object] = js.native
  
  /**
    * Gets the product from a Manufacturer Center account, including product issues. A recently updated product takes around 15 minutes to process. Changes are only visible after it has
    * been processed. While some issues may be available once the product has been processed, other issues may take days to appear.
    */
  def get(): Request[Product] = js.native
  def get(request: Alt): Request[Product] = js.native
  
  /** Lists all the products in a Manufacturer Center account. */
  def list(): Request[ListProductsResponse] = js.native
  def list(request: Callback): Request[ListProductsResponse] = js.native
  
  def update(request: Accesstoken, body: Attributes): Request[js.Object] = js.native
  /**
    * Inserts or updates the attributes of the product in a Manufacturer Center account. Creates a product with the provided attributes. If the product already exists, then all attributes
    * are replaced with the new ones. The checks at upload time are minimal. All required attributes need to be present for a product to be valid. Issues may show up later after the API
    * has accepted a new upload for a product and it is possible to overwrite an existing valid product with an invalid product. To detect this, you should retrieve the product and check
    * it for issues once the new version is available. Uploaded attributes first need to be processed before they can be retrieved. Until then, new products will be unavailable, and
    * retrieval of previously uploaded products will return the original state of the product.
    */
  def update(request: Fields): Request[js.Object] = js.native
}
