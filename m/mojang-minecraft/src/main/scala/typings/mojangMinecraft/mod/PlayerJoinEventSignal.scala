package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "PlayerJoinEventSignal")
@js.native
/* protected */ open class PlayerJoinEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a player joins the
    * world.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ PlayerJoinEvent, Unit]): js.Function1[/* arg */ PlayerJoinEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a player joins the
    * world.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ PlayerJoinEvent, Unit]): Unit = js.native
}
