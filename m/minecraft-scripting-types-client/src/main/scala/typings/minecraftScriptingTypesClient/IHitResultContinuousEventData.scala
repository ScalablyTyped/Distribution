package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.IEntity
import typings.minecraftScriptingTypesShared.VectorXYZ
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered every update and tells you what entity the reticle is pointing to in the world up to 1000 blocks away.
  */
trait IHitResultContinuousEventData extends StObject {
  
  /**
    * The entity that was hit or null if it not pointing at an entity
    */
  var entity: IEntity
  
  /**
    * The position of the entity that was hit or block that was hit
    */
  var position: VectorXYZ
}
object IHitResultContinuousEventData {
  
  @scala.inline
  def apply(entity: IEntity, position: VectorXYZ): IHitResultContinuousEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHitResultContinuousEventData]
  }
  
  @scala.inline
  implicit class IHitResultContinuousEventDataMutableBuilder[Self <: IHitResultContinuousEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: VectorXYZ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
