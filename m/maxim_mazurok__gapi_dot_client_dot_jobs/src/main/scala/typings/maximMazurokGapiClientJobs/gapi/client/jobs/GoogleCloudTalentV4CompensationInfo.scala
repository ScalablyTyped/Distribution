package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4CompensationInfo extends js.Object {
  
  /**
    * Output only. Annualized base compensation range. Computed as base compensation entry's CompensationEntry.amount times CompensationEntry.expected_units_per_year. See
    * CompensationEntry for explanation on compensation annualization.
    */
  var annualizedBaseCompensationRange: js.UndefOr[GoogleCloudTalentV4CompensationInfoCompensationRange] = js.native
  
  /**
    * Output only. Annualized total compensation range. Computed as all compensation entries' CompensationEntry.amount times CompensationEntry.expected_units_per_year. See
    * CompensationEntry for explanation on compensation annualization.
    */
  var annualizedTotalCompensationRange: js.UndefOr[GoogleCloudTalentV4CompensationInfoCompensationRange] = js.native
  
  /** Job compensation information. At most one entry can be of type CompensationInfo.CompensationType.BASE, which is referred as **base compensation entry** for the job. */
  var entries: js.UndefOr[js.Array[GoogleCloudTalentV4CompensationInfoCompensationEntry]] = js.native
}
object GoogleCloudTalentV4CompensationInfo {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4CompensationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4CompensationInfo]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4CompensationInfoOps[Self <: GoogleCloudTalentV4CompensationInfo] (val x: Self) extends AnyVal {
    
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
    def setAnnualizedBaseCompensationRange(value: GoogleCloudTalentV4CompensationInfoCompensationRange): Self = this.set("annualizedBaseCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnualizedBaseCompensationRange: Self = this.set("annualizedBaseCompensationRange", js.undefined)
    
    @scala.inline
    def setAnnualizedTotalCompensationRange(value: GoogleCloudTalentV4CompensationInfoCompensationRange): Self = this.set("annualizedTotalCompensationRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnualizedTotalCompensationRange: Self = this.set("annualizedTotalCompensationRange", js.undefined)
    
    @scala.inline
    def setEntriesVarargs(value: GoogleCloudTalentV4CompensationInfoCompensationEntry*): Self = this.set("entries", js.Array(value :_*))
    
    @scala.inline
    def setEntries(value: js.Array[GoogleCloudTalentV4CompensationInfoCompensationEntry]): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
  }
}
