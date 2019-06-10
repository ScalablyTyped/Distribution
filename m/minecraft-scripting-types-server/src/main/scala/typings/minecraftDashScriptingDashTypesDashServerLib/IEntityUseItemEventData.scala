package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The item that is being used
    */
  var item_stack: minecraftDashScriptingDashTypesDashSharedLib.IItemStack
  /**
    * The way the entity used the item
    */
  var use_method: java.lang.String
}

object IEntityUseItemEventData {
  @scala.inline
  def apply(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    item_stack: minecraftDashScriptingDashTypesDashSharedLib.IItemStack,
    use_method: java.lang.String
  ): IEntityUseItemEventData = {
    val __obj = js.Dynamic.literal(entity = entity, item_stack = item_stack, use_method = use_method)
  
    __obj.asInstanceOf[IEntityUseItemEventData]
  }
}

