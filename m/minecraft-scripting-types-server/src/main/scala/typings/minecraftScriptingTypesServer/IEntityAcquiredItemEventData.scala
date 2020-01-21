package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity acquires an item.
  */
trait IEntityAcquiredItemEventData extends js.Object {
  /**
    * The total number of items acquired by the entity during this event
    */
  var acquired_amount: Double
  /**
    * The way the entity acquired the item
    */
  var acquisition_method: String
  /**
    * The entity who acquired the item
    */
  var entity: IEntity
  /**
    * The item that was acquired
    */
  var item_stack: IItemStack
  /**
    * If it exists, the entity that affected the item before it was acquired. Example: A player completes a trade with a villager. The `entity` property would be the player and the `secondary_entity` would be the villager
    */
  var secondary_entity: IEntity
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
}

