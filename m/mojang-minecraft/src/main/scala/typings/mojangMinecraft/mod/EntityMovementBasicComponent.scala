package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityMovementBasicComponent")
@js.native
/* protected */ open class EntityMovementBasicComponent () extends IEntityComponent {
  
  /**
    * The maximum number in degrees the mob can turn per tick.
    * @throws This property can throw when used.
    */
  val maxTurn: Double = js.native
}
/* static members */
object EntityMovementBasicComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:movement.basic.
    */
  @JSImport("mojang-minecraft", "EntityMovementBasicComponent.id")
  @js.native
  val id: /* "minecraft:movement.basic" */ String = js.native
}
