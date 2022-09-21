package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScansResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** Available scans based on the list query parameters. */
  var scans: js.UndefOr[js.Array[Scan]] = js.undefined
}
object ListScansResponse {
  
  inline def apply(): ListScansResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScansResponse]
  }
  
  extension [Self <: ListScansResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setScans(value: js.Array[Scan]): Self = StObject.set(x, "scans", value.asInstanceOf[js.Any])
    
    inline def setScansUndefined: Self = StObject.set(x, "scans", js.undefined)
    
    inline def setScansVarargs(value: Scan*): Self = StObject.set(x, "scans", js.Array(value*))
  }
}
