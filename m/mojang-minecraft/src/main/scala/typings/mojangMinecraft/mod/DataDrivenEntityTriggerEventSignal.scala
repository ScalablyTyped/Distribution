package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "DataDrivenEntityTriggerEventSignal")
@js.native
/* protected */ open class DataDrivenEntityTriggerEventSignal () extends StObject {
  
  /**
    * @remarks
    * Adds a callback that will be called after a data driven
    * entity event is triggered.
    * @param callback
    * @param options
    */
  def subscribe(callback: js.Function1[/* arg */ DataDrivenEntityTriggerEvent, Unit]): js.Function1[/* arg */ DataDrivenEntityTriggerEvent, Unit] = js.native
  def subscribe(
    callback: js.Function1[/* arg */ DataDrivenEntityTriggerEvent, Unit],
    options: EntityDataDrivenTriggerEventOptions
  ): js.Function1[/* arg */ DataDrivenEntityTriggerEvent, Unit] = js.native
  
  /**
    * @remarks
    * Removes a callback that will be called after a data driven
    * entity event is triggered.
    * @param callback
    * @throws This function can throw errors.
    */
  def unsubscribe(callback: js.Function1[/* arg */ DataDrivenEntityTriggerEvent, Unit]): Unit = js.native
}
