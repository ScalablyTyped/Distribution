package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var acquired_amount: scala.Double
  /**
    * The way the entity acquired the item
    */
  var acquisition_method: java.lang.String
  /**
    * The entity who acquired the item
    */
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The item that was acquired
    */
  var item_stack: minecraftDashScriptingDashTypesDashSharedLib.IItemStack
  /**
    * If it exists, the entity that affected the item before it was acquired. Example: A player completes a trade with a villager. The `entity` property would be the player and the `secondary_entity` would be the villager
    */
  var secondary_entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IEntityAcquiredItemEventData {
  @scala.inline
  def apply(
    acquired_amount: scala.Double,
    acquisition_method: java.lang.String,
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    item_stack: minecraftDashScriptingDashTypesDashSharedLib.IItemStack,
    secondary_entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  ): IEntityAcquiredItemEventData = {
    val __obj = js.Dynamic.literal(acquired_amount = acquired_amount, acquisition_method = acquisition_method, entity = entity, item_stack = item_stack, secondary_entity = secondary_entity)
  
    __obj.asInstanceOf[IEntityAcquiredItemEventData]
  }
}

