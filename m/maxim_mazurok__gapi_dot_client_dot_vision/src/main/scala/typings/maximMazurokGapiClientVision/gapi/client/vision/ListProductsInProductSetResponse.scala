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
  
  @scala.inline
  def apply(): ListProductsInProductSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductsInProductSetResponse]
  }
  
  @scala.inline
  implicit class ListProductsInProductSetResponseMutableBuilder[Self <: ListProductsInProductSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProducts(value: js.Array[Product]): Self = StObject.set(x, "products", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductsUndefined: Self = StObject.set(x, "products", js.undefined)
    
    @scala.inline
    def setProductsVarargs(value: Product*): Self = StObject.set(x, "products", js.Array(value :_*))
  }
}
