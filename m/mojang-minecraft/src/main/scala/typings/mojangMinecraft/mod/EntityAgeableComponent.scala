package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mojang-minecraft", "EntityAgeableComponent")
@js.native
/* protected */ open class EntityAgeableComponent () extends IEntityComponent {
  
  /**
    * List of items that the entity drops when it grows up.
    * @throws This property can throw when used.
    */
  val dropItems: js.Array[String] = js.native
  
  /**
    * Amount of time before the entity grows up, -1 for always a
    * baby.
    * @throws This property can throw when used.
    */
  val duration: Double = js.native
  
  /**
    * List of items that can be fed to the entity. Includes 'item'
    * for the item name and 'growth' to define how much time it
    * grows up by.
    * @throws This property can throw when used.
    */
  val feedItems: js.Array[EntityDefinitionFeedItem] = js.native
  
  /**
    * Event to run when this entity grows up.
    * @throws This property can throw when used.
    */
  val growUp: Trigger = js.native
}
/* static members */
object EntityAgeableComponent {
  
  /**
    * Identifier of this component. Should always be
    * minecraft:ageable.
    */
  @JSImport("mojang-minecraft", "EntityAgeableComponent.id")
  @js.native
  val id: /* "minecraft:ageable" */ String = js.native
}
