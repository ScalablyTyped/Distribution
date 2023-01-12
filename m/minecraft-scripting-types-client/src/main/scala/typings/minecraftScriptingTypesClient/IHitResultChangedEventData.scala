package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever the reticle changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
  */
trait IHitResultChangedEventData extends StObject {
  
  /**
    * The entity that was hit or null if it fired when moving off of an entity
    */
  var entity: IEntity
  
  /**
    * The position of the entity that was hit or null if it fired when moving off an entity
    */
  var position: VectorXYZ | Null
}
object IHitResultChangedEventData {
  
  inline def apply(entity: IEntity): IHitResultChangedEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], position = null)
    __obj.asInstanceOf[IHitResultChangedEventData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IHitResultChangedEventData] (val x: Self) extends AnyVal {
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: VectorXYZ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionNull: Self = StObject.set(x, "position", null)
  }
}
