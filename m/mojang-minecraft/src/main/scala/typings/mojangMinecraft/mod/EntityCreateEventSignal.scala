package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityCreateEventSignal")
@js.native
/* protected */ open class EntityCreateEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a new entity is
    * created.
    * @param callback
    * @example runEntityCreatedEvent.ts
    * ```typescript
    *          // register a new function that is called when a new entity is created.
    *          const entityCreatedCallback = mc.world.events.entityCreate.subscribe((entityEvent: mc.EntityCreateEvent) => {
    *            if (entityEvent && entityEvent.entity) {
    *              log("New entity of type '" + +entityEvent.entity + "' created!", 1);
    *            } else {
    *              log("The entity event didn't work as expected.", -1);
    *            }
    *          });
    * ```
    */
  def subscribe(callback: js.Function1[/* arg */ EntityCreateEvent, Unit]): js.Function1[/* arg */ EntityCreateEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a new entity is
    * created.
    * @param callback
    * @throws This function can throw errors.
    * @example unsubscribeEntityCreatedEvent.ts
    * ```typescript
    *          if (entityCreatedCallbacks.length > 0) {
    *            let callback = entityCreatedCallbacks.pop();
    *
    *            if (callback) {
    *              mc.world.events.entityCreate.unsubscribe(callback);
    *            }
    *          }
    * ```
    */
  def unsubscribe(callback: js.Function1[/* arg */ EntityCreateEvent, Unit]): Unit = js.native
}
