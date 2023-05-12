package typings.nodeTelegramBotApi.mod

import typings.eventemitter3.mod.EventEmitter
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.node.streamMod.Stream
import typings.nodeTelegramBotApi.anon.Chatid
import typings.nodeTelegramBotApi.anon.Forchannels
import typings.nodeTelegramBotApi.anon.Languagecode
import typings.nodeTelegramBotApi.anon.PartialAnswerCallbackQuer
import typings.nodeTelegramBotApi.anon.`0`
import typings.nodeTelegramBotApi.anon.`1`
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.callback_query
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.channel_post
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.chat_join_request
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.chat_member
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.chosen_inline_result
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_channel_post
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_channel_post_caption
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_channel_post_text
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_message
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_message_caption
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.edited_message_text
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.error
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.inline_query
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.message
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.my_chat_member
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.png_sticker
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.poll_answer
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.polling_error
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.pre_checkout_query
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.shipping_query
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.tgs_sticker
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.webhook_error
import typings.nodeTelegramBotApi.nodeTelegramBotApiStrings.webm_sticker
import typings.std.RegExpExecArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TelegramBot extends EventEmitter[
      MessageType | message | callback_query | inline_query | poll_answer | chat_member | my_chat_member | chosen_inline_result | channel_post | edited_message | edited_message_text | edited_message_caption | edited_channel_post | edited_channel_post_text | edited_channel_post_caption | shipping_query | pre_checkout_query | polling_error | webhook_error | error, 
      Any
    ] {
  
  def addListener(
    event: channel_post | chat_member | edited_channel_post | edited_channel_post_caption | edited_channel_post_text | edited_message | edited_message_caption | edited_message_text | error | my_chat_member | polling_error | webhook_error,
    listener: js.Function1[
      (/* member */ ChatMemberUpdated) | (/* error */ js.Error) | (/* message */ Message), 
      Unit
    ]
  ): this.type = js.native
  def addListener(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_chatjoinrequest(event: chat_join_request, listener: js.Function1[/* query */ ChatJoinRequest, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_pollanswer(event: poll_answer, listener: js.Function1[/* answer */ PollAnswer, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("addListener")
  def addListener_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: String,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: String,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: Unit,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: String,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: AddStickerToSetOptions
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: String,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: AddStickerToSetOptions,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: Buffer,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: Buffer,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: Unit,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: Buffer,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: AddStickerToSetOptions
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: Buffer,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: AddStickerToSetOptions,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: Stream,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: Stream,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: Unit,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: Stream,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: AddStickerToSetOptions
  ): js.Promise[Boolean] = js.native
  def addStickerToSet(
    userId: Double,
    name: String,
    sticker: Stream,
    emojis: String,
    stickerType: png_sticker | tgs_sticker | webm_sticker,
    options: AddStickerToSetOptions,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  
  /**
    * @deprecated since version 0.30.0
    */
  def answerCallbackQuery(): js.Promise[Boolean] = js.native
  def answerCallbackQuery(callbackQueryId: String): js.Promise[Boolean] = js.native
  def answerCallbackQuery(callbackQueryId: String, options: PartialAnswerCallbackQuer): js.Promise[Boolean] = js.native
  def answerCallbackQuery(options: AnswerCallbackQueryOptions): js.Promise[Boolean] = js.native
  
  def answerInlineQuery(inlineQueryId: String, results: js.Array[InlineQueryResult]): js.Promise[Boolean] = js.native
  def answerInlineQuery(inlineQueryId: String, results: js.Array[InlineQueryResult], options: AnswerInlineQueryOptions): js.Promise[Boolean] = js.native
  
  def answerPreCheckoutQuery(preCheckoutQueryId: String, ok: Boolean): js.Promise[Boolean] = js.native
  def answerPreCheckoutQuery(preCheckoutQueryId: String, ok: Boolean, options: AnswerPreCheckoutQueryOptions): js.Promise[Boolean] = js.native
  
  def answerShippingQuery(shippingQueryId: String, ok: Boolean): js.Promise[Boolean] = js.native
  def answerShippingQuery(shippingQueryId: String, ok: Boolean, options: AnswerShippingQueryOptions): js.Promise[Boolean] = js.native
  
  def answerWebAppQuery(web_app_query_id: String, result: InlineQueryResult): js.Promise[SentWebAppMessage] = js.native
  
  def approveChatJoinRequest(chatId: ChatId, userId: Double): js.Promise[Boolean] = js.native
  def approveChatJoinRequest(chatId: ChatId, userId: Double, form: js.Object): js.Promise[Boolean] = js.native
  
  def banChatMember(chatId: ChatId, userId: Double): js.Promise[Boolean] = js.native
  def banChatMember(chatId: ChatId, userId: Double, untilDate: Double): js.Promise[Boolean] = js.native
  def banChatMember(chatId: ChatId, userId: Double, untilDate: Double, revokeMessages: Boolean): js.Promise[Boolean] = js.native
  def banChatMember(chatId: ChatId, userId: Double, untilDate: Unit, revokeMessages: Boolean): js.Promise[Boolean] = js.native
  
  def banChatSenderChat(chatId: ChatId, senderChatId: ChatId): js.Promise[Boolean] = js.native
  
  def clearReplyListeners(): Unit = js.native
  
  def clearTextListeners(): Unit = js.native
  
  def close(): js.Promise[Boolean] = js.native
  
  def closeForumTopic(chatId: ChatId, messageThreadId: Double): js.Promise[Boolean] = js.native
  
  def closeGeneralForumTopic(chatId: ChatId): js.Promise[Boolean] = js.native
  
  def closeWebHook(): js.Promise[Any] = js.native
  
  def copyMessage(chatId: ChatId, fromChatId: ChatId, messageId: Double): js.Promise[MessageId] = js.native
  def copyMessage(chatId: ChatId, fromChatId: ChatId, messageId: Double, options: CopyMessageOptions): js.Promise[MessageId] = js.native
  
  def createChatInviteLink(chatId: ChatId): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: String): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: String, expire_date: Double): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: String, expire_date: Double, member_limit: Double): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(
    chatId: ChatId,
    name: String,
    expire_date: Double,
    member_limit: Double,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(
    chatId: ChatId,
    name: String,
    expire_date: Double,
    member_limit: Unit,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: String, expire_date: Unit, member_limit: Double): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(
    chatId: ChatId,
    name: String,
    expire_date: Unit,
    member_limit: Double,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: String, expire_date: Unit, member_limit: Unit, creates_join_request: Boolean): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: Unit, expire_date: Double): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: Unit, expire_date: Double, member_limit: Double): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(
    chatId: ChatId,
    name: Unit,
    expire_date: Double,
    member_limit: Double,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: Unit, expire_date: Double, member_limit: Unit, creates_join_request: Boolean): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: Unit, expire_date: Unit, member_limit: Double): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: Unit, expire_date: Unit, member_limit: Double, creates_join_request: Boolean): js.Promise[ChatInviteLink] = js.native
  def createChatInviteLink(chatId: ChatId, name: Unit, expire_date: Unit, member_limit: Unit, creates_join_request: Boolean): js.Promise[ChatInviteLink] = js.native
  
  def createForumTopic(chatId: ChatId, name: String): js.Promise[Boolean] = js.native
  def createForumTopic(chatId: ChatId, name: String, options: CreateForumTopicOptions): js.Promise[Boolean] = js.native
  
  def createNewStickerSet(userId: Double, name: String, title: String, pngSticker: String, emojis: String): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: String,
    emojis: String,
    options: Unit,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: String,
    emojis: String,
    options: CreateStickerSetOptions
  ): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: String,
    emojis: String,
    options: CreateStickerSetOptions,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def createNewStickerSet(userId: Double, name: String, title: String, pngSticker: Buffer, emojis: String): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: Buffer,
    emojis: String,
    options: Unit,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: Buffer,
    emojis: String,
    options: CreateStickerSetOptions
  ): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: Buffer,
    emojis: String,
    options: CreateStickerSetOptions,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def createNewStickerSet(userId: Double, name: String, title: String, pngSticker: Stream, emojis: String): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: Stream,
    emojis: String,
    options: Unit,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: Stream,
    emojis: String,
    options: CreateStickerSetOptions
  ): js.Promise[Boolean] = js.native
  def createNewStickerSet(
    userId: Double,
    name: String,
    title: String,
    pngSticker: Stream,
    emojis: String,
    options: CreateStickerSetOptions,
    fileOptions: FileOptions
  ): js.Promise[Boolean] = js.native
  
  def declineChatJoinRequest(chatId: ChatId, userId: Double): js.Promise[Boolean] = js.native
  def declineChatJoinRequest(chatId: ChatId, userId: Double, form: js.Object): js.Promise[Boolean] = js.native
  
  def deleteChatPhoto(chatId: ChatId): js.Promise[Boolean] = js.native
  
  def deleteChatStickerSet(chatId: ChatId): js.Promise[Boolean] = js.native
  
  def deleteForumTopic(chatId: ChatId, messageThreadId: Double): js.Promise[Boolean] = js.native
  
  def deleteMessage(chatId: ChatId, messageId: Double): js.Promise[Boolean] = js.native
  def deleteMessage(chatId: ChatId, messageId: Double, options: Any): js.Promise[Boolean] = js.native
  
  def deleteStickerFromSet(sticker: String): js.Promise[Boolean] = js.native
  def deleteStickerFromSet(sticker: String, options: js.Object): js.Promise[Boolean] = js.native
  
  def deleteWebHook(): js.Promise[Boolean] = js.native
  
  def downloadFile(fileId: String, downloadDir: String): js.Promise[String] = js.native
  
  def editChatInviteLink(chatId: ChatId, inviteLink: String): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(chatId: ChatId, inviteLink: String, name: String): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(chatId: ChatId, inviteLink: String, name: String, expire_date: Double): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(chatId: ChatId, inviteLink: String, name: String, expire_date: Double, member_limit: Double): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(
    chatId: ChatId,
    inviteLink: String,
    name: String,
    expire_date: Double,
    member_limit: Double,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(
    chatId: ChatId,
    inviteLink: String,
    name: String,
    expire_date: Double,
    member_limit: Unit,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(chatId: ChatId, inviteLink: String, name: String, expire_date: Unit, member_limit: Double): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(
    chatId: ChatId,
    inviteLink: String,
    name: String,
    expire_date: Unit,
    member_limit: Double,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(
    chatId: ChatId,
    inviteLink: String,
    name: String,
    expire_date: Unit,
    member_limit: Unit,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(chatId: ChatId, inviteLink: String, name: Unit, expire_date: Double): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(chatId: ChatId, inviteLink: String, name: Unit, expire_date: Double, member_limit: Double): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(
    chatId: ChatId,
    inviteLink: String,
    name: Unit,
    expire_date: Double,
    member_limit: Double,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(
    chatId: ChatId,
    inviteLink: String,
    name: Unit,
    expire_date: Double,
    member_limit: Unit,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(chatId: ChatId, inviteLink: String, name: Unit, expire_date: Unit, member_limit: Double): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(
    chatId: ChatId,
    inviteLink: String,
    name: Unit,
    expire_date: Unit,
    member_limit: Double,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  def editChatInviteLink(
    chatId: ChatId,
    inviteLink: String,
    name: Unit,
    expire_date: Unit,
    member_limit: Unit,
    creates_join_request: Boolean
  ): js.Promise[ChatInviteLink] = js.native
  
  def editForumTopic(chatId: ChatId, messageThreadId: Double): js.Promise[Boolean] = js.native
  def editForumTopic(chatId: ChatId, messageThreadId: Double, options: EditForumTopicOptions): js.Promise[Boolean] = js.native
  
  def editGeneralForumTopic(chatId: ChatId, name: String): js.Promise[Boolean] = js.native
  
  def editMessageCaption(caption: String): js.Promise[Message | Boolean] = js.native
  def editMessageCaption(caption: String, options: EditMessageCaptionOptions): js.Promise[Message | Boolean] = js.native
  
  def editMessageLiveLocation(latitude: Double, longitude: Double): js.Promise[Message | Boolean] = js.native
  def editMessageLiveLocation(latitude: Double, longitude: Double, options: EditMessageLiveLocationOptions): js.Promise[Message | Boolean] = js.native
  
  def editMessageMedia(media: InputMedia, options: EditMessageMediaOptions): js.Promise[Message | Boolean] = js.native
  
  def editMessageReplyMarkup(replyMarkup: InlineKeyboardMarkup): js.Promise[Message | Boolean] = js.native
  def editMessageReplyMarkup(replyMarkup: InlineKeyboardMarkup, options: EditMessageReplyMarkupOptions): js.Promise[Message | Boolean] = js.native
  
  def editMessageText(text: String): js.Promise[Message | Boolean] = js.native
  def editMessageText(text: String, options: EditMessageTextOptions): js.Promise[Message | Boolean] = js.native
  
  def exportChatInviteLink(chatId: ChatId): js.Promise[String] = js.native
  
  def forwardMessage(chatId: ChatId, fromChatId: ChatId, messageId: Double): js.Promise[Message] = js.native
  def forwardMessage(chatId: ChatId, fromChatId: ChatId, messageId: Double, options: ForwardMessageOptions): js.Promise[Message] = js.native
  
  def getChat(chatId: ChatId): js.Promise[Chat] = js.native
  
  def getChatAdministrators(chatId: ChatId): js.Promise[js.Array[ChatMember]] = js.native
  
  def getChatMember(chatId: ChatId, userId: Double): js.Promise[ChatMember] = js.native
  
  def getChatMemberCount(chatId: ChatId): js.Promise[Double] = js.native
  
  def getChatMenuButton(form: `0`): js.Promise[MenuButton] = js.native
  
  def getCustomEmojiStickers(customEmojiIds: js.Array[String]): js.Promise[js.Array[Sticker]] = js.native
  def getCustomEmojiStickers(customEmojiIds: js.Array[String], options: js.Object): js.Promise[js.Array[Sticker]] = js.native
  
  def getFile(fileId: String): js.Promise[File] = js.native
  
  def getFileLink(fileId: String): js.Promise[String] = js.native
  
  def getFileStream(fileId: String): Readable = js.native
  
  def getGameHighScores(userId: Double): js.Promise[js.Array[GameHighScore]] = js.native
  def getGameHighScores(userId: Double, options: GetGameHighScoresOptions): js.Promise[js.Array[GameHighScore]] = js.native
  
  def getMe(): js.Promise[User] = js.native
  
  def getMyCommands(): js.Promise[js.Array[BotCommand]] = js.native
  def getMyCommands(scope: Unit, language_code: String): js.Promise[js.Array[BotCommand]] = js.native
  def getMyCommands(scope: BotCommandScope): js.Promise[js.Array[BotCommand]] = js.native
  def getMyCommands(scope: BotCommandScope, language_code: String): js.Promise[js.Array[BotCommand]] = js.native
  
  def getMyDefaultAdministratorRights(form: `1`): js.Promise[ChatAdministratorRights] = js.native
  
  def getStickerSet(name: String): js.Promise[StickerSet] = js.native
  def getStickerSet(name: String, options: js.Object): js.Promise[StickerSet] = js.native
  
  def getUpdates(): js.Promise[js.Array[Update]] = js.native
  def getUpdates(options: GetUpdatesOptions): js.Promise[js.Array[Update]] = js.native
  
  def getUserProfilePhotos(userId: Double): js.Promise[UserProfilePhotos] = js.native
  def getUserProfilePhotos(userId: Double, options: GetUserProfilePhotosOptions): js.Promise[UserProfilePhotos] = js.native
  
  def getWebHookInfo(): js.Promise[WebhookInfo] = js.native
  
  def hasOpenWebHook(): Boolean = js.native
  
  def hideGeneralForumTopic(chatId: ChatId): js.Promise[Boolean] = js.native
  
  def isPolling(): Boolean = js.native
  
  def leaveChat(chatId: ChatId): js.Promise[Boolean] = js.native
  
  def listenerCount(event: MessageType): Double = js.native
  
  def listeners(
    event: message | callback_query | inline_query | poll_answer | chat_member | my_chat_member | chosen_inline_result | channel_post | edited_message | edited_message_text | edited_message_caption | edited_channel_post | edited_channel_post_text | edited_channel_post_caption | shipping_query | pre_checkout_query | polling_error | webhook_error | error
  ): js.Array[js.Function2[/* data */ Any, /* metadata */ js.UndefOr[Metadata], Unit]] = js.native
  def listeners(event: MessageType): js.Array[js.Function2[/* data */ Any, /* metadata */ js.UndefOr[Metadata], Unit]] = js.native
  
  def logOut(): js.Promise[Boolean] = js.native
  
  def off(
    event: channel_post | chat_member | edited_channel_post | edited_channel_post_caption | edited_channel_post_text | edited_message | edited_message_caption | edited_message_text | error | my_chat_member | polling_error | webhook_error,
    listener: js.Function1[
      (/* member */ ChatMemberUpdated) | (/* error */ js.Error) | (/* message */ Message), 
      Unit
    ]
  ): this.type = js.native
  def off(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("off")
  def off_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("off")
  def off_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("off")
  def off_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("off")
  def off_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("off")
  def off_pollanswer(event: poll_answer, listener: js.Function1[/* answer */ PollAnswer, Unit]): this.type = js.native
  @JSName("off")
  def off_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("off")
  def off_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  
  def on(
    event: channel_post | chat_member | edited_channel_post | edited_channel_post_caption | edited_channel_post_text | edited_message | edited_message_caption | edited_message_text | error | my_chat_member | polling_error | webhook_error,
    listener: js.Function1[
      (/* member */ ChatMemberUpdated) | (/* error */ js.Error) | (/* message */ Message), 
      Unit
    ]
  ): this.type = js.native
  def on(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  
  def onReplyToMessage(chatId: ChatId, messageId: Double, callback: js.Function1[/* msg */ Message, Unit]): Double = js.native
  
  def onText(
    regexp: js.RegExp,
    callback: js.Function2[/* msg */ Message, /* match */ RegExpExecArray | Null, Unit]
  ): Unit = js.native
  
  @JSName("on")
  def on_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("on")
  def on_chatjoinrequest(event: chat_join_request, listener: js.Function1[/* query */ ChatJoinRequest, Unit]): this.type = js.native
  @JSName("on")
  def on_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("on")
  def on_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("on")
  def on_pollanswer(event: poll_answer, listener: js.Function1[/* answer */ PollAnswer, Unit]): this.type = js.native
  @JSName("on")
  def on_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("on")
  def on_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  
  def once(
    event: channel_post | chat_member | edited_channel_post | edited_channel_post_caption | edited_channel_post_text | edited_message | edited_message_caption | edited_message_text | error | my_chat_member | polling_error | webhook_error,
    listener: js.Function1[
      (/* member */ ChatMemberUpdated) | (/* error */ js.Error) | (/* message */ Message), 
      Unit
    ]
  ): this.type = js.native
  def once(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("once")
  def once_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("once")
  def once_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("once")
  def once_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("once")
  def once_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("once")
  def once_pollanswer(event: poll_answer, listener: js.Function1[/* answer */ PollAnswer, Unit]): this.type = js.native
  @JSName("once")
  def once_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("once")
  def once_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  
  def openWebHook(): js.Promise[Any] = js.native
  
  def pinChatMessage(chatId: ChatId, messageId: Double): js.Promise[Boolean] = js.native
  def pinChatMessage(chatId: ChatId, messageId: Double, options: PinChatMessageOptions): js.Promise[Boolean] = js.native
  
  def prependListener(
    event: channel_post | chat_member | edited_channel_post | edited_channel_post_caption | edited_channel_post_text | edited_message | edited_message_caption | edited_message_text | error | my_chat_member | polling_error | webhook_error,
    listener: js.Function1[
      (/* member */ ChatMemberUpdated) | (/* error */ js.Error) | (/* message */ Message), 
      Unit
    ]
  ): this.type = js.native
  def prependListener(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_pollanswer(event: poll_answer, listener: js.Function1[/* answer */ PollAnswer, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("prependListener")
  def prependListener_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  
  def prependOnceListener(
    event: channel_post | chat_member | edited_channel_post | edited_channel_post_caption | edited_channel_post_text | edited_message | edited_message_caption | edited_message_text | error | my_chat_member | polling_error | webhook_error,
    listener: js.Function1[
      (/* member */ ChatMemberUpdated) | (/* error */ js.Error) | (/* message */ Message), 
      Unit
    ]
  ): this.type = js.native
  def prependOnceListener(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_pollanswer(event: poll_answer, listener: js.Function1[/* answer */ PollAnswer, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("prependOnceListener")
  def prependOnceListener_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  
  def processUpdate(update: Update): Unit = js.native
  
  def promoteChatMember(chatId: ChatId, userId: Double): js.Promise[Boolean] = js.native
  def promoteChatMember(chatId: ChatId, userId: Double, options: PromoteChatMemberOptions): js.Promise[Boolean] = js.native
  
  def rawListeners(
    event: message | callback_query | inline_query | poll_answer | chat_member | my_chat_member | chosen_inline_result | channel_post | edited_message | edited_message_text | edited_message_caption | edited_channel_post | edited_channel_post_text | edited_channel_post_caption | shipping_query | pre_checkout_query | polling_error | webhook_error | error
  ): js.Array[js.Function2[/* data */ Any, /* metadata */ js.UndefOr[Metadata], Unit]] = js.native
  def rawListeners(event: MessageType): js.Array[js.Function2[/* data */ Any, /* metadata */ js.UndefOr[Metadata], Unit]] = js.native
  
  def removeAllListeners(event: MessageType): this.type = js.native
  
  def removeListener(
    event: channel_post | chat_member | edited_channel_post | edited_channel_post_caption | edited_channel_post_text | edited_message | edited_message_caption | edited_message_text | error | my_chat_member | polling_error | webhook_error,
    listener: js.Function1[
      (/* member */ ChatMemberUpdated) | (/* error */ js.Error) | (/* message */ Message), 
      Unit
    ]
  ): this.type = js.native
  def removeListener(event: MessageType, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_callbackquery(event: callback_query, listener: js.Function1[/* query */ CallbackQuery, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_choseninlineresult(event: chosen_inline_result, listener: js.Function1[/* result */ ChosenInlineResult, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_inlinequery(event: inline_query, listener: js.Function1[/* query */ InlineQuery, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_message(event: message, listener: js.Function2[/* message */ Message, /* metadata */ Metadata, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_pollanswer(event: poll_answer, listener: js.Function1[/* answer */ PollAnswer, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_precheckoutquery(event: pre_checkout_query, listener: js.Function1[/* query */ PreCheckoutQuery, Unit]): this.type = js.native
  @JSName("removeListener")
  def removeListener_shippingquery(event: shipping_query, listener: js.Function1[/* query */ ShippingQuery, Unit]): this.type = js.native
  
  def removeReplyListener(replyListenerId: Double): ReplyListener = js.native
  
  def removeTextListener(regexp: js.RegExp): TextListener | Null = js.native
  
  def reopenForumTopic(chatId: ChatId, messageThreadId: Double): js.Promise[Boolean] = js.native
  
  def reopenGeneralForumTopic(chatId: ChatId): js.Promise[Boolean] = js.native
  
  def restrictChatMember(chatId: ChatId, userId: Double): js.Promise[Boolean] = js.native
  def restrictChatMember(chatId: ChatId, userId: Double, options: RestrictChatMemberOptions): js.Promise[Boolean] = js.native
  
  def revokeChatInviteLink(chatId: ChatId, inviteLink: String): js.Promise[ChatInviteLink] = js.native
  
  def sendAnimation(chatId: ChatId, animation: String): js.Promise[Message] = js.native
  def sendAnimation(chatId: ChatId, animation: String, options: SendAnimationOptions): js.Promise[Message] = js.native
  def sendAnimation(chatId: ChatId, animation: Buffer): js.Promise[Message] = js.native
  def sendAnimation(chatId: ChatId, animation: Buffer, options: SendAnimationOptions): js.Promise[Message] = js.native
  def sendAnimation(chatId: ChatId, animation: Stream): js.Promise[Message] = js.native
  def sendAnimation(chatId: ChatId, animation: Stream, options: SendAnimationOptions): js.Promise[Message] = js.native
  
  def sendAudio(chatId: ChatId, audio: String): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: String, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: String, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: String, options: SendAudioOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: Buffer): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: Buffer, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: Buffer, options: SendAudioOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: Stream): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: Stream, options: SendAudioOptions): js.Promise[Message] = js.native
  def sendAudio(chatId: ChatId, audio: Stream, options: SendAudioOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  
  def sendChatAction(chatId: ChatId, action: ChatAction): js.Promise[Boolean] = js.native
  def sendChatAction(chatId: ChatId, action: ChatAction, options: SendChatActionOptions): js.Promise[Boolean] = js.native
  
  def sendContact(chatId: ChatId, phoneNumber: String, firstName: String): js.Promise[Message] = js.native
  def sendContact(chatId: ChatId, phoneNumber: String, firstName: String, options: SendContactOptions): js.Promise[Message] = js.native
  
  def sendDice(chatId: ChatId): js.Promise[Message] = js.native
  def sendDice(chatId: ChatId, options: SendDiceOptions): js.Promise[Message] = js.native
  
  def sendDocument(chatId: ChatId, doc: String): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: String, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: String, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: String, options: SendDocumentOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: Buffer): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: Buffer, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: Buffer, options: SendDocumentOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: Stream): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: Stream, options: SendDocumentOptions): js.Promise[Message] = js.native
  def sendDocument(chatId: ChatId, doc: Stream, options: SendDocumentOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  
  def sendGame(chatId: ChatId, gameShortName: String): js.Promise[Message] = js.native
  def sendGame(chatId: ChatId, gameShortName: String, options: SendGameOptions): js.Promise[Message] = js.native
  
  def sendInvoice(
    chatId: ChatId,
    title: String,
    description: String,
    payload: String,
    providerToken: String,
    currency: String,
    prices: js.Array[LabeledPrice]
  ): js.Promise[Message] = js.native
  def sendInvoice(
    chatId: ChatId,
    title: String,
    description: String,
    payload: String,
    providerToken: String,
    currency: String,
    prices: js.Array[LabeledPrice],
    options: SendInvoiceOptions
  ): js.Promise[Message] = js.native
  
  def sendLocation(chatId: ChatId, latitude: Double, longitude: Double): js.Promise[Message] = js.native
  def sendLocation(chatId: ChatId, latitude: Double, longitude: Double, options: SendLocationOptions): js.Promise[Message] = js.native
  
  def sendMediaGroup(chatId: ChatId, media: js.Array[InputMedia]): js.Promise[Message] = js.native
  def sendMediaGroup(chatId: ChatId, media: js.Array[InputMedia], options: SendMediaGroupOptions): js.Promise[Message] = js.native
  
  def sendMessage(chatId: ChatId, text: String): js.Promise[Message] = js.native
  def sendMessage(chatId: ChatId, text: String, options: SendMessageOptions): js.Promise[Message] = js.native
  
  def sendPhoto(chatId: ChatId, photo: String): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: String, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: String, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: String, options: SendPhotoOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: Buffer): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: Buffer, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: Buffer, options: SendPhotoOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: Stream): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: Stream, options: SendPhotoOptions): js.Promise[Message] = js.native
  def sendPhoto(chatId: ChatId, photo: Stream, options: SendPhotoOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  
  def sendPoll(chatId: ChatId, question: String, pollOptions: js.Array[String]): js.Promise[Message] = js.native
  def sendPoll(chatId: ChatId, question: String, pollOptions: js.Array[String], options: SendPollOptions): js.Promise[Message] = js.native
  
  def sendSticker(chatId: ChatId, sticker: String): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: String, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: String, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: String, options: SendStickerOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: Buffer): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: Buffer, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: Buffer, options: SendStickerOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: Stream): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: Stream, options: SendStickerOptions): js.Promise[Message] = js.native
  def sendSticker(chatId: ChatId, sticker: Stream, options: SendStickerOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  
  def sendVenue(chatId: ChatId, latitude: Double, longitude: Double, title: String, address: String): js.Promise[Message] = js.native
  def sendVenue(
    chatId: ChatId,
    latitude: Double,
    longitude: Double,
    title: String,
    address: String,
    options: SendVenueOptions
  ): js.Promise[Message] = js.native
  
  def sendVideo(chatId: ChatId, video: String): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: String, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: String, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: String, options: SendVideoOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: Buffer): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: Buffer, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: Buffer, options: SendVideoOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: Stream): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: Stream, options: SendVideoOptions): js.Promise[Message] = js.native
  def sendVideo(chatId: ChatId, video: Stream, options: SendVideoOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  
  def sendVideoNote(chatId: ChatId, videoNote: String): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: String, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: String, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: String, options: SendVideoNoteOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: Buffer): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: Buffer, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: Buffer, options: SendVideoNoteOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: Stream): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: Stream, options: SendVideoNoteOptions): js.Promise[Message] = js.native
  def sendVideoNote(chatId: ChatId, videoNote: Stream, options: SendVideoNoteOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  
  def sendVoice(chatId: ChatId, voice: String): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: String, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: String, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: String, options: SendVoiceOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: Buffer): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: Buffer, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: Buffer, options: SendVoiceOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: Stream): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: Stream, options: SendVoiceOptions): js.Promise[Message] = js.native
  def sendVoice(chatId: ChatId, voice: Stream, options: SendVoiceOptions, fileOptions: FileOptions): js.Promise[Message] = js.native
  
  def setChatAdministratorCustomTitle(chatId: ChatId, userId: Double, customTitle: String): js.Promise[Boolean] = js.native
  
  def setChatDescription(chatId: ChatId, description: String): js.Promise[Boolean] = js.native
  
  def setChatMenuButton(form: Chatid): js.Promise[Boolean] = js.native
  
  def setChatPermissions(chatId: ChatId, chatPermissions: ChatPermissions): js.Promise[Boolean] = js.native
  def setChatPermissions(chatId: ChatId, chatPermissions: ChatPermissions, options: SetChatPermissionsOptions): js.Promise[Boolean] = js.native
  
  def setChatPhoto(chatId: ChatId, photo: String): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: String, options: js.Object): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: String, options: js.Object, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: String, options: Unit, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: Buffer): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: Buffer, options: js.Object): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: Buffer, options: js.Object, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: Stream): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: Stream, options: js.Object): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: Stream, options: js.Object, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setChatPhoto(chatId: ChatId, photo: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  
  def setChatStickerSet(chatId: ChatId, stickerSetName: String): js.Promise[Boolean] = js.native
  
  def setChatTitle(chatId: ChatId, title: String): js.Promise[Boolean] = js.native
  
  def setGameScore(userId: Double, score: Double): js.Promise[Message | Boolean] = js.native
  def setGameScore(userId: Double, score: Double, options: SetGameScoreOptions): js.Promise[Message | Boolean] = js.native
  
  def setMyCommands(commands: js.Array[BotCommand]): js.Promise[Boolean] = js.native
  def setMyCommands(commands: js.Array[BotCommand], options: Languagecode): js.Promise[Boolean] = js.native
  
  def setMyDefaultAdministratorRights(form: Forchannels): js.Promise[Boolean] = js.native
  
  def setStickerPositionInSet(sticker: String, position: Double): js.Promise[Boolean] = js.native
  
  def setStickerSetThumb(userId: Double, name: String, pngThumb: String): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: String, options: js.Object): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: String, options: js.Object, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: String, options: Unit, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: Buffer): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: Buffer, options: js.Object): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: Buffer, options: js.Object, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: Stream): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: Stream, options: js.Object): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: Stream, options: js.Object, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  def setStickerSetThumb(userId: Double, name: String, pngThumb: Stream, options: Unit, fileOptions: FileOptions): js.Promise[Boolean] = js.native
  
  def setWebHook(url: String): js.Promise[Any] = js.native
  def setWebHook(url: String, options: Unit, fileOptions: FileOptions): js.Promise[Any] = js.native
  def setWebHook(url: String, options: SetWebHookOptions): js.Promise[Any] = js.native
  def setWebHook(url: String, options: SetWebHookOptions, fileOptions: FileOptions): js.Promise[Any] = js.native
  
  def startPolling(): js.Promise[Any] = js.native
  def startPolling(options: StartPollingOptions): js.Promise[Any] = js.native
  
  def stopMessageLiveLocation(): js.Promise[Message | Boolean] = js.native
  def stopMessageLiveLocation(options: StopMessageLiveLocationOptions): js.Promise[Message | Boolean] = js.native
  
  // `messageId` was referred to as `pollId` in `node-telegram-bot-api/src/telegram.js`,
  // but actually `pollId` is another thing, and I believe that's a mistake.
  // see https://core.telegram.org/bots/api#stoppoll for more info.
  def stopPoll(chatId: ChatId, messageId: Double): js.Promise[Poll] = js.native
  def stopPoll(chatId: ChatId, messageId: Double, options: StopPollOptions): js.Promise[Poll] = js.native
  
  def stopPolling(): js.Promise[Any] = js.native
  def stopPolling(options: StopPollingOptions): js.Promise[Any] = js.native
  
  def unbanChatMember(chatId: ChatId, userId: Double): js.Promise[Boolean] = js.native
  
  def unbanChatSenderChat(chatId: ChatId, senderChatId: ChatId): js.Promise[Boolean] = js.native
  
  def unhideGeneralForumTopic(chatId: ChatId): js.Promise[Boolean] = js.native
  
  def unpinAllChatMessages(chatId: ChatId): js.Promise[Boolean] = js.native
  
  def unpinAllForumTopicMessages(chatId: ChatId, messageThreadId: Double): js.Promise[Boolean] = js.native
  
  def unpinChatMessage(chatId: ChatId): js.Promise[Boolean] = js.native
  def unpinChatMessage(chatId: ChatId, messageId: Double): js.Promise[Boolean] = js.native
  
  def uploadStickerFile(userId: Double, pngSticker: String): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: String, options: js.Object): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: String, options: js.Object, fileOptions: FileOptions): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: String, options: Unit, fileOptions: FileOptions): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: Buffer): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: Buffer, options: js.Object): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: Buffer, options: js.Object, fileOptions: FileOptions): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: Buffer, options: Unit, fileOptions: FileOptions): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: Stream): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: Stream, options: js.Object): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: Stream, options: js.Object, fileOptions: FileOptions): js.Promise[File] = js.native
  def uploadStickerFile(userId: Double, pngSticker: Stream, options: Unit, fileOptions: FileOptions): js.Promise[File] = js.native
}
