package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementHoverComponent")
@js.native
/* protected */ open class EntityMovementHoverComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
}
/* static members */
object EntityMovementHoverComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.hover.
    */
  @JSImport("mojang-minecraft", "EntityMovementHoverComponent.id")
  @js.native
  val id: /* "minecraft:movement.hover" */ String = js.native
}
