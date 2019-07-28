package typings.minecraftDashScriptingDashTypesDashClient

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.VectorXYZ
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
  var entity: IEntity
  /**
    * The position of the entity that was hit or null if it fired when moving off an entity
    */
  var position: VectorXYZ | Null
}

object IHitResultChangedEventData {
  @scala.inline
  def apply(entity: IEntity, position: VectorXYZ = null): IHitResultChangedEventData = {
    val __obj = js.Dynamic.literal(entity = entity)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[IHitResultChangedEventData]
  }
}

