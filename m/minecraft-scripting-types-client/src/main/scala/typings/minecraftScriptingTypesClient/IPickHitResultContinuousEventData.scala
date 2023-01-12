package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered every update and tells you what entity the mouse pointer is pointing to in the world up to 1000 blocks away.
  */
trait IPickHitResultContinuousEventData extends StObject {
  
  /**
    * The entity that was hit or null if it not pointing at an entity
    */
  var entity: IEntity
  
  /**
    * The position of the entity that was hit or block that was hit
    */
  var position: VectorXYZ
}
object IPickHitResultContinuousEventData {
  
  inline def apply(entity: IEntity, position: VectorXYZ): IPickHitResultContinuousEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPickHitResultContinuousEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPickHitResultContinuousEventData] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: VectorXYZ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
