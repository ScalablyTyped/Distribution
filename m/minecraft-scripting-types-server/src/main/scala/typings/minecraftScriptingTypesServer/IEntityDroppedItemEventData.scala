package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.IItemStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity drops an item.
  */
@js.native
trait IEntityDroppedItemEventData extends StObject {
  
  /**
    * The entity who dropped the item
    */
  var entity: IEntity = js.native
  
  /**
    * The item that was dropped
    */
  var item_stack: IItemStack = js.native
}
object IEntityDroppedItemEventData {
  
  @scala.inline
  def apply(entity: IEntity, item_stack: IItemStack): IEntityDroppedItemEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], item_stack = item_stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityDroppedItemEventData]
  }
  
  @scala.inline
  implicit class IEntityDroppedItemEventDataMutableBuilder[Self <: IEntityDroppedItemEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem_stack(value: IItemStack): Self = StObject.set(x, "item_stack", value.asInstanceOf[js.Any])
  }
}
