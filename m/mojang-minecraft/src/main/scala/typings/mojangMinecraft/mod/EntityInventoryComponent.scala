package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityInventoryComponent")
@js.native
/* protected */ open class EntityInventoryComponent () extends IEntityComponent {
  
  /**
    * Number of slots that this entity can gain per extra
    * strength.
    * @throws This property can throw when used.
    */
  val additionalSlotsPerStrength: Double = js.native
  
  /**
    * If true, the contents of this inventory can be removed by a
    * hopper.
    * @throws This property can throw when used.
    */
  val canBeSiphonedFrom: Boolean = js.native
  
  /**
    * Defines the container for this entity.
    * @throws This property can throw when used.
    */
  val container: InventoryComponentContainer = js.native
  
  /**
    * Type of container this entity has.
    * @throws This property can throw when used.
    */
  val containerType: String = js.native
  
  /**
    * Number of slots the container has.
    * @throws This property can throw when used.
    */
  val inventorySize: Double = js.native
  
  /**
    * If true, the entity will not drop it's inventory on death.
    * @throws This property can throw when used.
    */
  val `private`: Boolean = js.native
  
  /**
    * If true, the entity's inventory can only be accessed by its
    * owner or itself.
    * @throws This property can throw when used.
    */
  val restrictToOwner: Boolean = js.native
}
/* static members */
object EntityInventoryComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:inventory.
    */
  @JSImport("mojang-minecraft", "EntityInventoryComponent.id")
  @js.native
  val id: /* "minecraft:inventory" */ String = js.native
}
