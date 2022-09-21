package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementGenericComponent")
@js.native
/* protected */ open class EntityMovementGenericComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
}
/* static members */
object EntityMovementGenericComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.generic.
    */
  @JSImport("mojang-minecraft", "EntityMovementGenericComponent.id")
  @js.native
  val id: /* "minecraft:movement.generic" */ String = js.native
}
