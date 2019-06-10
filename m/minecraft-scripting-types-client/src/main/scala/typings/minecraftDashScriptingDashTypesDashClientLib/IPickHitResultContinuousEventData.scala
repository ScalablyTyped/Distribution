package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered every update and tells you what entity the mouse pointer is pointing to in the world up to 1000 blocks away.
  */
trait IPickHitResultContinuousEventData extends js.Object {
  /**
    * The entity that was hit or null if it not pointing at an entity
    */
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The position of the entity that was hit or block that was hit
    */
  var position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ
}

object IPickHitResultContinuousEventData {
  @scala.inline
  def apply(
    entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    position: minecraftDashScriptingDashTypesDashSharedLib.VectorXYZ
  ): IPickHitResultContinuousEventData = {
    val __obj = js.Dynamic.literal(entity = entity, position = position)
  
    __obj.asInstanceOf[IPickHitResultContinuousEventData]
  }
}

