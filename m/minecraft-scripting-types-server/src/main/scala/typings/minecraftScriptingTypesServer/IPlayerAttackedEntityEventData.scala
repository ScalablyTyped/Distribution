package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
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
  var attacked_entity: IEntity
  /**
    * The player that attacked an entity
    */
  var player: IEntity
}

object IPlayerAttackedEntityEventData {
  @scala.inline
  def apply(attacked_entity: IEntity, player: IEntity): IPlayerAttackedEntityEventData = {
    val __obj = js.Dynamic.literal(attacked_entity = attacked_entity.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPlayerAttackedEntityEventData]
  }
}

