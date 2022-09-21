package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemUseEventSignal")
@js.native
/* protected */ open class ItemUseEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an item is used.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ItemUseEvent, Unit]): js.Function1[/* arg */ ItemUseEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an item is used.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ItemUseEvent, Unit]): Unit = js.native
}
