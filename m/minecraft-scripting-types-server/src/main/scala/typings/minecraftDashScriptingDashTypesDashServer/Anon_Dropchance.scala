package typings.minecraftDashScriptingDashTypesDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dropchance extends js.Object {
  /**
    * The chance that the item in this slot will be dropped
    */
  var drop_chance: Double
  /**
    * The slot number
    */
  var slot: Double
}

object Anon_Dropchance {
  @scala.inline
  def apply(drop_chance: Double, slot: Double): Anon_Dropchance = {
    val __obj = js.Dynamic.literal(drop_chance = drop_chance, slot = slot)
  
    __obj.asInstanceOf[Anon_Dropchance]
  }
}

