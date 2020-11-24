package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFindingTypeStatsResponse extends js.Object {
  
  /** The list of FindingTypeStats returned. */
  var findingTypeStats: js.UndefOr[js.Array[FindingTypeStats]] = js.native
}
object ListFindingTypeStatsResponse {
  
  @scala.inline
  def apply(): ListFindingTypeStatsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFindingTypeStatsResponse]
  }
  
  @scala.inline
  implicit class ListFindingTypeStatsResponseOps[Self <: ListFindingTypeStatsResponse] (val x: Self) extends AnyVal {
    
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
    def setFindingTypeStatsVarargs(value: FindingTypeStats*): Self = this.set("findingTypeStats", js.Array(value :_*))
    
    @scala.inline
    def setFindingTypeStats(value: js.Array[FindingTypeStats]): Self = this.set("findingTypeStats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingTypeStats: Self = this.set("findingTypeStats", js.undefined)
  }
}
