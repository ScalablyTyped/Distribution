package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementSkipComponent")
@js.native
/* protected */ open class EntityMovementSkipComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
}
/* static members */
object EntityMovementSkipComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.skip.
    */
  @JSImport("mojang-minecraft", "EntityMovementSkipComponent.id")
  @js.native
  val id: /* "minecraft:movement.skip" */ String = js.native
}
