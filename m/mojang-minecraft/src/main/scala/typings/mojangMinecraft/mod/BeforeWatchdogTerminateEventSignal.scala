package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeWatchdogTerminateEventSignal")
@js.native
/* protected */ open class BeforeWatchdogTerminateEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a script runtime is
    * being terminated due to a violation of the performance
    * watchdog system.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BeforeWatchdogTerminateEvent, Unit]): js.Function1[/* arg */ BeforeWatchdogTerminateEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a script runtime
    * is being terminated due to a violation of the performance
    * watchdog system.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BeforeWatchdogTerminateEvent, Unit]): Unit = js.native
}
