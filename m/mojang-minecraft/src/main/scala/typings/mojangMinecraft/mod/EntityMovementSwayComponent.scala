package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementSwayComponent")
@js.native
/* protected */ open class EntityMovementSwayComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
  
  /**
    * Amplitude of the sway motion.
    * @throws This property can throw when used.
    */
  val swayAmplitude: Double = js.native
  
  /**
    * Amount of sway frequency.
    * @throws This property can throw when used.
    */
  val swayFrequency: Double = js.native
}
/* static members */
object EntityMovementSwayComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.sway.
    */
  @JSImport("mojang-minecraft", "EntityMovementSwayComponent.id")
  @js.native
  val id: /* "minecraft:movement.sway" */ String = js.native
}
