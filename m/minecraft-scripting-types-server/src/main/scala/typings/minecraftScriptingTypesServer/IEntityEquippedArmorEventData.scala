package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.IItemStack
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity equips an item in their armor slots.
  */
@js.native
trait IEntityEquippedArmorEventData extends js.Object {
  
  /**
    * The entity who is equipping the armor
    */
  var entity: IEntity = js.native
  
  /**
    * The armor that is being equipped
    */
  var item_stack: IItemStack = js.native
}
object IEntityEquippedArmorEventData {
  
  @scala.inline
  def apply(entity: IEntity, item_stack: IItemStack): IEntityEquippedArmorEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], item_stack = item_stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityEquippedArmorEventData]
  }
  
  @scala.inline
  implicit class IEntityEquippedArmorEventDataOps[Self <: IEntityEquippedArmorEventData] (val x: Self) extends AnyVal {
    
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
  }
}
