package typings.octokitTypes.endpointsMod

import typings.octokitTypes.anon.WINDOWS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillingGetGithubActionsBillingOrgResponseData extends StObject {
  
  /**
    * The amount of free GitHub Actions minutes available.
    */
  var included_minutes: Double
  
  var minutes_used_breakdown: WINDOWS
  
  /**
    * The sum of the free and paid GitHub Actions minutes used.
    */
  var total_minutes_used: Double
  
  /**
    * The total paid GitHub Actions minutes used.
    */
  var total_paid_minutes_used: Double
}
object BillingGetGithubActionsBillingOrgResponseData {
  
  inline def apply(
    included_minutes: Double,
    minutes_used_breakdown: WINDOWS,
    total_minutes_used: Double,
    total_paid_minutes_used: Double
  ): BillingGetGithubActionsBillingOrgResponseData = {
    val __obj = js.Dynamic.literal(included_minutes = included_minutes.asInstanceOf[js.Any], minutes_used_breakdown = minutes_used_breakdown.asInstanceOf[js.Any], total_minutes_used = total_minutes_used.asInstanceOf[js.Any], total_paid_minutes_used = total_paid_minutes_used.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillingGetGithubActionsBillingOrgResponseData]
  }
  
  extension [Self <: BillingGetGithubActionsBillingOrgResponseData](x: Self) {
    
    inline def setIncluded_minutes(value: Double): Self = StObject.set(x, "included_minutes", value.asInstanceOf[js.Any])
    
    inline def setMinutes_used_breakdown(value: WINDOWS): Self = StObject.set(x, "minutes_used_breakdown", value.asInstanceOf[js.Any])
    
    inline def setTotal_minutes_used(value: Double): Self = StObject.set(x, "total_minutes_used", value.asInstanceOf[js.Any])
    
    inline def setTotal_paid_minutes_used(value: Double): Self = StObject.set(x, "total_paid_minutes_used", value.asInstanceOf[js.Any])
  }
}
