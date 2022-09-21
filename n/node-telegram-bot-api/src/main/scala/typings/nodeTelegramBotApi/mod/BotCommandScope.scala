package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.nodeTelegramBotApi.mod.BotCommandScopeDefault
  - typings.nodeTelegramBotApi.mod.BotCommandScopeAllPrivateChats
  - typings.nodeTelegramBotApi.mod.BotCommandScopeAllGroupChats
  - typings.nodeTelegramBotApi.mod.BotCommandScopeAllChatAdministrators
  - typings.nodeTelegramBotApi.mod.BotCommandScopeChat
  - typings.nodeTelegramBotApi.mod.BotCommandScopeChatAdministrators
  - typings.nodeTelegramBotApi.mod.BotCommandScopeChatMember
*/
trait BotCommandScope extends StObject
object BotCommandScope {
  
  inline def BotCommandScopeAllChatAdministrators(): typings.nodeTelegramBotApi.mod.BotCommandScopeAllChatAdministrators = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_chat_administrators")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.BotCommandScopeAllChatAdministrators]
  }
  
  inline def BotCommandScopeAllGroupChats(): typings.nodeTelegramBotApi.mod.BotCommandScopeAllGroupChats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_group_chats")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.BotCommandScopeAllGroupChats]
  }
  
  inline def BotCommandScopeAllPrivateChats(): typings.nodeTelegramBotApi.mod.BotCommandScopeAllPrivateChats = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("all_private_chats")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.BotCommandScopeAllPrivateChats]
  }
  
  inline def BotCommandScopeChat(chat_id: ChatId): typings.nodeTelegramBotApi.mod.BotCommandScopeChat = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.BotCommandScopeChat]
  }
  
  inline def BotCommandScopeChatAdministrators(chat_id: ChatId): typings.nodeTelegramBotApi.mod.BotCommandScopeChatAdministrators = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat_administrators")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.BotCommandScopeChatAdministrators]
  }
  
  inline def BotCommandScopeChatMember(chat_id: ChatId, user_id: Double): typings.nodeTelegramBotApi.mod.BotCommandScopeChatMember = {
    val __obj = js.Dynamic.literal(chat_id = chat_id.asInstanceOf[js.Any], user_id = user_id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("chat_member")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.BotCommandScopeChatMember]
  }
  
  inline def BotCommandScopeDefault(): typings.nodeTelegramBotApi.mod.BotCommandScopeDefault = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("default")
    __obj.asInstanceOf[typings.nodeTelegramBotApi.mod.BotCommandScopeDefault]
  }
}
