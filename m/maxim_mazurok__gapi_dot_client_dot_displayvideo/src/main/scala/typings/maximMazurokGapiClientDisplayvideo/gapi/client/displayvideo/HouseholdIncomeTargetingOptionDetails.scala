package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HouseholdIncomeTargetingOptionDetails extends StObject {
  
  /** Output only. The household income of an audience. */
  var householdIncome: js.UndefOr[String] = js.undefined
}
object HouseholdIncomeTargetingOptionDetails {
  
  inline def apply(): HouseholdIncomeTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HouseholdIncomeTargetingOptionDetails]
  }
  
  extension [Self <: HouseholdIncomeTargetingOptionDetails](x: Self) {
    
    inline def setHouseholdIncome(value: String): Self = StObject.set(x, "householdIncome", value.asInstanceOf[js.Any])
    
    inline def setHouseholdIncomeUndefined: Self = StObject.set(x, "householdIncome", js.undefined)
  }
}
