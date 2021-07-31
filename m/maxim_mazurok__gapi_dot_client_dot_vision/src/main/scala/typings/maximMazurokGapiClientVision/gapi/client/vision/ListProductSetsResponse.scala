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
  
  @scala.inline
  def apply(): ListProductSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProductSetsResponse]
  }
  
  @scala.inline
  implicit class ListProductSetsResponseMutableBuilder[Self <: ListProductSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setProductSets(value: js.Array[ProductSet]): Self = StObject.set(x, "productSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductSetsUndefined: Self = StObject.set(x, "productSets", js.undefined)
    
    @scala.inline
    def setProductSetsVarargs(value: ProductSet*): Self = StObject.set(x, "productSets", js.Array(value :_*))
  }
}
