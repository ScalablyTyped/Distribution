package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityHitEventSignal")
@js.native
/* protected */ open class EntityHitEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an entity hits
    * another entity.
    * @param callback
    * @param options
    */
  def subscribe(callback: js.Function1[/* arg */ EntityHitEvent, Unit]): js.Function1[/* arg */ EntityHitEvent, Unit] = js.native
  def subscribe(callback: js.Function1[/* arg */ EntityHitEvent, Unit], options: EntityEventOptions): js.Function1[/* arg */ EntityHitEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an entity makes a
    * melee attack on another entity.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ EntityHitEvent, Unit]): Unit = js.native
}
