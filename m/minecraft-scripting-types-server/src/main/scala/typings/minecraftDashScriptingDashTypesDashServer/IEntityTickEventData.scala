package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity is ticked. This event will not fire when a player is ticked.
  */
trait IEntityTickEventData extends js.Object {
  /**
    * The entity that was ticked
    */
  var entity: IEntity
}

object IEntityTickEventData {
  @scala.inline
  def apply(entity: IEntity): IEntityTickEventData = {
    val __obj = js.Dynamic.literal(entity = entity)
  
    __obj.asInstanceOf[IEntityTickEventData]
  }
}

