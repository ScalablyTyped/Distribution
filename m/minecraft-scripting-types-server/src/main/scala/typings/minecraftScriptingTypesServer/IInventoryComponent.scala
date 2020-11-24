package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines the entity's inventory (size, restrictions, etc.). Currently this does not allow changing the entity's inventory contents.
  */
@js.native
trait IInventoryComponent extends js.Object {
  
  /**
    * Number of slots that this entity can gain per extra strength
    * @default 0
    */
  var additional_slots_per_strength: Double = js.native
  
  /**
    * If true, the contents of this inventory can be removed by a hopper
    * @default false
    */
  var can_be_siphoned_from: Boolean = js.native
  
  /**
    * Type of container this entity has. Can be horse, minecart_chest, minecart_hopper, inventory, container or hopper
    * @default none
    */
  var container_type: String = js.native
  
  /**
    * Number of slots the container has
    * @default 5
    */
  var inventory_size: Double = js.native
  
  /**
    * If true, only the entity can access the inventory
    * @default false
    */
  var `private`: Boolean = js.native
  
  /**
    * If true, the entity's inventory can only be accessed by its owner or itself
    * @default false
    */
  var restrict_to_owner: Boolean = js.native
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
  
  @scala.inline
  implicit class IInventoryComponentOps[Self <: IInventoryComponent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdditional_slots_per_strength(value: Double): Self = this.set("additional_slots_per_strength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCan_be_siphoned_from(value: Boolean): Self = this.set("can_be_siphoned_from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainer_type(value: String): Self = this.set("container_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInventory_size(value: Double): Self = this.set("inventory_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivate(value: Boolean): Self = this.set("private", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrict_to_owner(value: Boolean): Self = this.set("restrict_to_owner", value.asInstanceOf[js.Any])
  }
}
