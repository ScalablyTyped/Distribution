package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "TickEvent")
@js.native
/* protected */ open class TickEvent () extends StObject {
  
  /**
    * Current tick at the time this event was fired.
    */
  val currentTick: Double = js.native
  
  /**
    * Time since the last tick was fired.
    */
  val deltaTime: Double = js.native
}
