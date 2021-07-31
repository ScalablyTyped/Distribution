package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationsResource extends StObject {
  
  var files: FilesResource
  
  var images: ImagesResource
  
  var operations: OperationsResource
  
  var productSets: ProductSetsResource
  
  var products: ProductsResource
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
  implicit class LocationsResourceMutableBuilder[Self <: LocationsResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: FilesResource): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImages(value: ImagesResource): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperations(value: OperationsResource): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSets(value: ProductSetsResource): Self = StObject.set(x, "productSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducts(value: ProductsResource): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
  }
}
