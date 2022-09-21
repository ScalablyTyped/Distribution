package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestCasesResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.undefined
  
  /** List of test cases. */
  var testCases: js.UndefOr[js.Array[TestCase]] = js.undefined
}
object ListTestCasesResponse {
  
  inline def apply(): ListTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestCasesResponse]
  }
  
  extension [Self <: ListTestCasesResponse](x: Self) {
    
    inline def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    inline def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    inline def setTestCases(value: js.Array[TestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    inline def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    inline def setTestCasesVarargs(value: TestCase*): Self = StObject.set(x, "testCases", js.Array(value*))
  }
}
