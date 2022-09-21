package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "LeverActionEventSignal")
@js.native
/* protected */ open class LeverActionEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a lever is moved
    * (activates or deactivates).
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ LeverActionEvent, Unit]): js.Function1[/* arg */ LeverActionEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a lever is moved
    * (activates or deactivates).
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ LeverActionEvent, Unit]): Unit = js.native
}
