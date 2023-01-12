package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberSnippet extends StObject {
  
  /** The id of the channel that's offering memberships. */
  var creatorChannelId: js.UndefOr[String] = js.undefined
  
  /** Details about the member. */
  var memberDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
  
  /** Details about the user's membership. */
  var membershipsDetails: js.UndefOr[MembershipsDetails] = js.undefined
}
object MemberSnippet {
  
  inline def apply(): MemberSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberSnippet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberSnippet] (val x: Self) extends AnyVal {
    
    inline def setCreatorChannelId(value: String): Self = StObject.set(x, "creatorChannelId", value.asInstanceOf[js.Any])
    
    inline def setCreatorChannelIdUndefined: Self = StObject.set(x, "creatorChannelId", js.undefined)
    
    inline def setMemberDetails(value: ChannelProfileDetails): Self = StObject.set(x, "memberDetails", value.asInstanceOf[js.Any])
    
    inline def setMemberDetailsUndefined: Self = StObject.set(x, "memberDetails", js.undefined)
    
    inline def setMembershipsDetails(value: MembershipsDetails): Self = StObject.set(x, "membershipsDetails", value.asInstanceOf[js.Any])
    
    inline def setMembershipsDetailsUndefined: Self = StObject.set(x, "membershipsDetails", js.undefined)
  }
}
