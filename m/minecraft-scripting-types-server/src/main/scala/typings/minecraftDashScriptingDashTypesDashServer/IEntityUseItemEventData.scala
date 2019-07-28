package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity uses an item.
  */
trait IEntityUseItemEventData extends js.Object {
  /**
    * The entity who is using the item
    */
  var entity: IEntity
  /**
    * The item that is being used
    */
  var item_stack: IItemStack
  /**
    * The way the entity used the item
    */
  var use_method: String
}

object IEntityUseItemEventData {
  @scala.inline
  def apply(entity: IEntity, item_stack: IItemStack, use_method: String): IEntityUseItemEventData = {
    val __obj = js.Dynamic.literal(entity = entity, item_stack = item_stack, use_method = use_method)
  
    __obj.asInstanceOf[IEntityUseItemEventData]
  }
}

