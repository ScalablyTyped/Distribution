package typings.maximMazurokGapiClientManufacturers.gapi.client.manufacturers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProductsResponse extends StObject {
  
  /** The token for the retrieval of the next page of product statuses. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of the products. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}
object ListProductsResponse {
  
  inline def apply(): ListProductsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListProductsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
