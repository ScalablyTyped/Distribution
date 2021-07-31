package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HouseholdIncomeAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The household income of the audience. */
  var householdIncome: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_HOUSEHOLD_INCOME`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object HouseholdIncomeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): HouseholdIncomeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HouseholdIncomeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class HouseholdIncomeAssignedTargetingOptionDetailsMutableBuilder[Self <: HouseholdIncomeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHouseholdIncome(value: String): Self = StObject.set(x, "householdIncome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHouseholdIncomeUndefined: Self = StObject.set(x, "householdIncome", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
