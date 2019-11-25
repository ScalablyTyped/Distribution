package typings.minecraftDashScriptingDashTypesDashClient

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import typings.minecraftDashScriptingDashTypesDashShared.VectorXYZ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered every update and tells you what entity the reticle is pointing to in the world up to 1000 blocks away.
  */
trait IHitResultContinuousEventData extends js.Object {
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
}

