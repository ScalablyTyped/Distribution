package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductSearchParams extends StObject {
  
  /** The bounding polygon around the area of interest in the image. If it is not specified, system discretion will be applied. */
  var boundingPoly: js.UndefOr[BoundingPoly] = js.undefined
  
  /**
    * The filtering expression. This can be used to restrict search results based on Product labels. We currently support an AND of OR of key-value expressions, where each expression
    * within an OR must have the same key. An '=' should be used to connect the key and value. For example, "(color = red OR color = blue) AND brand = Google" is acceptable, but "(color =
    * red OR brand = Google)" is not acceptable. "color: red" is not acceptable because it uses a ':' instead of an '='.
    */
  var filter: js.UndefOr[String] = js.undefined
  
  /**
    * The list of product categories to search in. Currently, we only consider the first category, and either "homegoods-v2", "apparel-v2", "toys-v2", "packagedgoods-v1", or "general-v1"
    * should be specified. The legacy categories "homegoods", "apparel", and "toys" are still supported but will be deprecated. For new products, please use "homegoods-v2", "apparel-v2",
    * or "toys-v2" for better product search accuracy. It is recommended to migrate existing products to these categories as well.
    */
  var productCategories: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The resource name of a ProductSet to be searched for similar images. Format is: `projects/PROJECT_ID/locations/LOC_ID/productSets/PRODUCT_SET_ID`. */
  var productSet: js.UndefOr[String] = js.undefined
}
object ProductSearchParams {
  
  inline def apply(): ProductSearchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductSearchParams]
  }
  
  extension [Self <: ProductSearchParams](x: Self) {
    
    inline def setBoundingPoly(value: BoundingPoly): Self = StObject.set(x, "boundingPoly", value.asInstanceOf[js.Any])
    
    inline def setBoundingPolyUndefined: Self = StObject.set(x, "boundingPoly", js.undefined)
    
    inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setProductCategories(value: js.Array[String]): Self = StObject.set(x, "productCategories", value.asInstanceOf[js.Any])
    
    inline def setProductCategoriesUndefined: Self = StObject.set(x, "productCategories", js.undefined)
    
    inline def setProductCategoriesVarargs(value: String*): Self = StObject.set(x, "productCategories", js.Array(value :_*))
    
    inline def setProductSet(value: String): Self = StObject.set(x, "productSet", value.asInstanceOf[js.Any])
    
    inline def setProductSetUndefined: Self = StObject.set(x, "productSet", js.undefined)
  }
}
