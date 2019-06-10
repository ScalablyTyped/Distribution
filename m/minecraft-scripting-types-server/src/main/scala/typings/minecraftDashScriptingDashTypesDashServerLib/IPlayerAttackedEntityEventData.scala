package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player attacks an entity.
  */
trait IPlayerAttackedEntityEventData extends js.Object {
  /**
    * The entity that was attacked by the player
    */
  var attacked_entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  /**
    * The player that attacked an entity
    */
  var player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IPlayerAttackedEntityEventData {
  @scala.inline
  def apply(
    attacked_entity: minecraftDashScriptingDashTypesDashSharedLib.IEntity,
    player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
  ): IPlayerAttackedEntityEventData = {
    val __obj = js.Dynamic.literal(attacked_entity = attacked_entity, player = player)
  
    __obj.asInstanceOf[IPlayerAttackedEntityEventData]
  }
}

