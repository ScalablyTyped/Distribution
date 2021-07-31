package typings.maximMazurokGapiClientVision.gapi.client.vision

import typings.gapiClient.gapi.client.Request
import typings.maximMazurokGapiClientVision.anon.AccesstokenAlt
import typings.maximMazurokGapiClientVision.anon.CallbackFields
import typings.maximMazurokGapiClientVision.anon.FieldsKey
import typings.maximMazurokGapiClientVision.anon.Key
import typings.maximMazurokGapiClientVision.anon.KeyName
import typings.maximMazurokGapiClientVision.anon.KeyOauthtoken
import typings.maximMazurokGapiClientVision.anon.Name
import typings.maximMazurokGapiClientVision.anon.NameOauthtoken
import typings.maximMazurokGapiClientVision.anon.PageSize
import typings.maximMazurokGapiClientVision.anon.ProductSetId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductSetsResource extends StObject {
  
  /**
    * Adds a Product to the specified ProductSet. If the Product is already present, no change is made. One Product can be added to at most 100 ProductSets. Possible errors: * Returns
    * NOT_FOUND if the Product or the ProductSet doesn't exist.
    */
  def addProduct(request: CallbackFields): Request[js.Object] = js.native
  def addProduct(request: Name, body: AddProductToProductSetRequest): Request[js.Object] = js.native
  
  def create(request: FieldsKey, body: ProductSet): Request[ProductSet] = js.native
  /** Creates and returns a new ProductSet resource. Possible errors: * Returns INVALID_ARGUMENT if display_name is missing, or is longer than 4096 characters. */
  def create(request: ProductSetId): Request[ProductSet] = js.native
  
  /** Permanently deletes a ProductSet. Products and ReferenceImages in the ProductSet are not deleted. The actual image files are not deleted from Google Cloud Storage. */
  def delete(): Request[js.Object] = js.native
  def delete(request: Name): Request[js.Object] = js.native
  
  /** Gets information associated with a ProductSet. Possible errors: * Returns NOT_FOUND if the ProductSet does not exist. */
  def get(): Request[ProductSet] = js.native
  def get(request: Name): Request[ProductSet] = js.native
  
  /**
    * Asynchronous API that imports a list of reference images to specified product sets based on a list of image information. The google.longrunning.Operation API can be used to keep
    * track of the progress and results of the request. `Operation.metadata` contains `BatchOperationMetadata`. (progress) `Operation.response` contains `ImportProductSetsResponse`.
    * (results) The input source of this method is a csv file on Google Cloud Storage. For the format of the csv file please see ImportProductSetsGcsSource.csv_file_uri.
    */
  def `import`(request: KeyOauthtoken): Request[Operation] = js.native
  def `import`(request: Key, body: ImportProductSetsRequest): Request[Operation] = js.native
  
  /** Lists ProductSets in an unspecified order. Possible errors: * Returns INVALID_ARGUMENT if page_size is greater than 100, or less than 1. */
  def list(): Request[ListProductSetsResponse] = js.native
  def list(request: PageSize): Request[ListProductSetsResponse] = js.native
  
  def patch(request: AccesstokenAlt, body: ProductSet): Request[ProductSet] = js.native
  /**
    * Makes changes to a ProductSet resource. Only display_name can be updated currently. Possible errors: * Returns NOT_FOUND if the ProductSet does not exist. * Returns INVALID_ARGUMENT
    * if display_name is present in update_mask but missing from the request or longer than 4096 characters.
    */
  def patch(request: KeyName): Request[ProductSet] = js.native
  
  var products: ProductsResource = js.native
  
  /** Removes a Product from the specified ProductSet. */
  def removeProduct(request: NameOauthtoken): Request[js.Object] = js.native
  def removeProduct(request: Name, body: RemoveProductFromProductSetRequest): Request[js.Object] = js.native
}
