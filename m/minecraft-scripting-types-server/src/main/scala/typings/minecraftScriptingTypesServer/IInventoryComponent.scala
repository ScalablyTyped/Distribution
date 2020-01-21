package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the entity's inventory (size, restrictions, etc.). Currently this does not allow changing the entity's inventory contents.
  */
trait IInventoryComponent extends js.Object {
  /**
    * Number of slots that this entity can gain per extra strength
    * @default 0
    */
  var additional_slots_per_strength: Double
  /**
    * If true, the contents of this inventory can be removed by a hopper
    * @default false
    */
  var can_be_siphoned_from: Boolean
  /**
    * Type of container this entity has. Can be horse, minecart_chest, minecart_hopper, inventory, container or hopper
    * @default none
    */
  var container_type: String
  /**
    * Number of slots the container has
    * @default 5
    */
  var inventory_size: Double
  /**
    * If true, only the entity can access the inventory
    * @default false
    */
  var `private`: Boolean
  /**
    * If true, the entity's inventory can only be accessed by its owner or itself
    * @default false
    */
  var restrict_to_owner: Boolean
}

object IInventoryComponent {
  @scala.inline
  def apply(
    additional_slots_per_strength: Double,
    can_be_siphoned_from: Boolean,
    container_type: String,
    inventory_size: Double,
    `private`: Boolean,
    restrict_to_owner: Boolean
  ): IInventoryComponent = {
    val __obj = js.Dynamic.literal(additional_slots_per_strength = additional_slots_per_strength.asInstanceOf[js.Any], can_be_siphoned_from = can_be_siphoned_from.asInstanceOf[js.Any], container_type = container_type.asInstanceOf[js.Any], inventory_size = inventory_size.asInstanceOf[js.Any], restrict_to_owner = restrict_to_owner.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInventoryComponent]
  }
}

