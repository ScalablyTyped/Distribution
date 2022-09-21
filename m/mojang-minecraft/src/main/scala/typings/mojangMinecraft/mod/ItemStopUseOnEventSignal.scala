package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemStopUseOnEventSignal")
@js.native
/* protected */ open class ItemStopUseOnEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an item stops being
    * used on a block.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ItemStopUseOnEvent, Unit]): js.Function1[/* arg */ ItemStopUseOnEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an item is used on
    * a block.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ItemStopUseOnEvent, Unit]): Unit = js.native
}
