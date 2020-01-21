package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity changes the item carried in their hand.
  */
trait IEntityCarriedItemChangedEventData extends js.Object {
  /**
    * The item that is now in the entities hands
    */
  var carried_item: IItemStack
  /**
    * The entity that changed what they were carrying
    */
  var entity: IEntity
  /**
    * The item that was previously in the entities hands
    */
  var previous_carried_item: IItemStack
}

object IEntityCarriedItemChangedEventData {
  @scala.inline
  def apply(carried_item: IItemStack, entity: IEntity, previous_carried_item: IItemStack): IEntityCarriedItemChangedEventData = {
    val __obj = js.Dynamic.literal(carried_item = carried_item.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], previous_carried_item = previous_carried_item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntityCarriedItemChangedEventData]
  }
}

