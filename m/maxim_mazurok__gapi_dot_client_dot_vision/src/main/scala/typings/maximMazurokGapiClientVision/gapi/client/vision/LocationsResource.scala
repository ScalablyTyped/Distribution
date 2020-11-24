package typings.maximMazurokGapiClientVision.gapi.client.vision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationsResource extends js.Object {
  
  var files: FilesResource = js.native
  
  var images: ImagesResource = js.native
  
  var operations: OperationsResource = js.native
  
  var productSets: ProductSetsResource = js.native
  
  var products: ProductsResource = js.native
}
object LocationsResource {
  
  @scala.inline
  def apply(
    files: FilesResource,
    images: ImagesResource,
    operations: OperationsResource,
    productSets: ProductSetsResource,
    products: ProductsResource
  ): LocationsResource = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], images = images.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], productSets = productSets.asInstanceOf[js.Any], products = products.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationsResource]
  }
  
  @scala.inline
  implicit class LocationsResourceOps[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFiles(value: FilesResource): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: ImagesResource): Self = this.set("images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = this.set("operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSets(value: ProductSetsResource): Self = this.set("productSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducts(value: ProductsResource): Self = this.set("products", value.asInstanceOf[js.Any])
  }
}
