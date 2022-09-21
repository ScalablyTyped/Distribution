package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "PistonActivateEventSignal")
@js.native
/* protected */ open class PistonActivateEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a piston expands or
    * retracts.
    * @param callback
    * @example pistonEvent.ts
    * ```typescript
    *          let canceled = false;
    *
    *          const pistonLoc = new mc.BlockLocation(
    *            Math.floor(targetLocation.x) + 1,
    *            Math.floor(targetLocation.y) + 2,
    *            Math.floor(targetLocation.z) + 1
    *          );
    *
    *          const pistonCallback = mc.world.events.beforePistonActivate.subscribe((pistonEvent: mc.BeforePistonActivateEvent) => {
    *            if (pistonEvent.piston.location.equals(pistonLoc)) {
    *              log("Cancelling piston event");
    *              pistonEvent.cancel = true;
    *              canceled = true;
    *            }
    *          });
    * ```
    */
  def subscribe(callback: js.Function1[/* arg */ PistonActivateEvent, Unit]): js.Function1[/* arg */ PistonActivateEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a piston expands
    * or retracts.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ PistonActivateEvent, Unit]): Unit = js.native
}
