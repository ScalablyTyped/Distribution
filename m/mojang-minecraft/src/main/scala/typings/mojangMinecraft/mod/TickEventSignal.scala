package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "TickEventSignal")
@js.native
/* protected */ open class TickEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called on every tick.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ TickEvent, Unit]): js.Function1[/* arg */ TickEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called every tick.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ TickEvent, Unit]): Unit = js.native
}
