package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemStartChargeEventSignal")
@js.native
/* protected */ open class ItemStartChargeEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a chargeable item
    * starts charging.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ItemStartChargeEvent, Unit]): js.Function1[/* arg */ ItemStartChargeEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a chargeable item
    * starts charging.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ItemStartChargeEvent, Unit]): Unit = js.native
}
