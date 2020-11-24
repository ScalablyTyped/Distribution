package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsResponse extends js.Object {
  
  /** The list of Findings returned. */
  var findings: js.UndefOr[js.Array[Finding]] = js.native
  
  /** Token to retrieve the next page of results, or empty if there are no more results in the list. */
  var nextPageToken: js.UndefOr[String] = js.native
}
object ListFindingsResponse {
  
  @scala.inline
  def apply(): ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsResponse]
  }
  
  @scala.inline
  implicit class ListFindingsResponseOps[Self <: ListFindingsResponse] (val x: Self) extends AnyVal {
    
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
    def setFindingsVarargs(value: Finding*): Self = this.set("findings", js.Array(value :_*))
    
    @scala.inline
    def setFindings(value: js.Array[Finding]): Self = this.set("findings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindings: Self = this.set("findings", js.undefined)
    
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
}
