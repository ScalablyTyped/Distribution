package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var additional_slots_per_strength: scala.Double
  /**
    * If true, the contents of this inventory can be removed by a hopper
    * @default false
    */
  var can_be_siphoned_from: scala.Boolean
  /**
    * Type of container this entity has. Can be horse, minecart_chest, minecart_hopper, inventory, container or hopper
    * @default none
    */
  var container_type: java.lang.String
  /**
    * Number of slots the container has
    * @default 5
    */
  var inventory_size: scala.Double
  /**
    * If true, only the entity can access the inventory
    * @default false
    */
  var `private`: scala.Boolean
  /**
    * If true, the entity's inventory can only be accessed by its owner or itself
    * @default false
    */
  var restrict_to_owner: scala.Boolean
}

object IInventoryComponent {
  @scala.inline
  def apply(
    additional_slots_per_strength: scala.Double,
    can_be_siphoned_from: scala.Boolean,
    container_type: java.lang.String,
    inventory_size: scala.Double,
    `private`: scala.Boolean,
    restrict_to_owner: scala.Boolean
  ): IInventoryComponent = {
    val __obj = js.Dynamic.literal(additional_slots_per_strength = additional_slots_per_strength, can_be_siphoned_from = can_be_siphoned_from, container_type = container_type, inventory_size = inventory_size, restrict_to_owner = restrict_to_owner)
    __obj.updateDynamic("private")(`private`)
    __obj.asInstanceOf[IInventoryComponent]
  }
}

