package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "BeforeExplosionEventSignal")
@js.native
/* protected */ open class BeforeExplosionEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when before an explosion
    * occurs. The callback can optionally change or cancel
    * explosion behavior.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ BeforeExplosionEvent, Unit]): js.Function1[/* arg */ BeforeExplosionEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called from before when an
    * explosion would occur.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ BeforeExplosionEvent, Unit]): Unit = js.native
}
