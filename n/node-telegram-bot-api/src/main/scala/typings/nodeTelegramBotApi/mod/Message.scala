package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Message extends StObject {
  
  var animation: js.UndefOr[Animation] = js.native
  
  var audio: js.UndefOr[Audio] = js.native
  
  var author_signature: js.UndefOr[String] = js.native
  
  var caption: js.UndefOr[String] = js.native
  
  var caption_entities: js.UndefOr[js.Array[MessageEntity]] = js.native
  
  var channel_chat_created: js.UndefOr[Boolean] = js.native
  
  var chat: Chat = js.native
  
  var connected_website: js.UndefOr[String] = js.native
  
  var contact: js.UndefOr[Contact] = js.native
  
  var date: Double = js.native
  
  var delete_chat_photo: js.UndefOr[Boolean] = js.native
  
  var document: js.UndefOr[Document] = js.native
  
  var edit_date: js.UndefOr[Double] = js.native
  
  var entities: js.UndefOr[js.Array[MessageEntity]] = js.native
  
  var forward_date: js.UndefOr[Double] = js.native
  
  var forward_from: js.UndefOr[User] = js.native
  
  var forward_from_chat: js.UndefOr[Chat] = js.native
  
  var forward_from_message_id: js.UndefOr[Double] = js.native
  
  var forward_sender_name: js.UndefOr[String] = js.native
  
  var forward_signature: js.UndefOr[String] = js.native
  
  var from: js.UndefOr[User] = js.native
  
  var game: js.UndefOr[Game] = js.native
  
  var group_chat_created: js.UndefOr[Boolean] = js.native
  
  var invoice: js.UndefOr[Invoice] = js.native
  
  var left_chat_member: js.UndefOr[User] = js.native
  
  var location: js.UndefOr[Location] = js.native
  
  var media_group_id: js.UndefOr[String] = js.native
  
  var message_id: Double = js.native
  
  var migrate_from_chat_id: js.UndefOr[Double] = js.native
  
  var migrate_to_chat_id: js.UndefOr[Double] = js.native
  
  var new_chat_members: js.UndefOr[js.Array[User]] = js.native
  
  var new_chat_photo: js.UndefOr[js.Array[PhotoSize]] = js.native
  
  var new_chat_title: js.UndefOr[String] = js.native
  
  var passport_data: js.UndefOr[PassportData] = js.native
  
  var photo: js.UndefOr[js.Array[PhotoSize]] = js.native
  
  var pinned_message: js.UndefOr[Message] = js.native
  
  var poll: js.UndefOr[Poll] = js.native
  
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.native
  
  var reply_to_message: js.UndefOr[Message] = js.native
  
  var sticker: js.UndefOr[Sticker] = js.native
  
  var successful_payment: js.UndefOr[SuccessfulPayment] = js.native
  
  var supergroup_chat_created: js.UndefOr[Boolean] = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var venue: js.UndefOr[Venue] = js.native
  
  var video: js.UndefOr[Video] = js.native
  
  var video_note: js.UndefOr[VideoNote] = js.native
  
  var voice: js.UndefOr[Voice] = js.native
}
object Message {
  
  @scala.inline
  def apply(chat: Chat, date: Double, message_id: Double): Message = {
    val __obj = js.Dynamic.literal(chat = chat.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], message_id = message_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
  
  @scala.inline
  implicit class MessageMutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimation(value: Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
    
    @scala.inline
    def setAudio(value: Audio): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    @scala.inline
    def setAuthor_signature(value: String): Self = StObject.set(x, "author_signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor_signatureUndefined: Self = StObject.set(x, "author_signature", js.undefined)
    
    @scala.inline
    def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
    
    @scala.inline
    def setCaption_entities(value: js.Array[MessageEntity]): Self = StObject.set(x, "caption_entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaption_entitiesUndefined: Self = StObject.set(x, "caption_entities", js.undefined)
    
    @scala.inline
    def setCaption_entitiesVarargs(value: MessageEntity*): Self = StObject.set(x, "caption_entities", js.Array(value :_*))
    
    @scala.inline
    def setChannel_chat_created(value: Boolean): Self = StObject.set(x, "channel_chat_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannel_chat_createdUndefined: Self = StObject.set(x, "channel_chat_created", js.undefined)
    
    @scala.inline
    def setChat(value: Chat): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnected_website(value: String): Self = StObject.set(x, "connected_website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnected_websiteUndefined: Self = StObject.set(x, "connected_website", js.undefined)
    
    @scala.inline
    def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setDate(value: Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_chat_photo(value: Boolean): Self = StObject.set(x, "delete_chat_photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelete_chat_photoUndefined: Self = StObject.set(x, "delete_chat_photo", js.undefined)
    
    @scala.inline
    def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentUndefined: Self = StObject.set(x, "document", js.undefined)
    
    @scala.inline
    def setEdit_date(value: Double): Self = StObject.set(x, "edit_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEdit_dateUndefined: Self = StObject.set(x, "edit_date", js.undefined)
    
    @scala.inline
    def setEntities(value: js.Array[MessageEntity]): Self = StObject.set(x, "entities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntitiesUndefined: Self = StObject.set(x, "entities", js.undefined)
    
    @scala.inline
    def setEntitiesVarargs(value: MessageEntity*): Self = StObject.set(x, "entities", js.Array(value :_*))
    
    @scala.inline
    def setForward_date(value: Double): Self = StObject.set(x, "forward_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward_dateUndefined: Self = StObject.set(x, "forward_date", js.undefined)
    
    @scala.inline
    def setForward_from(value: User): Self = StObject.set(x, "forward_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward_fromUndefined: Self = StObject.set(x, "forward_from", js.undefined)
    
    @scala.inline
    def setForward_from_chat(value: Chat): Self = StObject.set(x, "forward_from_chat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward_from_chatUndefined: Self = StObject.set(x, "forward_from_chat", js.undefined)
    
    @scala.inline
    def setForward_from_message_id(value: Double): Self = StObject.set(x, "forward_from_message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward_from_message_idUndefined: Self = StObject.set(x, "forward_from_message_id", js.undefined)
    
    @scala.inline
    def setForward_sender_name(value: String): Self = StObject.set(x, "forward_sender_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward_sender_nameUndefined: Self = StObject.set(x, "forward_sender_name", js.undefined)
    
    @scala.inline
    def setForward_signature(value: String): Self = StObject.set(x, "forward_signature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward_signatureUndefined: Self = StObject.set(x, "forward_signature", js.undefined)
    
    @scala.inline
    def setFrom(value: User): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGameUndefined: Self = StObject.set(x, "game", js.undefined)
    
    @scala.inline
    def setGroup_chat_created(value: Boolean): Self = StObject.set(x, "group_chat_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup_chat_createdUndefined: Self = StObject.set(x, "group_chat_created", js.undefined)
    
    @scala.inline
    def setInvoice(value: Invoice): Self = StObject.set(x, "invoice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvoiceUndefined: Self = StObject.set(x, "invoice", js.undefined)
    
    @scala.inline
    def setLeft_chat_member(value: User): Self = StObject.set(x, "left_chat_member", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft_chat_memberUndefined: Self = StObject.set(x, "left_chat_member", js.undefined)
    
    @scala.inline
    def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setMedia_group_id(value: String): Self = StObject.set(x, "media_group_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedia_group_idUndefined: Self = StObject.set(x, "media_group_id", js.undefined)
    
    @scala.inline
    def setMessage_id(value: Double): Self = StObject.set(x, "message_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrate_from_chat_id(value: Double): Self = StObject.set(x, "migrate_from_chat_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrate_from_chat_idUndefined: Self = StObject.set(x, "migrate_from_chat_id", js.undefined)
    
    @scala.inline
    def setMigrate_to_chat_id(value: Double): Self = StObject.set(x, "migrate_to_chat_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMigrate_to_chat_idUndefined: Self = StObject.set(x, "migrate_to_chat_id", js.undefined)
    
    @scala.inline
    def setNew_chat_members(value: js.Array[User]): Self = StObject.set(x, "new_chat_members", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_chat_membersUndefined: Self = StObject.set(x, "new_chat_members", js.undefined)
    
    @scala.inline
    def setNew_chat_membersVarargs(value: User*): Self = StObject.set(x, "new_chat_members", js.Array(value :_*))
    
    @scala.inline
    def setNew_chat_photo(value: js.Array[PhotoSize]): Self = StObject.set(x, "new_chat_photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_chat_photoUndefined: Self = StObject.set(x, "new_chat_photo", js.undefined)
    
    @scala.inline
    def setNew_chat_photoVarargs(value: PhotoSize*): Self = StObject.set(x, "new_chat_photo", js.Array(value :_*))
    
    @scala.inline
    def setNew_chat_title(value: String): Self = StObject.set(x, "new_chat_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNew_chat_titleUndefined: Self = StObject.set(x, "new_chat_title", js.undefined)
    
    @scala.inline
    def setPassport_data(value: PassportData): Self = StObject.set(x, "passport_data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassport_dataUndefined: Self = StObject.set(x, "passport_data", js.undefined)
    
    @scala.inline
    def setPhoto(value: js.Array[PhotoSize]): Self = StObject.set(x, "photo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoUndefined: Self = StObject.set(x, "photo", js.undefined)
    
    @scala.inline
    def setPhotoVarargs(value: PhotoSize*): Self = StObject.set(x, "photo", js.Array(value :_*))
    
    @scala.inline
    def setPinned_message(value: Message): Self = StObject.set(x, "pinned_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPinned_messageUndefined: Self = StObject.set(x, "pinned_message", js.undefined)
    
    @scala.inline
    def setPoll(value: Poll): Self = StObject.set(x, "poll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPollUndefined: Self = StObject.set(x, "poll", js.undefined)
    
    @scala.inline
    def setReply_markup(value: InlineKeyboardMarkup): Self = StObject.set(x, "reply_markup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_markupUndefined: Self = StObject.set(x, "reply_markup", js.undefined)
    
    @scala.inline
    def setReply_to_message(value: Message): Self = StObject.set(x, "reply_to_message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply_to_messageUndefined: Self = StObject.set(x, "reply_to_message", js.undefined)
    
    @scala.inline
    def setSticker(value: Sticker): Self = StObject.set(x, "sticker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickerUndefined: Self = StObject.set(x, "sticker", js.undefined)
    
    @scala.inline
    def setSuccessful_payment(value: SuccessfulPayment): Self = StObject.set(x, "successful_payment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessful_paymentUndefined: Self = StObject.set(x, "successful_payment", js.undefined)
    
    @scala.inline
    def setSupergroup_chat_created(value: Boolean): Self = StObject.set(x, "supergroup_chat_created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupergroup_chat_createdUndefined: Self = StObject.set(x, "supergroup_chat_created", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setVenue(value: Venue): Self = StObject.set(x, "venue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVenueUndefined: Self = StObject.set(x, "venue", js.undefined)
    
    @scala.inline
    def setVideo(value: Video): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
    
    @scala.inline
    def setVideo_note(value: VideoNote): Self = StObject.set(x, "video_note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideo_noteUndefined: Self = StObject.set(x, "video_note", js.undefined)
    
    @scala.inline
    def setVoice(value: Voice): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
