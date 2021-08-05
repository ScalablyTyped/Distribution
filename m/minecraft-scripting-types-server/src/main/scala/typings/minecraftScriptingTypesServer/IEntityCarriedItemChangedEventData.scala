package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.IItemStack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity changes the item carried in their hand.
  */
trait IEntityCarriedItemChangedEventData extends StObject {
  
  /**
    * The item that is now in the entities hands
    */
  var carried_item: IItemStack
  
  /**
    * The entity that changed what they were carrying
    */
  var entity: IEntity
  
  /**
    * The item that was previously in the entities hands
    */
  var previous_carried_item: IItemStack
}
object IEntityCarriedItemChangedEventData {
  
  inline def apply(carried_item: IItemStack, entity: IEntity, previous_carried_item: IItemStack): IEntityCarriedItemChangedEventData = {
    val __obj = js.Dynamic.literal(carried_item = carried_item.asInstanceOf[js.Any], entity = entity.asInstanceOf[js.Any], previous_carried_item = previous_carried_item.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityCarriedItemChangedEventData]
  }
  
  extension [Self <: IEntityCarriedItemChangedEventData](x: Self) {
    
    inline def setCarried_item(value: IItemStack): Self = StObject.set(x, "carried_item", value.asInstanceOf[js.Any])
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setPrevious_carried_item(value: IItemStack): Self = StObject.set(x, "previous_carried_item", value.asInstanceOf[js.Any])
  }
}
