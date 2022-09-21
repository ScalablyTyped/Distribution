package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ItemDefinitionEventSignal")
@js.native
/* protected */ open class ItemDefinitionEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an item's
    * definition and components change.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ItemDefinitionTriggeredEvent, Unit]): js.Function1[/* arg */ ItemDefinitionTriggeredEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an item's
    * definition and components change.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ItemDefinitionTriggeredEvent, Unit]): Unit = js.native
}
