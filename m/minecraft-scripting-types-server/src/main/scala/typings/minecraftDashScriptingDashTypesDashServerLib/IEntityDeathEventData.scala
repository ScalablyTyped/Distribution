package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IEntityDeathEventData {
  @scala.inline
  def apply(entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity): IEntityDeathEventData = {
    val __obj = js.Dynamic.literal(entity = entity)
  
    __obj.asInstanceOf[IEntityDeathEventData]
  }
}

