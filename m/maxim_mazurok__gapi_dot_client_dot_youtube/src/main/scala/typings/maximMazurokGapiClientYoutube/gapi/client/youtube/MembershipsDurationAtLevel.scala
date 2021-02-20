package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsDurationAtLevel extends StObject {
  
  /** Pricing level ID. */
  var level: js.UndefOr[String] = js.native
  
  /** The date and time when the user became a continuous member for the given level. */
  var memberSince: js.UndefOr[String] = js.native
  
  /** The cumulative time the user has been a member for the given level in complete months (the time is rounded down to the nearest integer). */
  var memberTotalDurationMonths: js.UndefOr[Double] = js.native
}
object MembershipsDurationAtLevel {
  
  @scala.inline
  def apply(): MembershipsDurationAtLevel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipsDurationAtLevel]
  }
  
  @scala.inline
  implicit class MembershipsDurationAtLevelMutableBuilder[Self <: MembershipsDurationAtLevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
    
    @scala.inline
    def setMemberSince(value: String): Self = StObject.set(x, "memberSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberSinceUndefined: Self = StObject.set(x, "memberSince", js.undefined)
    
    @scala.inline
    def setMemberTotalDurationMonths(value: Double): Self = StObject.set(x, "memberTotalDurationMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMemberTotalDurationMonthsUndefined: Self = StObject.set(x, "memberTotalDurationMonths", js.undefined)
  }
}
