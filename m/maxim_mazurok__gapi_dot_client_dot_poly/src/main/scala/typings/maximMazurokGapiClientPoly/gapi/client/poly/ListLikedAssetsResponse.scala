package typings.maximMazurokGapiClientPoly.gapi.client.poly

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListLikedAssetsResponse extends StObject {
  
  /** A list of assets that match the criteria specified in the request. */
  var assets: js.UndefOr[js.Array[Asset]] = js.undefined
  
  /**
    * The continuation token for retrieving the next page. If empty, indicates that there are no more pages. To get the next page, submit the same request specifying this value as the
    * page_token.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The total number of assets in the list, without pagination. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object ListLikedAssetsResponse {
  
  inline def apply(): ListLikedAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListLikedAssetsResponse]
  }
  
  extension [Self <: ListLikedAssetsResponse](x: Self) {
    
    inline def setAssets(value: js.Array[Asset]): Self = StObject.set(x, "assets", value.asInstanceOf[js.Any])
    
    inline def setAssetsUndefined: Self = StObject.set(x, "assets", js.undefined)
    
    inline def setAssetsVarargs(value: Asset*): Self = StObject.set(x, "assets", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
