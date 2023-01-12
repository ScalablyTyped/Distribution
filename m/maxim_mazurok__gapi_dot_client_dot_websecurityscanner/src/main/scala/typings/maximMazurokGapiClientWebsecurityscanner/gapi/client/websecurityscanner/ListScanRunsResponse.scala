package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListScanRunsResponse extends StObject {
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** The list of ScanRuns returned. */
  var scanRuns: js.UndefOr[js.Array[ScanRun]] = js.undefined
}
object ListScanRunsResponse {
  
  inline def apply(): ListScanRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListScanRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListScanRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setScanRuns(value: js.Array[ScanRun]): Self = StObject.set(x, "scanRuns", value.asInstanceOf[js.Any])
    
    inline def setScanRunsUndefined: Self = StObject.set(x, "scanRuns", js.undefined)
    
    inline def setScanRunsVarargs(value: ScanRun*): Self = StObject.set(x, "scanRuns", js.Array(value*))
  }
}
