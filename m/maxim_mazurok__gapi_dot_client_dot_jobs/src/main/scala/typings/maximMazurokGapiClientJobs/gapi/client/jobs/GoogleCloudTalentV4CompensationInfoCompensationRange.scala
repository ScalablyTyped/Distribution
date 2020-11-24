package typings.maximMazurokGapiClientJobs.gapi.client.jobs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleCloudTalentV4CompensationInfoCompensationRange extends js.Object {
  
  /** The maximum amount of compensation. If left empty, the value is set to a maximal compensation value and the currency code is set to match the currency code of min_compensation. */
  var maxCompensation: js.UndefOr[Money] = js.native
  
  /** The minimum amount of compensation. If left empty, the value is set to zero and the currency code is set to match the currency code of max_compensation. */
  var minCompensation: js.UndefOr[Money] = js.native
}
object GoogleCloudTalentV4CompensationInfoCompensationRange {
  
  @scala.inline
  def apply(): GoogleCloudTalentV4CompensationInfoCompensationRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudTalentV4CompensationInfoCompensationRange]
  }
  
  @scala.inline
  implicit class GoogleCloudTalentV4CompensationInfoCompensationRangeOps[Self <: GoogleCloudTalentV4CompensationInfoCompensationRange] (val x: Self) extends AnyVal {
    
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
    def setMaxCompensation(value: Money): Self = this.set("maxCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxCompensation: Self = this.set("maxCompensation", js.undefined)
    
    @scala.inline
    def setMinCompensation(value: Money): Self = this.set("minCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinCompensation: Self = this.set("minCompensation", js.undefined)
  }
}
