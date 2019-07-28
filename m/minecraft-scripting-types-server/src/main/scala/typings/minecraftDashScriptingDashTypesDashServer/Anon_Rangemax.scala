package typings.minecraftDashScriptingDashTypesDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rangemax extends js.Object {
  /**
    * The maximum amount of damage the entity will deal
    * @default 0.0
    */
  var range_max: Double
  /**
    * The minimum amount of damage the entity will deal
    * @default 0.0
    */
  var range_min: Double
}

object Anon_Rangemax {
  @scala.inline
  def apply(range_max: Double, range_min: Double): Anon_Rangemax = {
    val __obj = js.Dynamic.literal(range_max = range_max, range_min = range_min)
  
    __obj.asInstanceOf[Anon_Rangemax]
  }
}

