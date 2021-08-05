package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInstancesResponse extends StObject {
  
  /** The list of requested instances. */
  var instances: js.UndefOr[js.Array[Instance]] = js.undefined
  
  /** `next_page_token` can be sent in a subsequent ListInstances call to fetch more of the matching instances. */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object ListInstancesResponse {
  
  inline def apply(): ListInstancesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInstancesResponse]
  }
  
  extension [Self <: ListInstancesResponse](x: Self) {
    
    inline def setInstances(value: js.Array[Instance]): Self = StObject.set(x, "instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "instances", js.Array(value :_*))
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
