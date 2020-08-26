package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity stops riding another entity.
  */
@js.native
trait IEntityStopRidingEventData extends js.Object {
  /**
    * The entity that was riding another entity
    */
  var entity: IEntity = js.native
  /**
    * If true, the rider stopped riding because they are now dead
    */
  var entity_is_being_destroyed: Boolean = js.native
  /**
    * If true, the rider stopped riding by their own decision
    */
  var exit_from_rider: Boolean = js.native
  /**
    * If true, the rider stopped riding because they are now riding a different entity
    */
  var switching_rides: Boolean = js.native
}

object IEntityStopRidingEventData {
  @scala.inline
  def apply(
    entity: IEntity,
    entity_is_being_destroyed: Boolean,
    exit_from_rider: Boolean,
    switching_rides: Boolean
  ): IEntityStopRidingEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any], entity_is_being_destroyed = entity_is_being_destroyed.asInstanceOf[js.Any], exit_from_rider = exit_from_rider.asInstanceOf[js.Any], switching_rides = switching_rides.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEntityStopRidingEventData]
  }
  @scala.inline
  implicit class IEntityStopRidingEventDataOps[Self <: IEntityStopRidingEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEntity(value: IEntity): Self = this.set("entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntity_is_being_destroyed(value: Boolean): Self = this.set("entity_is_being_destroyed", value.asInstanceOf[js.Any])
    @scala.inline
    def setExit_from_rider(value: Boolean): Self = this.set("exit_from_rider", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitching_rides(value: Boolean): Self = this.set("switching_rides", value.asInstanceOf[js.Any])
  }
  
}

