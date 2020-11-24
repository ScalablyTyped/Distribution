package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HouseholdIncomeAssignedTargetingOptionDetails extends js.Object {
  
  /** Output only. The household income of the audience. */
  var householdIncome: js.UndefOr[String] = js.native
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_HOUSEHOLD_INCOME`. */
  var targetingOptionId: js.UndefOr[String] = js.native
}
object HouseholdIncomeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): HouseholdIncomeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HouseholdIncomeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class HouseholdIncomeAssignedTargetingOptionDetailsOps[Self <: HouseholdIncomeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setHouseholdIncome(value: String): Self = this.set("householdIncome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHouseholdIncome: Self = this.set("householdIncome", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = this.set("targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetingOptionId: Self = this.set("targetingOptionId", js.undefined)
  }
}
