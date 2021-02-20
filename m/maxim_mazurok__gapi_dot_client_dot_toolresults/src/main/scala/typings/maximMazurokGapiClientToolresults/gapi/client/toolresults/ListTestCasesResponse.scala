package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestCasesResponse extends StObject {
  
  var nextPageToken: js.UndefOr[String] = js.native
  
  /** List of test cases. */
  var testCases: js.UndefOr[js.Array[TestCase]] = js.native
}
object ListTestCasesResponse {
  
  @scala.inline
  def apply(): ListTestCasesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestCasesResponse]
  }
  
  @scala.inline
  implicit class ListTestCasesResponseMutableBuilder[Self <: ListTestCasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
    
    @scala.inline
    def setTestCases(value: js.Array[TestCase]): Self = StObject.set(x, "testCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTestCasesUndefined: Self = StObject.set(x, "testCases", js.undefined)
    
    @scala.inline
    def setTestCasesVarargs(value: TestCase*): Self = StObject.set(x, "testCases", js.Array(value :_*))
  }
}
