package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "FeedItemEffect")
@js.native
/* protected */ open class FeedItemEffect () extends StObject {
  
  /**
    * Gets an amplifier that may have been applied to this effect.
    * Valid values are integers starting at 0 and up - but usually
    * ranging between 0 and 4.
    */
  val amplifier: Double = js.native
  
  /**
    * Chance that this effect is applied as a result of the entity
    * being fed this item. Valid values range between 0 and 1.
    */
  val chance: Double = js.native
  
  /**
    * Gets the duration, in ticks, of this effect.
    */
  val duration: Double = js.native
  
  /**
    * Gets the identifier of the effect to apply. Example values
    * include 'fire_resistance' or 'regeneration'.
    */
  val name: String = js.native
}
