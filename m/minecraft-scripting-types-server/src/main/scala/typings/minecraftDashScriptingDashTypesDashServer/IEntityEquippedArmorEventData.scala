package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.IItemStack
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
  var entity: IEntity
  /**
    * The armor that is being equipped
    */
  var item_stack: IItemStack
}

object IEntityEquippedArmorEventData {
  @scala.inline
  def apply(entity: IEntity, item_stack: IItemStack): IEntityEquippedArmorEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], item_stack = item_stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntityEquippedArmorEventData]
  }
}

