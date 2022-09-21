package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "WorldInitializeEventSignal")
@js.native
/* protected */ open class WorldInitializeEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when the scripting
    * environment is initialized for a World.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ WorldInitializeEvent, Unit]): js.Function1[/* arg */ WorldInitializeEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called the scripting
    * environment is initialized for a World.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ WorldInitializeEvent, Unit]): Unit = js.native
}
