package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This event is triggered whenever an entity becomes a rider on another entity.
  */
@js.native
trait IEntityStartRidingEventData extends StObject {
  
  /**
    * The rider
    */
  var entity: IEntity = js.native
  
  /**
    * The entity being ridden
    */
  var ride: IEntity = js.native
}
object IEntityStartRidingEventData {
  
  @scala.inline
  def apply(entity: IEntity, ride: IEntity): IEntityStartRidingEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], ride = ride.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityStartRidingEventData]
  }
  
  @scala.inline
  implicit class IEntityStartRidingEventDataMutableBuilder[Self <: IEntityStartRidingEventData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntity(value: IEntity): Self = StObject.set(x, "entity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRide(value: IEntity): Self = StObject.set(x, "ride", value.asInstanceOf[js.Any])
  }
}
