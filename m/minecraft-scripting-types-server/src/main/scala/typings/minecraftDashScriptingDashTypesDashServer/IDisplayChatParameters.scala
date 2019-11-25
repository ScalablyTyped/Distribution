package typings.minecraftDashScriptingDashTypesDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is used to send a chat message from the server to the players. The event data is the message being sent as a string. Special formatting is supported the same way it would be if a player was sending the message.
  */
trait IDisplayChatParameters extends js.Object {
  /**
    * The chat message that will be displayed
    */
  var message: String
}

object IDisplayChatParameters {
  @scala.inline
  def apply(message: String): IDisplayChatParameters = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDisplayChatParameters]
  }
}

