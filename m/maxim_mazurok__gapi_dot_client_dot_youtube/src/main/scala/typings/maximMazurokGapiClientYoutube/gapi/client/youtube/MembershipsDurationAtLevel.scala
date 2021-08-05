package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MembershipsDurationAtLevel extends StObject {
  
  /** Pricing level ID. */
  var level: js.UndefOr[String] = js.undefined
  
  /** The date and time when the user became a continuous member for the given level. */
  var memberSince: js.UndefOr[String] = js.undefined
  
  /** The cumulative time the user has been a member for the given level in complete months (the time is rounded down to the nearest integer). */
  var memberTotalDurationMonths: js.UndefOr[Double] = js.undefined
}
object MembershipsDurationAtLevel {
  
  inline def apply(): MembershipsDurationAtLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipsDurationAtLevel]
  }
  
  extension [Self <: MembershipsDurationAtLevel](x: Self) {
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    inline def setMemberSince(value: String): Self = StObject.set(x, "memberSince", value.asInstanceOf[js.Any])
    
    inline def setMemberSinceUndefined: Self = StObject.set(x, "memberSince", js.undefined)
    
    inline def setMemberTotalDurationMonths(value: Double): Self = StObject.set(x, "memberTotalDurationMonths", value.asInstanceOf[js.Any])
    
    inline def setMemberTotalDurationMonthsUndefined: Self = StObject.set(x, "memberTotalDurationMonths", js.undefined)
  }
}
