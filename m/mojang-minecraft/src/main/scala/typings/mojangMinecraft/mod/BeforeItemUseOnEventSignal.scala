package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeItemUseOnEventSignal")
@js.native
/* protected */ open class BeforeItemUseOnEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called before an item is used
    * on a block.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BeforeItemUseOnEvent, Unit]): js.Function1[/* arg */ BeforeItemUseOnEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called before an item is used
    * on a block.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BeforeItemUseOnEvent, Unit]): Unit = js.native
}
