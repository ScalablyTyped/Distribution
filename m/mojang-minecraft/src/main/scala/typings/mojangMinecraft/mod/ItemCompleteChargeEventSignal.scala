package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemCompleteChargeEventSignal")
@js.native
/* protected */ open class ItemCompleteChargeEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a chargeable item
    * completes charging.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ItemCompleteChargeEvent, Unit]): js.Function1[/* arg */ ItemCompleteChargeEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a chargeable item
    * completes charging.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ItemCompleteChargeEvent, Unit]): Unit = js.native
}
