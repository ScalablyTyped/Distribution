package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsDurationAtLevel extends js.Object {
  
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
  implicit class MembershipsDurationAtLevelOps[Self <: MembershipsDurationAtLevel] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: String): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
    
    @scala.inline
    def setMemberSince(value: String): Self = this.set("memberSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberSince: Self = this.set("memberSince", js.undefined)
    
    @scala.inline
    def setMemberTotalDurationMonths(value: Double): Self = this.set("memberTotalDurationMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberTotalDurationMonths: Self = this.set("memberTotalDurationMonths", js.undefined)
  }
}
