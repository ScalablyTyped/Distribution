package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberSnippet extends js.Object {
  
  /** The id of the channel that's offering memberships. */
  var creatorChannelId: js.UndefOr[String] = js.native
  
  /** Details about the member. */
  var memberDetails: js.UndefOr[ChannelProfileDetails] = js.native
  
  /** Details about the user's membership. */
  var membershipsDetails: js.UndefOr[MembershipsDetails] = js.native
}
object MemberSnippet {
  
  @scala.inline
  def apply(): MemberSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberSnippet]
  }
  
  @scala.inline
  implicit class MemberSnippetOps[Self <: MemberSnippet] (val x: Self) extends AnyVal {
    
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
    def setCreatorChannelId(value: String): Self = this.set("creatorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorChannelId: Self = this.set("creatorChannelId", js.undefined)
    
    @scala.inline
    def setMemberDetails(value: ChannelProfileDetails): Self = this.set("memberDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemberDetails: Self = this.set("memberDetails", js.undefined)
    
    @scala.inline
    def setMembershipsDetails(value: MembershipsDetails): Self = this.set("membershipsDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMembershipsDetails: Self = this.set("membershipsDetails", js.undefined)
  }
}
