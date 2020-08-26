package typings.minecraftScriptingTypesServer

import typings.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is triggered whenever a player attacks an entity.
  */
@js.native
trait IPlayerAttackedEntityEventData extends js.Object {
  /**
    * The entity that was attacked by the player
    */
  var attacked_entity: IEntity = js.native
  /**
    * The player that attacked an entity
    */
  var player: IEntity = js.native
}

object IPlayerAttackedEntityEventData {
  @scala.inline
  def apply(attacked_entity: IEntity, player: IEntity): IPlayerAttackedEntityEventData = {
    val __obj = js.Dynamic.literal(attacked_entity = attacked_entity.asInstanceOf[js.Any], player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayerAttackedEntityEventData]
  }
  @scala.inline
  implicit class IPlayerAttackedEntityEventDataOps[Self <: IPlayerAttackedEntityEventData] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttacked_entity(value: IEntity): Self = this.set("attacked_entity", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlayer(value: IEntity): Self = this.set("player", value.asInstanceOf[js.Any])
  }
  
}

