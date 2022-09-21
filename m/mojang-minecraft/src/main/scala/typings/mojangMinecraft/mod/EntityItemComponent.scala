package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityItemComponent")
@js.native
/* protected */ open class EntityItemComponent () extends IEntityComponent {
  
  /**
    * Item stack represented by this entity in the world.
    * @throws This property can throw when used.
    */
  val itemStack: ItemStack = js.native
}
/* static members */
object EntityItemComponent {
  
  /**
    * Identifier of this component.
    */
  @JSImport("mojang-minecraft", "EntityItemComponent.id")
  @js.native
  val id: /* "minecraft:item" */ String = js.native
}
