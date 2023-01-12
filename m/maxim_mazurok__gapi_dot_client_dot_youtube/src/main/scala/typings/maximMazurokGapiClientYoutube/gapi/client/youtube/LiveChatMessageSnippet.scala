package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveChatMessageSnippet extends StObject {
  
  /**
    * The ID of the user that authored this message, this field is not always filled. textMessageEvent - the user that wrote the message fanFundingEvent - the user that funded the
    * broadcast newSponsorEvent - the user that just became a sponsor memberMilestoneChatEvent - the member that sent the message membershipGiftingEvent - the user that made the purchase
    * giftMembershipReceivedEvent - the user that received the gift membership messageDeletedEvent - the moderator that took the action messageRetractedEvent - the author that retracted
    * their message userBannedEvent - the moderator that took the action superChatEvent - the user that made the purchase superStickerEvent - the user that made the purchase
    */
  var authorChannelId: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a string that can be displayed to the user. If this field is not present the message is silent, at the moment only messages of type TOMBSTONE and CHAT_ENDED_EVENT are
    * silent.
    */
  var displayMessage: js.UndefOr[String] = js.undefined
  
  /** Details about the funding event, this is only set if the type is 'fanFundingEvent'. */
  var fanFundingEventDetails: js.UndefOr[LiveChatFanFundingEventDetails] = js.undefined
  
  /** Details about the Gift Membership Received event, this is only set if the type is 'giftMembershipReceivedEvent'. */
  var giftMembershipReceivedDetails: js.UndefOr[LiveChatGiftMembershipReceivedDetails] = js.undefined
  
  /** Whether the message has display content that should be displayed to users. */
  var hasDisplayContent: js.UndefOr[Boolean] = js.undefined
  
  var liveChatId: js.UndefOr[String] = js.undefined
  
  /** Details about the Member Milestone Chat event, this is only set if the type is 'memberMilestoneChatEvent'. */
  var memberMilestoneChatDetails: js.UndefOr[LiveChatMemberMilestoneChatDetails] = js.undefined
  
  /** Details about the Membership Gifting event, this is only set if the type is 'membershipGiftingEvent'. */
  var membershipGiftingDetails: js.UndefOr[LiveChatMembershipGiftingDetails] = js.undefined
  
  var messageDeletedDetails: js.UndefOr[LiveChatMessageDeletedDetails] = js.undefined
  
  var messageRetractedDetails: js.UndefOr[LiveChatMessageRetractedDetails] = js.undefined
  
  /** Details about the New Member Announcement event, this is only set if the type is 'newSponsorEvent'. Please note that "member" is the new term for "sponsor". */
  var newSponsorDetails: js.UndefOr[LiveChatNewSponsorDetails] = js.undefined
  
  /** The date and time when the message was orignally published. */
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
  
  inline def apply(): LiveChatMessageSnippet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LiveChatMessageSnippet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveChatMessageSnippet] (val x: Self) extends AnyVal {
    
    inline def setAuthorChannelId(value: String): Self = StObject.set(x, "authorChannelId", value.asInstanceOf[js.Any])
    
    inline def setAuthorChannelIdUndefined: Self = StObject.set(x, "authorChannelId", js.undefined)
    
    inline def setDisplayMessage(value: String): Self = StObject.set(x, "displayMessage", value.asInstanceOf[js.Any])
    
    inline def setDisplayMessageUndefined: Self = StObject.set(x, "displayMessage", js.undefined)
    
    inline def setFanFundingEventDetails(value: LiveChatFanFundingEventDetails): Self = StObject.set(x, "fanFundingEventDetails", value.asInstanceOf[js.Any])
    
    inline def setFanFundingEventDetailsUndefined: Self = StObject.set(x, "fanFundingEventDetails", js.undefined)
    
    inline def setGiftMembershipReceivedDetails(value: LiveChatGiftMembershipReceivedDetails): Self = StObject.set(x, "giftMembershipReceivedDetails", value.asInstanceOf[js.Any])
    
    inline def setGiftMembershipReceivedDetailsUndefined: Self = StObject.set(x, "giftMembershipReceivedDetails", js.undefined)
    
    inline def setHasDisplayContent(value: Boolean): Self = StObject.set(x, "hasDisplayContent", value.asInstanceOf[js.Any])
    
    inline def setHasDisplayContentUndefined: Self = StObject.set(x, "hasDisplayContent", js.undefined)
    
    inline def setLiveChatId(value: String): Self = StObject.set(x, "liveChatId", value.asInstanceOf[js.Any])
    
    inline def setLiveChatIdUndefined: Self = StObject.set(x, "liveChatId", js.undefined)
    
    inline def setMemberMilestoneChatDetails(value: LiveChatMemberMilestoneChatDetails): Self = StObject.set(x, "memberMilestoneChatDetails", value.asInstanceOf[js.Any])
    
    inline def setMemberMilestoneChatDetailsUndefined: Self = StObject.set(x, "memberMilestoneChatDetails", js.undefined)
    
    inline def setMembershipGiftingDetails(value: LiveChatMembershipGiftingDetails): Self = StObject.set(x, "membershipGiftingDetails", value.asInstanceOf[js.Any])
    
    inline def setMembershipGiftingDetailsUndefined: Self = StObject.set(x, "membershipGiftingDetails", js.undefined)
    
    inline def setMessageDeletedDetails(value: LiveChatMessageDeletedDetails): Self = StObject.set(x, "messageDeletedDetails", value.asInstanceOf[js.Any])
    
    inline def setMessageDeletedDetailsUndefined: Self = StObject.set(x, "messageDeletedDetails", js.undefined)
    
    inline def setMessageRetractedDetails(value: LiveChatMessageRetractedDetails): Self = StObject.set(x, "messageRetractedDetails", value.asInstanceOf[js.Any])
    
    inline def setMessageRetractedDetailsUndefined: Self = StObject.set(x, "messageRetractedDetails", js.undefined)
    
    inline def setNewSponsorDetails(value: LiveChatNewSponsorDetails): Self = StObject.set(x, "newSponsorDetails", value.asInstanceOf[js.Any])
    
    inline def setNewSponsorDetailsUndefined: Self = StObject.set(x, "newSponsorDetails", js.undefined)
    
    inline def setPublishedAt(value: String): Self = StObject.set(x, "publishedAt", value.asInstanceOf[js.Any])
    
    inline def setPublishedAtUndefined: Self = StObject.set(x, "publishedAt", js.undefined)
    
    inline def setSuperChatDetails(value: LiveChatSuperChatDetails): Self = StObject.set(x, "superChatDetails", value.asInstanceOf[js.Any])
    
    inline def setSuperChatDetailsUndefined: Self = StObject.set(x, "superChatDetails", js.undefined)
    
    inline def setSuperStickerDetails(value: LiveChatSuperStickerDetails): Self = StObject.set(x, "superStickerDetails", value.asInstanceOf[js.Any])
    
    inline def setSuperStickerDetailsUndefined: Self = StObject.set(x, "superStickerDetails", js.undefined)
    
    inline def setTextMessageDetails(value: LiveChatTextMessageDetails): Self = StObject.set(x, "textMessageDetails", value.asInstanceOf[js.Any])
    
    inline def setTextMessageDetailsUndefined: Self = StObject.set(x, "textMessageDetails", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUserBannedDetails(value: LiveChatUserBannedMessageDetails): Self = StObject.set(x, "userBannedDetails", value.asInstanceOf[js.Any])
    
    inline def setUserBannedDetailsUndefined: Self = StObject.set(x, "userBannedDetails", js.undefined)
  }
}
