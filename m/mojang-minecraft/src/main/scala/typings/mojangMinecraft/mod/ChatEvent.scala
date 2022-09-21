package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ChatEvent")
@js.native
/* protected */ open class ChatEvent () extends StObject {
  
  /**
    * Message that is being broadcast. In a beforeChat event
    * handler, _message_ can be updated with edits before the
    * message is displayed to players.
    */
  var message: String = js.native
  
  /**
    * If true, this message is directly targeted to one or more
    * players (i.e., is not broadcast.)
    */
  var sendToTargets: Boolean = js.native
  
  /**
    * Player that sent the chat message.
    */
  var sender: Player = js.native
  
  /**
    * List of players that will receive this message.
    */
  var targets: js.Array[Player] = js.native
}
