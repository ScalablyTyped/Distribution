package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MembershipsDetails extends js.Object {
  
  /** Ids of all levels that the user has access to. This includes the currently active level and all other levels that are included because of a higher purchase. */
  var accessibleLevels: js.UndefOr[js.Array[String]] = js.native
  
  /** Id of the highest level that the user has access to at the moment. */
  var highestAccessibleLevel: js.UndefOr[String] = js.native
  
  /** Display name for the highest level that the user has access to at the moment. */
  var highestAccessibleLevelDisplayName: js.UndefOr[String] = js.native
  
  /** Data about memberships duration without taking into consideration pricing levels. */
  var membershipsDuration: js.UndefOr[MembershipsDuration] = js.native
  
  /** Data about memberships duration on particular pricing levels. */
  var membershipsDurationAtLevels: js.UndefOr[js.Array[MembershipsDurationAtLevel]] = js.native
}
object MembershipsDetails {
  
  @scala.inline
  def apply(): MembershipsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MembershipsDetails]
  }
  
  @scala.inline
  implicit class MembershipsDetailsOps[Self <: MembershipsDetails] (val x: Self) extends AnyVal {
    
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
    def setAccessibleLevelsVarargs(value: String*): Self = this.set("accessibleLevels", js.Array(value :_*))
    
    @scala.inline
    def setAccessibleLevels(value: js.Array[String]): Self = this.set("accessibleLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleLevels: Self = this.set("accessibleLevels", js.undefined)
    
    @scala.inline
    def setHighestAccessibleLevel(value: String): Self = this.set("highestAccessibleLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighestAccessibleLevel: Self = this.set("highestAccessibleLevel", js.undefined)
    
    @scala.inline
    def setHighestAccessibleLevelDisplayName(value: String): Self = this.set("highestAccessibleLevelDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighestAccessibleLevelDisplayName: Self = this.set("highestAccessibleLevelDisplayName", js.undefined)
    
    @scala.inline
    def setMembershipsDuration(value: MembershipsDuration): Self = this.set("membershipsDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipsDuration: Self = this.set("membershipsDuration", js.undefined)
    
    @scala.inline
    def setMembershipsDurationAtLevelsVarargs(value: MembershipsDurationAtLevel*): Self = this.set("membershipsDurationAtLevels", js.Array(value :_*))
    
    @scala.inline
    def setMembershipsDurationAtLevels(value: js.Array[MembershipsDurationAtLevel]): Self = this.set("membershipsDurationAtLevels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipsDurationAtLevels: Self = this.set("membershipsDurationAtLevels", js.undefined)
  }
}
