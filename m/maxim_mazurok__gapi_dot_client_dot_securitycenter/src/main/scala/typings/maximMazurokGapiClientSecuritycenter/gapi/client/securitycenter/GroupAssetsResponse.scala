package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupAssetsResponse extends StObject {
  
  /**
    * Group results. There exists an element for each existing unique combination of property/values. The element contains a count for the number of times those specific property/values
    * appear.
    */
  var groupByResults: js.UndefOr[js.Array[GroupResult]] = js.undefined
  
  /** Token to retrieve the next page of results, or empty if there are no more results. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Time used for executing the groupBy request. */
  var readTime: js.UndefOr[String] = js.undefined
  
  /** The total number of results matching the query. */
  var totalSize: js.UndefOr[Double] = js.undefined
}
object GroupAssetsResponse {
  
  inline def apply(): GroupAssetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupAssetsResponse]
  }
  
  extension [Self <: GroupAssetsResponse](x: Self) {
    
    inline def setGroupByResults(value: js.Array[GroupResult]): Self = StObject.set(x, "groupByResults", value.asInstanceOf[js.Any])
    
    inline def setGroupByResultsUndefined: Self = StObject.set(x, "groupByResults", js.undefined)
    
    inline def setGroupByResultsVarargs(value: GroupResult*): Self = StObject.set(x, "groupByResults", js.Array(value*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setTotalSize(value: Double): Self = StObject.set(x, "totalSize", value.asInstanceOf[js.Any])
    
    inline def setTotalSizeUndefined: Self = StObject.set(x, "totalSize", js.undefined)
  }
}
