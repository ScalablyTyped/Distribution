package typings.maximMazurokGapiClientToolresults.gapi.client.toolresults

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestCasesResponse extends js.Object {
  
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
  implicit class ListTestCasesResponseOps[Self <: ListTestCasesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
    
    @scala.inline
    def setTestCasesVarargs(value: TestCase*): Self = this.set("testCases", js.Array(value :_*))
    
    @scala.inline
    def setTestCases(value: js.Array[TestCase]): Self = this.set("testCases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTestCases: Self = this.set("testCases", js.undefined)
  }
}
