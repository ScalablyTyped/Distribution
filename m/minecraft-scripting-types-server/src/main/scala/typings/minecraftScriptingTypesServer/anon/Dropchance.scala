package typings.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dropchance extends js.Object {
  /**
    * The chance that the item in this slot will be dropped
    */
  var drop_chance: Double
  /**
    * The slot number
    */
  var slot: Double
}

object Dropchance {
  @scala.inline
  def apply(drop_chance: Double, slot: Double): Dropchance = {
    val __obj = js.Dynamic.literal(drop_chance = drop_chance.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dropchance]
  }
}

