package typings.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDropchance extends js.Object {
  /**
    * The chance that the item in this slot will be dropped
    */
  var drop_chance: Double
  /**
    * The slot number
    */
  var slot: Double
}

object AnonDropchance {
  @scala.inline
  def apply(drop_chance: Double, slot: Double): AnonDropchance = {
    val __obj = js.Dynamic.literal(drop_chance = drop_chance.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDropchance]
  }
}

