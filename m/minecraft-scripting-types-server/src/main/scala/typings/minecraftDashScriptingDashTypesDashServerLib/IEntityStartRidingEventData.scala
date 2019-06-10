package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The entity being ridden
    */
  var ride: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IEntityStartRidingEventData {
  @scala.inline
  def apply(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    ride: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  ): IEntityStartRidingEventData = {
    val __obj = js.Dynamic.literal(entity = entity, ride = ride)
  
    __obj.asInstanceOf[IEntityStartRidingEventData]
  }
}

