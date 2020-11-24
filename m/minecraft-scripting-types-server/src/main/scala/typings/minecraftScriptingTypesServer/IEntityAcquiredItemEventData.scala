package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity acquires an item.
  */
@js.native
trait IEntityAcquiredItemEventData extends js.Object {
  
  /**
    * The total number of items acquired by the entity during this event
    */
  var acquired_amount: Double = js.native
  
  /**
    * The way the entity acquired the item
    */
  var acquisition_method: String = js.native
  
  /**
    * The entity who acquired the item
    */
  var entity: IEntity = js.native
  
  /**
    * The item that was acquired
    */
  var item_stack: IItemStack = js.native
  
  /**
    * If it exists, the entity that affected the item before it was acquired. Example: A player completes a trade with a villager. The `entity` property would be the player and the `secondary_entity` would be the villager
    */
  var secondary_entity: IEntity = js.native
}
object IEntityAcquiredItemEventData {
  
  @scala.inline
  def apply(
    acquired_amount: Double,
    acquisition_method: String,
    entity: IEntity,
    item_stack: IItemStack,
    secondary_entity: IEntity
  ): IEntityAcquiredItemEventData = {
    val __obj = js.Dynamic.literal(acquired_amount = acquired_amount.asInstanceOf[js.Any], acquisition_method = acquisition_method.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], item_stack = item_stack.asInstanceOf[js.Any], secondary_entity = secondary_entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityAcquiredItemEventData]
  }
  
  @scala.inline
  implicit class IEntityAcquiredItemEventDataOps[Self <: IEntityAcquiredItemEventData] (val x: Self) extends AnyVal {
    
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
    def setAcquired_amount(value: Double): Self = this.set("acquired_amount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcquisition_method(value: String): Self = this.set("acquisition_method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntity(value: IEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_stack(value: IItemStack): Self = this.set("item_stack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondary_entity(value: IEntity): Self = this.set("secondary_entity", value.asInstanceOf[js.Any])
  }
}
