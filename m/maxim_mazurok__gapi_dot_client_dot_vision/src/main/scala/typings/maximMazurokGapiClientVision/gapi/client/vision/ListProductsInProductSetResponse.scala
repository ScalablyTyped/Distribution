package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProductsInProductSetResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of Products. */
  var products: js.UndefOr[js.Array[Product]] = js.undefined
}
object ListProductsInProductSetResponse {
  
  inline def apply(): ListProductsInProductSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductsInProductSetResponse]
  }
  
  extension [Self <: ListProductsInProductSetResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    inline def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    inline def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value*))
  }
}
