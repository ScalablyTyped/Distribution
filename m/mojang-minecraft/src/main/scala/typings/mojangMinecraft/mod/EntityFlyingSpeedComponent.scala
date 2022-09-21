package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityFlyingSpeedComponent")
@js.native
/* protected */ open class EntityFlyingSpeedComponent () extends IEntityComponent {
  
  /**
    * Speed while flying value of the entity.
    */
  var value: Double = js.native
}
/* static members */
object EntityFlyingSpeedComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:flying_speed.
    */
  @JSImport("mojang-minecraft", "EntityFlyingSpeedComponent.id")
  @js.native
  val id: /* "minecraft:flying_speed" */ String = js.native
}
