package typings
package nodeDashTelegramDashBotDashApiLib.nodeDashTelegramDashBotDashApiMod.TelegramBotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var audio: js.UndefOr[Audio] = js.undefined
  var author_signature: js.UndefOr[java.lang.String] = js.undefined
  var caption: js.UndefOr[java.lang.String] = js.undefined
  var channel_chat_created: js.UndefOr[scala.Boolean] = js.undefined
  var chat: Chat
  var contact: js.UndefOr[Contact] = js.undefined
  var date: scala.Double
  var delete_chat_photo: js.UndefOr[scala.Boolean] = js.undefined
  var document: js.UndefOr[Document] = js.undefined
  var edit_date: js.UndefOr[scala.Double] = js.undefined
  var entities: js.UndefOr[js.Array[MessageEntity]] = js.undefined
  var forward_date: js.UndefOr[scala.Double] = js.undefined
  var forward_from: js.UndefOr[User] = js.undefined
  var forward_from_chat: js.UndefOr[Chat] = js.undefined
  var forward_from_message_id: js.UndefOr[scala.Double] = js.undefined
  var forward_signature: js.UndefOr[java.lang.String] = js.undefined
  var from: js.UndefOr[User] = js.undefined
  var game: js.UndefOr[Game] = js.undefined
  var group_chat_created: js.UndefOr[scala.Boolean] = js.undefined
  var invoice: js.UndefOr[Invoice] = js.undefined
  var left_chat_member: js.UndefOr[User] = js.undefined
  var location: js.UndefOr[Location] = js.undefined
  var message_id: scala.Double
  var migrate_from_chat_id: js.UndefOr[scala.Double] = js.undefined
  var migrate_to_chat_id: js.UndefOr[scala.Double] = js.undefined
  var new_chat_members: js.UndefOr[js.Array[User]] = js.undefined
  var new_chat_photo: js.UndefOr[js.Array[PhotoSize]] = js.undefined
  var new_chat_title: js.UndefOr[java.lang.String] = js.undefined
  var photo: js.UndefOr[js.Array[PhotoSize]] = js.undefined
  var pinned_message: js.UndefOr[Message] = js.undefined
  var reply_to_message: js.UndefOr[Message] = js.undefined
  var sticker: js.UndefOr[Sticker] = js.undefined
  var successful_payment: js.UndefOr[SuccessfulPayment] = js.undefined
  var supergroup_chat_created: js.UndefOr[scala.Boolean] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
  var venue: js.UndefOr[Venue] = js.undefined
  var video: js.UndefOr[Video] = js.undefined
  var video_note: js.UndefOr[VideoNote] = js.undefined
  var voice: js.UndefOr[Voice] = js.undefined
}

object Message {
  @scala.inline
  def apply(
    chat: Chat,
    date: scala.Double,
    message_id: scala.Double,
    audio: Audio = null,
    author_signature: java.lang.String = null,
    caption: java.lang.String = null,
    channel_chat_created: js.UndefOr[scala.Boolean] = js.undefined,
    contact: Contact = null,
    delete_chat_photo: js.UndefOr[scala.Boolean] = js.undefined,
    document: Document = null,
    edit_date: scala.Int | scala.Double = null,
    entities: js.Array[MessageEntity] = null,
    forward_date: scala.Int | scala.Double = null,
    forward_from: User = null,
    forward_from_chat: Chat = null,
    forward_from_message_id: scala.Int | scala.Double = null,
    forward_signature: java.lang.String = null,
    from: User = null,
    game: Game = null,
    group_chat_created: js.UndefOr[scala.Boolean] = js.undefined,
    invoice: Invoice = null,
    left_chat_member: User = null,
    location: Location = null,
    migrate_from_chat_id: scala.Int | scala.Double = null,
    migrate_to_chat_id: scala.Int | scala.Double = null,
    new_chat_members: js.Array[User] = null,
    new_chat_photo: js.Array[PhotoSize] = null,
    new_chat_title: java.lang.String = null,
    photo: js.Array[PhotoSize] = null,
    pinned_message: Message = null,
    reply_to_message: Message = null,
    sticker: Sticker = null,
    successful_payment: SuccessfulPayment = null,
    supergroup_chat_created: js.UndefOr[scala.Boolean] = js.undefined,
    text: java.lang.String = null,
    venue: Venue = null,
    video: Video = null,
    video_note: VideoNote = null,
    voice: Voice = null
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("chat")(chat)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("message_id")(message_id)
    if (audio != null) __obj.updateDynamic("audio")(audio)
    if (author_signature != null) __obj.updateDynamic("author_signature")(author_signature)
    if (caption != null) __obj.updateDynamic("caption")(caption)
    if (!js.isUndefined(channel_chat_created)) __obj.updateDynamic("channel_chat_created")(channel_chat_created)
    if (contact != null) __obj.updateDynamic("contact")(contact)
    if (!js.isUndefined(delete_chat_photo)) __obj.updateDynamic("delete_chat_photo")(delete_chat_photo)
    if (document != null) __obj.updateDynamic("document")(document)
    if (edit_date != null) __obj.updateDynamic("edit_date")(edit_date.asInstanceOf[js.Any])
    if (entities != null) __obj.updateDynamic("entities")(entities)
    if (forward_date != null) __obj.updateDynamic("forward_date")(forward_date.asInstanceOf[js.Any])
    if (forward_from != null) __obj.updateDynamic("forward_from")(forward_from)
    if (forward_from_chat != null) __obj.updateDynamic("forward_from_chat")(forward_from_chat)
    if (forward_from_message_id != null) __obj.updateDynamic("forward_from_message_id")(forward_from_message_id.asInstanceOf[js.Any])
    if (forward_signature != null) __obj.updateDynamic("forward_signature")(forward_signature)
    if (from != null) __obj.updateDynamic("from")(from)
    if (game != null) __obj.updateDynamic("game")(game)
    if (!js.isUndefined(group_chat_created)) __obj.updateDynamic("group_chat_created")(group_chat_created)
    if (invoice != null) __obj.updateDynamic("invoice")(invoice)
    if (left_chat_member != null) __obj.updateDynamic("left_chat_member")(left_chat_member)
    if (location != null) __obj.updateDynamic("location")(location)
    if (migrate_from_chat_id != null) __obj.updateDynamic("migrate_from_chat_id")(migrate_from_chat_id.asInstanceOf[js.Any])
    if (migrate_to_chat_id != null) __obj.updateDynamic("migrate_to_chat_id")(migrate_to_chat_id.asInstanceOf[js.Any])
    if (new_chat_members != null) __obj.updateDynamic("new_chat_members")(new_chat_members)
    if (new_chat_photo != null) __obj.updateDynamic("new_chat_photo")(new_chat_photo)
    if (new_chat_title != null) __obj.updateDynamic("new_chat_title")(new_chat_title)
    if (photo != null) __obj.updateDynamic("photo")(photo)
    if (pinned_message != null) __obj.updateDynamic("pinned_message")(pinned_message)
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

