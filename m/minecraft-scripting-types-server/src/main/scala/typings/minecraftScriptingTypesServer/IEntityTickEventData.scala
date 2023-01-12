package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
  */
trait IEntityTickEventData extends StObject {
  
  /**
    * The entity that was ticked
    */
  var entity: IEntity
}
object IEntityTickEventData {
  
  inline def apply(entity: IEntity): IEntityTickEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityTickEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEntityTickEventData] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
