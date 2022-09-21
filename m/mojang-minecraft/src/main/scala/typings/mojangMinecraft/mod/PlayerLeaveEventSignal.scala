package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "PlayerLeaveEventSignal")
@js.native
/* protected */ open class PlayerLeaveEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a player leaves the
    * world.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ PlayerLeaveEvent, Unit]): js.Function1[/* arg */ PlayerLeaveEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a player leaves
    * the world.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ PlayerLeaveEvent, Unit]): Unit = js.native
}
