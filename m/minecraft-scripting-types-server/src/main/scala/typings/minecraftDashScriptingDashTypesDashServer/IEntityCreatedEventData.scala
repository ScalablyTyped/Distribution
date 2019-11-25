package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity is added to the world.
  */
trait IEntityCreatedEventData extends js.Object {
  /**
    * The entity that was just created
    */
  var entity: IEntity
}

object IEntityCreatedEventData {
  @scala.inline
  def apply(entity: IEntity): IEntityCreatedEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntityCreatedEventData]
  }
}

