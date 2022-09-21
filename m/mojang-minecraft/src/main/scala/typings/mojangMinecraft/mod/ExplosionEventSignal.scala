package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ExplosionEventSignal")
@js.native
/* protected */ open class ExplosionEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when an explosion
    * occurs.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ExplosionEvent, Unit]): js.Function1[/* arg */ ExplosionEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when an explosion
    * occurs.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ExplosionEvent, Unit]): Unit = js.native
}
