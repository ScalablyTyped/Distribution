package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity drops an item.
  */
trait IEntityDroppedItemEventData extends js.Object {
  /**
    * The entity who dropped the item
    */
  var entity: IEntity
  /**
    * The item that was dropped
    */
  var item_stack: IItemStack
}

object IEntityDroppedItemEventData {
  @scala.inline
  def apply(entity: IEntity, item_stack: IItemStack): IEntityDroppedItemEventData = {
    val __obj = js.Dynamic.literal(entity = entity, item_stack = item_stack)
  
    __obj.asInstanceOf[IEntityDroppedItemEventData]
  }
}

