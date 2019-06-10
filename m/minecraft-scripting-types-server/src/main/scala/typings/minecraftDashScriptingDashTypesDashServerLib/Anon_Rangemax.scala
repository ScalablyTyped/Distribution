package typings
package minecraftDashScriptingDashTypesDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Rangemax extends js.Object {
  /**
    * The maximum amount of damage the entity will deal
    * @default 0.0
    */
  var range_max: scala.Double
  /**
    * The minimum amount of damage the entity will deal
    * @default 0.0
    */
  var range_min: scala.Double
}

object Anon_Rangemax {
  @scala.inline
  def apply(range_max: scala.Double, range_min: scala.Double): Anon_Rangemax = {
    val __obj = js.Dynamic.literal(range_max = range_max, range_min = range_min)
  
    __obj.asInstanceOf[Anon_Rangemax]
  }
}

