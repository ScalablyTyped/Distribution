package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingsResult extends js.Object {
  
  /** Finding matching the search request. */
  var finding: js.UndefOr[Finding] = js.native
  
  /** Output only. Resource that is associated with this finding. */
  var resource: js.UndefOr[Resource] = js.native
  
  /** State change of the finding between the points in time. */
  var stateChange: js.UndefOr[String] = js.native
}
object ListFindingsResult {
  
  @scala.inline
  def apply(): ListFindingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingsResult]
  }
  
  @scala.inline
  implicit class ListFindingsResultOps[Self <: ListFindingsResult] (val x: Self) extends AnyVal {
    
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
    def setFinding(value: Finding): Self = this.set("finding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinding: Self = this.set("finding", js.undefined)
    
    @scala.inline
    def setResource(value: Resource): Self = this.set("resource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    
    @scala.inline
    def setStateChange(value: String): Self = this.set("stateChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateChange: Self = this.set("stateChange", js.undefined)
  }
}
