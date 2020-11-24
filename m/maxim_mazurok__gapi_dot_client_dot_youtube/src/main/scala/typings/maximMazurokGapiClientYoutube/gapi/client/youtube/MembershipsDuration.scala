package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsDuration extends js.Object {
  
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
  implicit class MembershipsDurationOps[Self <: MembershipsDuration] (val x: Self) extends AnyVal {
    
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
    def setMemberSince(value: String): Self = this.set("memberSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberSince: Self = this.set("memberSince", js.undefined)
    
    @scala.inline
    def setMemberTotalDurationMonths(value: Double): Self = this.set("memberTotalDurationMonths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberTotalDurationMonths: Self = this.set("memberTotalDurationMonths", js.undefined)
  }
}
