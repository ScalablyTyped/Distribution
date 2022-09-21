package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockPlaceEventSignal")
@js.native
/* protected */ open class BlockPlaceEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a block is placed
    * by a player.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BlockPlaceEvent, Unit]): js.Function1[/* arg */ BlockPlaceEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an block is
    * placed.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BlockPlaceEvent, Unit]): Unit = js.native
}
