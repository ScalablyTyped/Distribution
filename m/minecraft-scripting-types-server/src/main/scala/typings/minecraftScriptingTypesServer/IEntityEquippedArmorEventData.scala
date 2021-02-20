package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.IItemStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity equips an item in their armor slots.
  */
@js.native
trait IEntityEquippedArmorEventData extends StObject {
  
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
  implicit class IEntityEquippedArmorEventDataMutableBuilder[Self <: IEntityEquippedArmorEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_stack(value: IItemStack): Self = StObject.set(x, "item_stack", value.asInstanceOf[js.Any])
  }
}
