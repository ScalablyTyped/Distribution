package typings.nodeDashTelegramDashBotDashApi.nodeDashTelegramDashBotDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var animation: js.UndefOr[Animation] = js.undefined
  var audio: js.UndefOr[Audio] = js.undefined
  var author_signature: js.UndefOr[String] = js.undefined
  var caption: js.UndefOr[String] = js.undefined
  var caption_entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  var channel_chat_created: js.UndefOr[Boolean] = js.undefined
  var chat: Chat
  var connected_website: js.UndefOr[String] = js.undefined
  var contact: js.UndefOr[Contact] = js.undefined
  var date: Double
  var delete_chat_photo: js.UndefOr[Boolean] = js.undefined
  var document: js.UndefOr[Document] = js.undefined
  var edit_date: js.UndefOr[Double] = js.undefined
  var entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  var forward_date: js.UndefOr[Double] = js.undefined
  var forward_from: js.UndefOr[User] = js.undefined
  var forward_from_chat: js.UndefOr[Chat] = js.undefined
  var forward_from_message_id: js.UndefOr[Double] = js.undefined
  var forward_sender_name: js.UndefOr[String] = js.undefined
  var forward_signature: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[User] = js.undefined
  var game: js.UndefOr[Game] = js.undefined
  var group_chat_created: js.UndefOr[Boolean] = js.undefined
  var invoice: js.UndefOr[Invoice] = js.undefined
  var left_chat_member: js.UndefOr[User] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var media_group_id: js.UndefOr[String] = js.undefined
  var message_id: Double
  var migrate_from_chat_id: js.UndefOr[Double] = js.undefined
  var migrate_to_chat_id: js.UndefOr[Double] = js.undefined
  var new_chat_members: js.UndefOr[js.Array[User]] = js.undefined
  var new_chat_photo: js.UndefOr[js.Array[PhotoSize]] = js.undefined
  var new_chat_title: js.UndefOr[String] = js.undefined
  var photo: js.UndefOr[js.Array[PhotoSize]] = js.undefined
  var pinned_message: js.UndefOr[Message] = js.undefined
  var poll: js.UndefOr[Poll] = js.undefined
  var reply_markup: js.UndefOr[InlineKeyboardMarkup] = js.undefined
  var reply_to_message: js.UndefOr[Message] = js.undefined
  var sticker: js.UndefOr[Sticker] = js.undefined
  var successful_payment: js.UndefOr[SuccessfulPayment] = js.undefined
  var supergroup_chat_created: js.UndefOr[Boolean] = js.undefined
  var text: js.UndefOr[String] = js.undefined
  var venue: js.UndefOr[Venue] = js.undefined
  var video: js.UndefOr[Video] = js.undefined
  var video_note: js.UndefOr[VideoNote] = js.undefined
  var voice: js.UndefOr[Voice] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    chat: Chat,
    date: Double,
    message_id: Double,
    animation: Animation = null,
    audio: Audio = null,
    author_signature: String = null,
    caption: String = null,
    caption_entities: js.Array[MessageEntity] = null,
    channel_chat_created: js.UndefOr[Boolean] = js.undefined,
    connected_website: String = null,
    contact: Contact = null,
    delete_chat_photo: js.UndefOr[Boolean] = js.undefined,
    document: Document = null,
    edit_date: Int | Double = null,
    entities: js.Array[MessageEntity] = null,
    forward_date: Int | Double = null,
    forward_from: User = null,
    forward_from_chat: Chat = null,
    forward_from_message_id: Int | Double = null,
    forward_sender_name: String = null,
    forward_signature: String = null,
    from: User = null,
    game: Game = null,
    group_chat_created: js.UndefOr[Boolean] = js.undefined,
    invoice: Invoice = null,
    left_chat_member: User = null,
    location: Location = null,
    media_group_id: String = null,
    migrate_from_chat_id: Int | Double = null,
    migrate_to_chat_id: Int | Double = null,
    new_chat_members: js.Array[User] = null,
    new_chat_photo: js.Array[PhotoSize] = null,
    new_chat_title: String = null,
    photo: js.Array[PhotoSize] = null,
    pinned_message: Message = null,
    poll: Poll = null,
    reply_markup: InlineKeyboardMarkup = null,
    reply_to_message: Message = null,
    sticker: Sticker = null,
    successful_payment: SuccessfulPayment = null,
    supergroup_chat_created: js.UndefOr[Boolean] = js.undefined,
    text: String = null,
    venue: Venue = null,
    video: Video = null,
    video_note: VideoNote = null,
    voice: Voice = null
  ): Message = {
    val __obj = js.Dynamic.literal(chat = chat, date = date, message_id = message_id)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (audio != null) __obj.updateDynamic("audio")(audio)
    if (author_signature != null) __obj.updateDynamic("author_signature")(author_signature)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (caption_entities != null) __obj.updateDynamic("caption_entities")(caption_entities)
    if (!js.isUndefined(channel_chat_created)) __obj.updateDynamic("channel_chat_created")(channel_chat_created)
    if (connected_website != null) __obj.updateDynamic("connected_website")(connected_website)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (!js.isUndefined(delete_chat_photo)) __obj.updateDynamic("delete_chat_photo")(delete_chat_photo)
    if (document != null) __obj.updateDynamic("document")(document)
    if (edit_date != null) __obj.updateDynamic("edit_date")(edit_date.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (forward_date != null) __obj.updateDynamic("forward_date")(forward_date.asInstanceOf[js.Any])
    if (forward_from != null) __obj.updateDynamic("forward_from")(forward_from)
    if (forward_from_chat != null) __obj.updateDynamic("forward_from_chat")(forward_from_chat)
    if (forward_from_message_id != null) __obj.updateDynamic("forward_from_message_id")(forward_from_message_id.asInstanceOf[js.Any])
    if (forward_sender_name != null) __obj.updateDynamic("forward_sender_name")(forward_sender_name)
    if (forward_signature != null) __obj.updateDynamic("forward_signature")(forward_signature)
    if (from != null) __obj.updateDynamic("from")(from)
    if (game != null) __obj.updateDynamic("game")(game)
    if (!js.isUndefined(group_chat_created)) __obj.updateDynamic("group_chat_created")(group_chat_created)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice)
    if (left_chat_member != null) __obj.updateDynamic("left_chat_member")(left_chat_member)
    if (location != null) __obj.updateDynamic("location")(location)
    if (media_group_id != null) __obj.updateDynamic("media_group_id")(media_group_id)
    if (migrate_from_chat_id != null) __obj.updateDynamic("migrate_from_chat_id")(migrate_from_chat_id.asInstanceOf[js.Any])
    if (migrate_to_chat_id != null) __obj.updateDynamic("migrate_to_chat_id")(migrate_to_chat_id.asInstanceOf[js.Any])
    if (new_chat_members != null) __obj.updateDynamic("new_chat_members")(new_chat_members)
    if (new_chat_photo != null) __obj.updateDynamic("new_chat_photo")(new_chat_photo)
    if (new_chat_title != null) __obj.updateDynamic("new_chat_title")(new_chat_title)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (pinned_message != null) __obj.updateDynamic("pinned_message")(pinned_message)
    if (poll != null) __obj.updateDynamic("poll")(poll)
    if (reply_markup != null) __obj.updateDynamic("reply_markup")(reply_markup)
    if (reply_to_message != null) __obj.updateDynamic("reply_to_message")(reply_to_message)
    if (sticker != null) __obj.updateDynamic("sticker")(sticker)
    if (successful_payment != null) __obj.updateDynamic("successful_payment")(successful_payment)
    if (!js.isUndefined(supergroup_chat_created)) __obj.updateDynamic("supergroup_chat_created")(supergroup_chat_created)
    if (text != null) __obj.updateDynamic("text")(text)
    if (venue != null) __obj.updateDynamic("venue")(venue)
    if (video != null) __obj.updateDynamic("video")(video)
    if (video_note != null) __obj.updateDynamic("video_note")(video_note)
    if (voice != null) __obj.updateDynamic("voice")(voice)
    __obj.asInstanceOf[Message]
  }
}

