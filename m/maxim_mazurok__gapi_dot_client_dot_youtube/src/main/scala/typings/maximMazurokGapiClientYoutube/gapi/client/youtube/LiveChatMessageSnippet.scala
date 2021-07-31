package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMessageSnippet extends StObject {
  
  /**
    * The ID of the user that authored this message, this field is not always filled. textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the
    * broadcast newSponsorEvent - the user that just became a sponsor messageDeletedEvent - the moderator that took the action messageRetractedEvent - the author that retracted their
    * message userBannedEvent - the moderator that took the action superChatEvent - the user that made the purchase
    */
  var authorChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a string that can be displayed to the user. If this field is not present the message is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are
    * silent.
    */
  var displayMessage: js.UndefOr[String] = js.undefined
  
  /** Details about the funding event, this is only set if the type is 'fanFundingEvent'. */
  var fanFundingEventDetails: js.UndefOr[LiveChatFanFundingEventDetails] = js.undefined
  
  /** Whether the message has display content that should be displayed to users. */
  var hasDisplayContent: js.UndefOr[Boolean] = js.undefined
  
  var liveChatId: js.UndefOr[String] = js.undefined
  
  var messageDeletedDetails: js.UndefOr[LiveChatMessageDeletedDetails] = js.undefined
  
  var messageRetractedDetails: js.UndefOr[LiveChatMessageRetractedDetails] = js.undefined
  
  /** The date and time when the message was orignally published. The value is specified in ISO 8601 format. */
  var publishedAt: js.UndefOr[String] = js.undefined
  
  /** Details about the Super Chat event, this is only set if the type is 'superChatEvent'. */
  var superChatDetails: js.UndefOr[LiveChatSuperChatDetails] = js.undefined
  
  /** Details about the Super Sticker event, this is only set if the type is 'superStickerEvent'. */
  var superStickerDetails: js.UndefOr[LiveChatSuperStickerDetails] = js.undefined
  
  /** Details about the text message, this is only set if the type is 'textMessageEvent'. */
  var textMessageDetails: js.UndefOr[LiveChatTextMessageDetails] = js.undefined
  
  /** The type of message, this will always be present, it determines the contents of the message as well as which fields will be present. */
  var `type`: js.UndefOr[String] = js.undefined
  
  var userBannedDetails: js.UndefOr[LiveChatUserBannedMessageDetails] = js.undefined
}
object LiveChatMessageSnippet {
  
  @scala.inline
  def apply(): LiveChatMessageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageSnippet]
  }
  
  @scala.inline
  implicit class LiveChatMessageSnippetMutableBuilder[Self <: LiveChatMessageSnippet] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorChannelId(value: String): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
    
    @scala.inline
    def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayMessageUndefined: Self = StObject.set(x, "displayMessage", js.undefined)
    
    @scala.inline
    def setFanFundingEventDetails(value: LiveChatFanFundingEventDetails): Self = StObject.set(x, "fanFundingEventDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFanFundingEventDetailsUndefined: Self = StObject.set(x, "fanFundingEventDetails", js.undefined)
    
    @scala.inline
    def setHasDisplayContent(value: Boolean): Self = StObject.set(x, "hasDisplayContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasDisplayContentUndefined: Self = StObject.set(x, "hasDisplayContent", js.undefined)
    
    @scala.inline
    def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    @scala.inline
    def setMessageDeletedDetails(value: LiveChatMessageDeletedDetails): Self = StObject.set(x, "messageDeletedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageDeletedDetailsUndefined: Self = StObject.set(x, "messageDeletedDetails", js.undefined)
    
    @scala.inline
    def setMessageRetractedDetails(value: LiveChatMessageRetractedDetails): Self = StObject.set(x, "messageRetractedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageRetractedDetailsUndefined: Self = StObject.set(x, "messageRetractedDetails", js.undefined)
    
    @scala.inline
    def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    @scala.inline
    def setSuperChatDetails(value: LiveChatSuperChatDetails): Self = StObject.set(x, "superChatDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperChatDetailsUndefined: Self = StObject.set(x, "superChatDetails", js.undefined)
    
    @scala.inline
    def setSuperStickerDetails(value: LiveChatSuperStickerDetails): Self = StObject.set(x, "superStickerDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuperStickerDetailsUndefined: Self = StObject.set(x, "superStickerDetails", js.undefined)
    
    @scala.inline
    def setTextMessageDetails(value: LiveChatTextMessageDetails): Self = StObject.set(x, "textMessageDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextMessageDetailsUndefined: Self = StObject.set(x, "textMessageDetails", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUserBannedDetails(value: LiveChatUserBannedMessageDetails): Self = StObject.set(x, "userBannedDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserBannedDetailsUndefined: Self = StObject.set(x, "userBannedDetails", js.undefined)
  }
}
