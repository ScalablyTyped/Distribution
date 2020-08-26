package typings.minecraftScriptingTypesClient

import typings.minecraftScriptingTypesShared.IEntity
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired whenever a player joins the world. The event data contains the player entity object.
  */
@js.native
trait IClientEnteredWorldEventData extends js.Object {
  /**
    * the player entering the world
    */
  var player: IEntity = js.native
}

object IClientEnteredWorldEventData {
  @scala.inline
  def apply(player: IEntity): IClientEnteredWorldEventData = {
    val __obj = js.Dynamic.literal(player = player.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClientEnteredWorldEventData]
  }
  @scala.inline
  implicit class IClientEnteredWorldEventDataOps[Self <: IClientEnteredWorldEventData] (val x: Self) extends AnyVal {
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
    def setPlayer(value: IEntity): Self = this.set("player", value.asInstanceOf[js.Any])
  }
  
}

