package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityHurtEventSignal")
@js.native
/* protected */ open class EntityHurtEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an entity is hurt.
    * @param callback
    * @param options
    */
  def subscribe(callback: js.Function1[/* arg */ EntityHurtEvent, Unit]): js.Function1[/* arg */ EntityHurtEvent, Unit] = js.native
  def subscribe(callback: js.Function1[/* arg */ EntityHurtEvent, Unit], options: EntityEventOptions): js.Function1[/* arg */ EntityHurtEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an entity is hurt.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ EntityHurtEvent, Unit]): Unit = js.native
}
