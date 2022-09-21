package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemStopChargeEventSignal")
@js.native
/* protected */ open class ItemStopChargeEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a chargeable item
    * stops charging.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ItemStopChargeEvent, Unit]): js.Function1[/* arg */ ItemStopChargeEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a chargeable item
    * stops charging.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ItemStopChargeEvent, Unit]): Unit = js.native
}
