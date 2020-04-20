package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity becomes a rider on another entity.
  */
trait IEntityStartRidingEventData extends js.Object {
  /**
    * The rider
    */
  var entity: IEntity
  /**
    * The entity being ridden
    */
  var ride: IEntity
}

object IEntityStartRidingEventData {
  @scala.inline
  def apply(entity: IEntity, ride: IEntity): IEntityStartRidingEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], ride = ride.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityStartRidingEventData]
  }
}

