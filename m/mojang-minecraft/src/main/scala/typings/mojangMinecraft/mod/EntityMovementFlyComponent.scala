package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementFlyComponent")
@js.native
/* protected */ open class EntityMovementFlyComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
}
/* static members */
object EntityMovementFlyComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.fly.
    */
  @JSImport("mojang-minecraft", "EntityMovementFlyComponent.id")
  @js.native
  val id: /* "minecraft:movement.fly" */ String = js.native
}
