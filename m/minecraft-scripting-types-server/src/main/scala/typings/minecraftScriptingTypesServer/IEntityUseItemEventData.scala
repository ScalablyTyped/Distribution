package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity uses an item.
  */
@js.native
trait IEntityUseItemEventData extends js.Object {
  /**
    * The entity who is using the item
    */
  var entity: IEntity = js.native
  /**
    * The item that is being used
    */
  var item_stack: IItemStack = js.native
  /**
    * The way the entity used the item
    */
  var use_method: String = js.native
}

object IEntityUseItemEventData {
  @scala.inline
  def apply(entity: IEntity, item_stack: IItemStack, use_method: String): IEntityUseItemEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], item_stack = item_stack.asInstanceOf[js.Any], use_method = use_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityUseItemEventData]
  }
  @scala.inline
  implicit class IEntityUseItemEventDataOps[Self <: IEntityUseItemEventData] (val x: Self) extends AnyVal {
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
    def setEntity(value: IEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem_stack(value: IItemStack): Self = this.set("item_stack", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse_method(value: String): Self = this.set("use_method", value.asInstanceOf[js.Any])
  }
  
}

