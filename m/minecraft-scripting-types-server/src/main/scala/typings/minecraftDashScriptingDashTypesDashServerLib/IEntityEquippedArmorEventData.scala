package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity equips an item in their armor slots.
  */
trait IEntityEquippedArmorEventData extends js.Object {
  /**
    * The entity who is equipping the armor
    */
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The armor that is being equipped
    */
  var item_stack: minecraftDashScriptingDashTypesDashSharedLib.IItemStack
}

object IEntityEquippedArmorEventData {
  @scala.inline
  def apply(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    item_stack: minecraftDashScriptingDashTypesDashSharedLib.IItemStack
  ): IEntityEquippedArmorEventData = {
    val __obj = js.Dynamic.literal(entity = entity, item_stack = item_stack)
  
    __obj.asInstanceOf[IEntityEquippedArmorEventData]
  }
}

