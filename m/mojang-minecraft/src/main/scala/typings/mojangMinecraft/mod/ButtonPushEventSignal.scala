package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "ButtonPushEventSignal")
@js.native
/* protected */ open class ButtonPushEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when a button is pushed.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ ButtonPushEvent, Unit]): js.Function1[/* arg */ ButtonPushEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when a button is
    * pushed.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ ButtonPushEvent, Unit]): Unit = js.native
}
