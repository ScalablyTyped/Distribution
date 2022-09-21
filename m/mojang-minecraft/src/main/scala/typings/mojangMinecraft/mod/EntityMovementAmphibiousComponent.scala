package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementAmphibiousComponent")
@js.native
/* protected */ open class EntityMovementAmphibiousComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
}
/* static members */
object EntityMovementAmphibiousComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.amphibious.
    */
  @JSImport("mojang-minecraft", "EntityMovementAmphibiousComponent.id")
  @js.native
  val id: /* "minecraft:movement.amphibious" */ String = js.native
}
