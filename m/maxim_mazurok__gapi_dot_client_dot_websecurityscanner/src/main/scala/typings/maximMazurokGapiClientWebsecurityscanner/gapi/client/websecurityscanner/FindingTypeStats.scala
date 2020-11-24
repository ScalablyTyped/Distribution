package typings.maximMazurokGapiClientWebsecurityscanner.gapi.client.websecurityscanner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindingTypeStats extends js.Object {
  
  /** Output only. The count of findings belonging to this finding type. */
  var findingCount: js.UndefOr[Double] = js.native
  
  /** Output only. The finding type associated with the stats. */
  var findingType: js.UndefOr[String] = js.native
}
object FindingTypeStats {
  
  @scala.inline
  def apply(): FindingTypeStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingTypeStats]
  }
  
  @scala.inline
  implicit class FindingTypeStatsOps[Self <: FindingTypeStats] (val x: Self) extends AnyVal {
    
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
    def setFindingCount(value: Double): Self = this.set("findingCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingCount: Self = this.set("findingCount", js.undefined)
    
    @scala.inline
    def setFindingType(value: String): Self = this.set("findingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindingType: Self = this.set("findingType", js.undefined)
  }
}
