package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementGlideComponent")
@js.native
/* protected */ open class EntityMovementGlideComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
  
  /**
    * Speed in effect when the entity is turning.
    * @throws This property can throw when used.
    */
  val speedWhenTurning: Double = js.native
  
  /**
    * Start speed during a glide.
    * @throws This property can throw when used.
    */
  val startSpeed: Double = js.native
}
/* static members */
object EntityMovementGlideComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.glide.
    */
  @JSImport("mojang-minecraft", "EntityMovementGlideComponent.id")
  @js.native
  val id: /* "minecraft:movement.glide" */ String = js.native
}
