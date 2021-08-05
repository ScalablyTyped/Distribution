package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity stops riding another entity.
  */
trait IEntityStopRidingEventData extends StObject {
  
  /**
    * The entity that was riding another entity
    */
  var entity: IEntity
  
  /**
    * If true, the rider stopped riding because they are now dead
    */
  var entity_is_being_destroyed: Boolean
  
  /**
    * If true, the rider stopped riding by their own decision
    */
  var exit_from_rider: Boolean
  
  /**
    * If true, the rider stopped riding because they are now riding a different entity
    */
  var switching_rides: Boolean
}
object IEntityStopRidingEventData {
  
  inline def apply(
    entity: IEntity,
    entity_is_being_destroyed: Boolean,
    exit_from_rider: Boolean,
    switching_rides: Boolean
  ): IEntityStopRidingEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], entity_is_being_destroyed = entity_is_being_destroyed.asInstanceOf[js.Any], exit_from_rider = exit_from_rider.asInstanceOf[js.Any], switching_rides = switching_rides.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityStopRidingEventData]
  }
  
  extension [Self <: IEntityStopRidingEventData](x: Self) {
    
    inline def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    inline def setEntity_is_being_destroyed(value: Boolean): Self = StObject.set(x, "entity_is_being_destroyed", value.asInstanceOf[js.Any])
    
    inline def setExit_from_rider(value: Boolean): Self = StObject.set(x, "exit_from_rider", value.asInstanceOf[js.Any])
    
    inline def setSwitching_rides(value: Boolean): Self = StObject.set(x, "switching_rides", value.asInstanceOf[js.Any])
  }
}
