package typings.minecraftDashScriptingDashTypesDashServer

import typings.minecraftDashScriptingDashTypesDashShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever an entity dies. This won't be triggered when an entity is removed (such as when using destroyEntity).
  */
trait IEntityDeathEventData extends js.Object {
  /**
    * The entity that died
    */
  var entity: IEntity
}

object IEntityDeathEventData {
  @scala.inline
  def apply(entity: IEntity): IEntityDeathEventData = {
    val __obj = js.Dynamic.literal(entity = entity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IEntityDeathEventData]
  }
}

