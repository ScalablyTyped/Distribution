package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityAddRiderComponent")
@js.native
/* protected */ open class EntityAddRiderComponent () extends IEntityComponent {
  
  /**
    * The type of entity that is added as a rider for this entity
    * when spawned under certain conditions.
    * @throws This property can throw when used.
    */
  val entityType: String = js.native
  
  /**
    * Optional spawn event to trigger on the rider when that rider
    * is spawned for this entity.
    * @throws This property can throw when used.
    */
  val spawnEvent: String = js.native
}
/* static members */
object EntityAddRiderComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:addrider.
    */
  @JSImport("mojang-minecraft", "EntityAddRiderComponent.id")
  @js.native
  val id: /* "minecraft:addrider" */ String = js.native
}
