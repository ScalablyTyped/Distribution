package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockBreakEventSignal")
@js.native
/* protected */ open class BlockBreakEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a block is broken
    * by a player.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BlockBreakEvent, Unit]): js.Function1[/* arg */ BlockBreakEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an block is
    * broken.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BlockBreakEvent, Unit]): Unit = js.native
}
