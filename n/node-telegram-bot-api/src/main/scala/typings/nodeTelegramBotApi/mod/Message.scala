package typings.nodeTelegramBotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
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
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setChat(value: Chat): Self = this.set("chat", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Double): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage_id(value: Double): Self = this.set("message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def setAudio(value: Audio): Self = this.set("audio", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    @scala.inline
    def setAuthor_signature(value: String): Self = this.set("author_signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthor_signature: Self = this.set("author_signature", js.undefined)
    @scala.inline
    def setCaption(value: String): Self = this.set("caption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption: Self = this.set("caption", js.undefined)
    @scala.inline
    def setCaption_entitiesVarargs(value: MessageEntity*): Self = this.set("caption_entities", js.Array(value :_*))
    @scala.inline
    def setCaption_entities(value: js.Array[MessageEntity]): Self = this.set("caption_entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaption_entities: Self = this.set("caption_entities", js.undefined)
    @scala.inline
    def setChannel_chat_created(value: Boolean): Self = this.set("channel_chat_created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChannel_chat_created: Self = this.set("channel_chat_created", js.undefined)
    @scala.inline
    def setConnected_website(value: String): Self = this.set("connected_website", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnected_website: Self = this.set("connected_website", js.undefined)
    @scala.inline
    def setContact(value: Contact): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContact: Self = this.set("contact", js.undefined)
    @scala.inline
    def setDelete_chat_photo(value: Boolean): Self = this.set("delete_chat_photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelete_chat_photo: Self = this.set("delete_chat_photo", js.undefined)
    @scala.inline
    def setDocument(value: Document): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setEdit_date(value: Double): Self = this.set("edit_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdit_date: Self = this.set("edit_date", js.undefined)
    @scala.inline
    def setEntitiesVarargs(value: MessageEntity*): Self = this.set("entities", js.Array(value :_*))
    @scala.inline
    def setEntities(value: js.Array[MessageEntity]): Self = this.set("entities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntities: Self = this.set("entities", js.undefined)
    @scala.inline
    def setForward_date(value: Double): Self = this.set("forward_date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward_date: Self = this.set("forward_date", js.undefined)
    @scala.inline
    def setForward_from(value: User): Self = this.set("forward_from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward_from: Self = this.set("forward_from", js.undefined)
    @scala.inline
    def setForward_from_chat(value: Chat): Self = this.set("forward_from_chat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward_from_chat: Self = this.set("forward_from_chat", js.undefined)
    @scala.inline
    def setForward_from_message_id(value: Double): Self = this.set("forward_from_message_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward_from_message_id: Self = this.set("forward_from_message_id", js.undefined)
    @scala.inline
    def setForward_sender_name(value: String): Self = this.set("forward_sender_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward_sender_name: Self = this.set("forward_sender_name", js.undefined)
    @scala.inline
    def setForward_signature(value: String): Self = this.set("forward_signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForward_signature: Self = this.set("forward_signature", js.undefined)
    @scala.inline
    def setFrom(value: User): Self = this.set("from", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrom: Self = this.set("from", js.undefined)
    @scala.inline
    def setGame(value: Game): Self = this.set("game", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGame: Self = this.set("game", js.undefined)
    @scala.inline
    def setGroup_chat_created(value: Boolean): Self = this.set("group_chat_created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup_chat_created: Self = this.set("group_chat_created", js.undefined)
    @scala.inline
    def setInvoice(value: Invoice): Self = this.set("invoice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInvoice: Self = this.set("invoice", js.undefined)
    @scala.inline
    def setLeft_chat_member(value: User): Self = this.set("left_chat_member", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft_chat_member: Self = this.set("left_chat_member", js.undefined)
    @scala.inline
    def setLocation(value: Location): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setMedia_group_id(value: String): Self = this.set("media_group_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMedia_group_id: Self = this.set("media_group_id", js.undefined)
    @scala.inline
    def setMigrate_from_chat_id(value: Double): Self = this.set("migrate_from_chat_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMigrate_from_chat_id: Self = this.set("migrate_from_chat_id", js.undefined)
    @scala.inline
    def setMigrate_to_chat_id(value: Double): Self = this.set("migrate_to_chat_id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMigrate_to_chat_id: Self = this.set("migrate_to_chat_id", js.undefined)
    @scala.inline
    def setNew_chat_membersVarargs(value: User*): Self = this.set("new_chat_members", js.Array(value :_*))
    @scala.inline
    def setNew_chat_members(value: js.Array[User]): Self = this.set("new_chat_members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_chat_members: Self = this.set("new_chat_members", js.undefined)
    @scala.inline
    def setNew_chat_photoVarargs(value: PhotoSize*): Self = this.set("new_chat_photo", js.Array(value :_*))
    @scala.inline
    def setNew_chat_photo(value: js.Array[PhotoSize]): Self = this.set("new_chat_photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_chat_photo: Self = this.set("new_chat_photo", js.undefined)
    @scala.inline
    def setNew_chat_title(value: String): Self = this.set("new_chat_title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNew_chat_title: Self = this.set("new_chat_title", js.undefined)
    @scala.inline
    def setPassport_data(value: PassportData): Self = this.set("passport_data", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassport_data: Self = this.set("passport_data", js.undefined)
    @scala.inline
    def setPhotoVarargs(value: PhotoSize*): Self = this.set("photo", js.Array(value :_*))
    @scala.inline
    def setPhoto(value: js.Array[PhotoSize]): Self = this.set("photo", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhoto: Self = this.set("photo", js.undefined)
    @scala.inline
    def setPinned_message(value: Message): Self = this.set("pinned_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePinned_message: Self = this.set("pinned_message", js.undefined)
    @scala.inline
    def setPoll(value: Poll): Self = this.set("poll", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoll: Self = this.set("poll", js.undefined)
    @scala.inline
    def setReply_markup(value: InlineKeyboardMarkup): Self = this.set("reply_markup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply_markup: Self = this.set("reply_markup", js.undefined)
    @scala.inline
    def setReply_to_message(value: Message): Self = this.set("reply_to_message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReply_to_message: Self = this.set("reply_to_message", js.undefined)
    @scala.inline
    def setSticker(value: Sticker): Self = this.set("sticker", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSticker: Self = this.set("sticker", js.undefined)
    @scala.inline
    def setSuccessful_payment(value: SuccessfulPayment): Self = this.set("successful_payment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessful_payment: Self = this.set("successful_payment", js.undefined)
    @scala.inline
    def setSupergroup_chat_created(value: Boolean): Self = this.set("supergroup_chat_created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupergroup_chat_created: Self = this.set("supergroup_chat_created", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    @scala.inline
    def setVenue(value: Venue): Self = this.set("venue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVenue: Self = this.set("venue", js.undefined)
    @scala.inline
    def setVideo(value: Video): Self = this.set("video", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
    @scala.inline
    def setVideo_note(value: VideoNote): Self = this.set("video_note", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideo_note: Self = this.set("video_note", js.undefined)
    @scala.inline
    def setVoice(value: Voice): Self = this.set("voice", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVoice: Self = this.set("voice", js.undefined)
  }
  
}

