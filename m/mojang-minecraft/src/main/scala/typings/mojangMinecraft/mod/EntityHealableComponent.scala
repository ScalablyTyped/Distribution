package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityHealableComponent")
@js.native
/* protected */ open class EntityHealableComponent () extends IEntityComponent {
  
  /**
    * A set of filters for when these Healable items would apply.
    * @throws This property can throw when used.
    */
  val filters: FilterGroup = js.native
  
  /**
    * Determines if an item can be used regardless of the entity
    * being at full health.
    * @throws This property can throw when used.
    */
  val forceUse: Boolean = js.native
  
  /**
    * A set of items that can specifically heal this entity.
    * @throws This property can throw when used.
    */
  val items: js.Array[FeedItem] = js.native
}
/* static members */
object EntityHealableComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:healable.
    */
  @JSImport("mojang-minecraft", "EntityHealableComponent.id")
  @js.native
  val id: /* "minecraft:healable" */ String = js.native
}
