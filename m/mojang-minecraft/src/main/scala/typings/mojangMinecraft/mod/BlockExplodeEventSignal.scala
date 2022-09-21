package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BlockExplodeEventSignal")
@js.native
/* protected */ open class BlockExplodeEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an explosion
    * occurs, as it impacts individual blocks.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BlockExplodeEvent, Unit]): js.Function1[/* arg */ BlockExplodeEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an explosion
    * occurs, as it impacts individual blocks.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BlockExplodeEvent, Unit]): Unit = js.native
}
