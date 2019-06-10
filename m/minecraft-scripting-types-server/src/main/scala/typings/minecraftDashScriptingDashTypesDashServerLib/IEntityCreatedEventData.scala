package typings
package minecraftDashScriptingDashTypesDashServerLib

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
  var entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IEntityCreatedEventData {
  @scala.inline
  def apply(entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity): IEntityCreatedEventData = {
    val __obj = js.Dynamic.literal(entity = entity)
  
    __obj.asInstanceOf[IEntityCreatedEventData]
  }
}

