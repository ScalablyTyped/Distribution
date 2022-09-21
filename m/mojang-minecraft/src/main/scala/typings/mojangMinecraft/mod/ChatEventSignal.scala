package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ChatEventSignal")
@js.native
/* protected */ open class ChatEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when new chat messages
    * are sent.
    * @param callback
    * @example custom_command.js
    * ```typescript
    *        const chatCallback = World.events.beforeChat.subscribe((eventData) => {
    *          if (eventData.message.includes("cancel")) {
    *            // Cancel event if the message contains "cancel"
    *            eventData.canceled = true;
    *          } else {
    *            // Modify chat message being sent
    *            eventData.message = `Modified '${eventData.message}'`;
    *          }
    *        });
    *
    * ```
    */
  def subscribe(callback: js.Function1[/* arg */ ChatEvent, Unit]): js.Function1[/* arg */ ChatEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when new chat messages
    * are sent.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ChatEvent, Unit]): Unit = js.native
}
