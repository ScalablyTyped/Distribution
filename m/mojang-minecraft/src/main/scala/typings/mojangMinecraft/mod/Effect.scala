package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "Effect")
@js.native
/* protected */ open class Effect () extends StObject {
  
  /**
    * Gets an amplifier that may have been applied to this effect.
    * Sample values range typically from 0 to 4. Example: The
    * effect 'Jump Boost II' will have an amplifier value of 1.
    */
  val amplifier: Double = js.native
  
  /**
    * Gets the player-friendly name of this effect.
    */
  val displayName: String = js.native
  
  /**
    * Gets the entire specified duration, in ticks, of this
    * effect.
    */
  val duration: Double = js.native
}
