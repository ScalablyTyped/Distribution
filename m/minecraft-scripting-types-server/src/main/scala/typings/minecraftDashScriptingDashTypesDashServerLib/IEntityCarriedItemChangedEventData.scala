package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var carried_item: minecraftDashScriptingDashTypesDashSharedLib.IItemStack
  /**
    * The entity that changed what they were carrying
    */
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The item that was previously in the entities hands
    */
  var previous_carried_item: minecraftDashScriptingDashTypesDashSharedLib.IItemStack
}

object IEntityCarriedItemChangedEventData {
  @scala.inline
  def apply(
    carried_item: minecraftDashScriptingDashTypesDashSharedLib.IItemStack,
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    previous_carried_item: minecraftDashScriptingDashTypesDashSharedLib.IItemStack
  ): IEntityCarriedItemChangedEventData = {
    val __obj = js.Dynamic.literal(carried_item = carried_item, entity = entity, previous_carried_item = previous_carried_item)
  
    __obj.asInstanceOf[IEntityCarriedItemChangedEventData]
  }
}

