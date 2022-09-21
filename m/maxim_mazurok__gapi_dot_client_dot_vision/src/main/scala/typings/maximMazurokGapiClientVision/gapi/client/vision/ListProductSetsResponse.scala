package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProductSetsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of ProductSets. */
  var productSets: js.UndefOr[js.Array[ProductSet]] = js.undefined
}
object ListProductSetsResponse {
  
  inline def apply(): ListProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductSetsResponse]
  }
  
  extension [Self <: ListProductSetsResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setProductSets(value: js.Array[ProductSet]): Self = StObject.set(x, "productSets", value.asInstanceOf[js.Any])
    
    inline def setProductSetsUndefined: Self = StObject.set(x, "productSets", js.undefined)
    
    inline def setProductSetsVarargs(value: ProductSet*): Self = StObject.set(x, "productSets", js.Array(value*))
  }
}
