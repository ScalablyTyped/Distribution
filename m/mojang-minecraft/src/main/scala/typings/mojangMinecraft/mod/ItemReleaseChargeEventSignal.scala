package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemReleaseChargeEventSignal")
@js.native
/* protected */ open class ItemReleaseChargeEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a chargeable item
    * is released from charging.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ItemReleaseChargeEvent, Unit]): js.Function1[/* arg */ ItemReleaseChargeEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a chargeable item
    * is released from charging.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ItemReleaseChargeEvent, Unit]): Unit = js.native
}
