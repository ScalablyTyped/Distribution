package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMemberMilestoneChatDetails extends StObject {
  
  /** The name of the Level at which the viever is a member. The Level names are defined by the YouTube channel offering the Membership. In some situations this field isn't filled. */
  var memberLevelName: js.UndefOr[String] = js.undefined
  
  /**
    * The total amount of months (rounded up) the viewer has been a member that granted them this Member Milestone Chat. This is the same number of months as is being displayed to YouTube
    * users.
    */
  var memberMonth: js.UndefOr[Double] = js.undefined
  
  /** The comment added by the member to this Member Milestone Chat. This field is empty for messages without a comment from the member. */
  var userComment: js.UndefOr[String] = js.undefined
}
object LiveChatMemberMilestoneChatDetails {
  
  inline def apply(): LiveChatMemberMilestoneChatDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMemberMilestoneChatDetails]
  }
  
  extension [Self <: LiveChatMemberMilestoneChatDetails](x: Self) {
    
    inline def setMemberLevelName(value: String): Self = StObject.set(x, "memberLevelName", value.asInstanceOf[js.Any])
    
    inline def setMemberLevelNameUndefined: Self = StObject.set(x, "memberLevelName", js.undefined)
    
    inline def setMemberMonth(value: Double): Self = StObject.set(x, "memberMonth", value.asInstanceOf[js.Any])
    
    inline def setMemberMonthUndefined: Self = StObject.set(x, "memberMonth", js.undefined)
    
    inline def setUserComment(value: String): Self = StObject.set(x, "userComment", value.asInstanceOf[js.Any])
    
    inline def setUserCommentUndefined: Self = StObject.set(x, "userComment", js.undefined)
  }
}
