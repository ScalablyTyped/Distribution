package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeChatEventSignal")
@js.native
/* protected */ open class BeforeChatEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called before new chat messages
    * are sent.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BeforeChatEvent, Unit]): js.Function1[/* arg */ BeforeChatEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called before new chat
    * messages are sent.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BeforeChatEvent, Unit]): Unit = js.native
}
