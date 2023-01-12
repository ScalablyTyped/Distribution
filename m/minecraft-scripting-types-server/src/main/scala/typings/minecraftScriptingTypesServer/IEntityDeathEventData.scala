package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
  */
trait IEntityDeathEventData extends StObject {
  
  /**
    * The entity that died
    */
  var entity: IEntity
}
object IEntityDeathEventData {
  
  inline def apply(entity: IEntity): IEntityDeathEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityDeathEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IEntityDeathEventData] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
  }
}
