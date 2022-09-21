package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeItemDefinitionEventSignal")
@js.native
/* protected */ open class BeforeItemDefinitionEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an item's
    * definition and components change.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BeforeItemDefinitionTriggeredEvent, Unit]): js.Function1[/* arg */ BeforeItemDefinitionTriggeredEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an item's
    * definition and components change.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BeforeItemDefinitionTriggeredEvent, Unit]): Unit = js.native
}
