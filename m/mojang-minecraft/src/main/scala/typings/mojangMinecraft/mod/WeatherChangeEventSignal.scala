package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "WeatherChangeEventSignal")
@js.native
/* protected */ open class WeatherChangeEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called when weather changes.
    * @param callback
    */
  def subscribe(callback: js.Function1[/* arg */ WeatherChangeEvent, Unit]): js.Function1[/* arg */ WeatherChangeEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback from being called when weather changes.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ WeatherChangeEvent, Unit]): Unit = js.native
}
