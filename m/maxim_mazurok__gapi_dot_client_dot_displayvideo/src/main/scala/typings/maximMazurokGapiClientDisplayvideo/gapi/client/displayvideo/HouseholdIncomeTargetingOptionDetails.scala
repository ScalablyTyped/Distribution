package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HouseholdIncomeTargetingOptionDetails extends StObject {
  
  /** Output only. The household income of an audience. */
  var householdIncome: js.UndefOr[String] = js.native
}
object HouseholdIncomeTargetingOptionDetails {
  
  @scala.inline
  def apply(): HouseholdIncomeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HouseholdIncomeTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class HouseholdIncomeTargetingOptionDetailsMutableBuilder[Self <: HouseholdIncomeTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHouseholdIncome(value: String): Self = StObject.set(x, "householdIncome", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHouseholdIncomeUndefined: Self = StObject.set(x, "householdIncome", js.undefined)
  }
}
