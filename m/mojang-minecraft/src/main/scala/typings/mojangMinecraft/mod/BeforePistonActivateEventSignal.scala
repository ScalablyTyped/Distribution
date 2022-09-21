package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforePistonActivateEventSignal")
@js.native
/* protected */ open class BeforePistonActivateEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called before a piston expands
    * or retracts.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BeforePistonActivateEvent, Unit]): js.Function1[/* arg */ BeforePistonActivateEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called before a piston expands
    * or retracts.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BeforePistonActivateEvent, Unit]): Unit = js.native
}
