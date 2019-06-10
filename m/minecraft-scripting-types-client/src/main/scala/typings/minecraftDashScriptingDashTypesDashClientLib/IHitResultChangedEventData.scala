package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever the reticle changes from pointing at a block or air to pointing at an entity and the other way around. Up to 1000 blocks away.
  */
trait IHitResultChangedEventData extends js.Object {
  /**
    * The entity that was hit or null if it fired when moving off of an entity
    */
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The position of the entity that was hit or null if it fired when moving off an entity
    */
  var position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ | scala.Null
}

object IHitResultChangedEventData {
  @scala.inline
  def apply(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ = null
  ): IHitResultChangedEventData = {
    val __obj = js.Dynamic.literal(entity = entity)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IHitResultChangedEventData]
  }
}

