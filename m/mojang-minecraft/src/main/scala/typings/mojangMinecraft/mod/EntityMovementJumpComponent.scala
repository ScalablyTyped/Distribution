package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementJumpComponent")
@js.native
/* protected */ open class EntityMovementJumpComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
}
/* static members */
object EntityMovementJumpComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.jump.
    */
  @JSImport("mojang-minecraft", "EntityMovementJumpComponent.id")
  @js.native
  val id: /* "minecraft:movement.jump" */ String = js.native
}
