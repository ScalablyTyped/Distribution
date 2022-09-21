package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ProjectileHitEventSignal")
@js.native
/* protected */ open class ProjectileHitEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a projectile hits
    * an entity or block.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ProjectileHitEvent, Unit]): js.Function1[/* arg */ ProjectileHitEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a projectile hits
    * an entity or block.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ProjectileHitEvent, Unit]): Unit = js.native
}
