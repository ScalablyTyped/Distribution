package typings
package minecraftDashScriptingDashTypesDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is fired whenever a player joins the world. The event data contains the player entity object.
  */
trait IClientEnteredWorldEventData extends js.Object {
  /**
    * the player entering the world
    */
  var player: minecraftDashScriptingDashTypesDashSharedLib.IEntity
}

object IClientEnteredWorldEventData {
  @scala.inline
  def apply(player: minecraftDashScriptingDashTypesDashSharedLib.IEntity): IClientEnteredWorldEventData = {
    val __obj = js.Dynamic.literal(player = player)
  
    __obj.asInstanceOf[IClientEnteredWorldEventData]
  }
}

