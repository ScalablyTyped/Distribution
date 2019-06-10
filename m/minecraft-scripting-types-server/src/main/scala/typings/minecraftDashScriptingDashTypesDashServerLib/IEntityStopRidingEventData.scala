package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity stops riding another entity.
  */
trait IEntityStopRidingEventData extends js.Object {
  /**
    * The entity that was riding another entity
    */
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * If true, the rider stopped riding because they are now dead
    */
  var entity_is_being_destroyed: scala.Boolean
  /**
    * If true, the rider stopped riding by their own decision
    */
  var exit_from_rider: scala.Boolean
  /**
    * If true, the rider stopped riding because they are now riding a different entity
    */
  var switching_rides: scala.Boolean
}

object IEntityStopRidingEventData {
  @scala.inline
  def apply(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    entity_is_being_destroyed: scala.Boolean,
    exit_from_rider: scala.Boolean,
    switching_rides: scala.Boolean
  ): IEntityStopRidingEventData = {
    val __obj = js.Dynamic.literal(entity = entity, entity_is_being_destroyed = entity_is_being_destroyed, exit_from_rider = exit_from_rider, switching_rides = switching_rides)
  
    __obj.asInstanceOf[IEntityStopRidingEventData]
  }
}

