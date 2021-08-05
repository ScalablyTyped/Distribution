package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPerfSamplesResponse extends StObject {
  
  /**
    * Optional, returned if result size exceeds the page size specified in the request (or the default page size, 500, if unspecified). It indicates the last sample timestamp to be used
    * as page_token in subsequent request
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  var perfSamples: js.UndefOr[js.Array[PerfSample]] = js.undefined
}
object ListPerfSamplesResponse {
  
  inline def apply(): ListPerfSamplesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPerfSamplesResponse]
  }
  
  extension [Self <: ListPerfSamplesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setPerfSamples(value: js.Array[PerfSample]): Self = StObject.set(x, "perfSamples", value.asInstanceOf[js.Any])
    
    inline def setPerfSamplesUndefined: Self = StObject.set(x, "perfSamples", js.undefined)
    
    inline def setPerfSamplesVarargs(value: PerfSample*): Self = StObject.set(x, "perfSamples", js.Array(value :_*))
  }
}
