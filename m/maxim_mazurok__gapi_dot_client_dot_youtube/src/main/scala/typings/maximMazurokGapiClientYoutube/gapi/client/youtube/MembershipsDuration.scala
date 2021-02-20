package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsDuration extends StObject {
  
  /** The date and time when the user became a continuous member across all levels. */
  var memberSince: js.UndefOr[String] = js.native
  
  /** The cumulative time the user has been a member across all levels in complete months (the time is rounded down to the nearest integer). */
  var memberTotalDurationMonths: js.UndefOr[Double] = js.native
}
object MembershipsDuration {
  
  @scala.inline
  def apply(): MembershipsDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipsDuration]
  }
  
  @scala.inline
  implicit class MembershipsDurationMutableBuilder[Self <: MembershipsDuration] (val x: Self) extends AnyVal {
    
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
