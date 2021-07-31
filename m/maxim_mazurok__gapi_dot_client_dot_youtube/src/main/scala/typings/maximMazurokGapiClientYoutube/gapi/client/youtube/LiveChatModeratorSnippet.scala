package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatModeratorSnippet extends StObject {
  
  /** The ID of the live chat this moderator can act on. */
  var liveChatId: js.UndefOr[String] = js.undefined
  
  /** Details about the moderator. */
  var moderatorDetails: js.UndefOr[ChannelProfileDetails] = js.undefined
}
object LiveChatModeratorSnippet {
  
  @scala.inline
  def apply(): LiveChatModeratorSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatModeratorSnippet]
  }
  
  @scala.inline
  implicit class LiveChatModeratorSnippetMutableBuilder[Self <: LiveChatModeratorSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    @scala.inline
    def setModeratorDetails(value: ChannelProfileDetails): Self = StObject.set(x, "moderatorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeratorDetailsUndefined: Self = StObject.set(x, "moderatorDetails", js.undefined)
  }
}
