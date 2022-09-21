package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EffectAddEventSignal")
@js.native
/* protected */ open class EffectAddEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an effect is added
    * to an entity.
    * @param callback
    * @param options
    */
  def subscribe(callback: js.Function1[/* arg */ EffectAddEvent, Unit]): js.Function1[/* arg */ EffectAddEvent, Unit] = js.native
  def subscribe(callback: js.Function1[/* arg */ EffectAddEvent, Unit], options: EntityEventOptions): js.Function1[/* arg */ EffectAddEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an effect is added
    * to an entity.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ EffectAddEvent, Unit]): Unit = js.native
}
