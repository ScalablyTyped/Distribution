package typings.minecraftScriptingTypesServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rangemax extends js.Object {
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

object Rangemax {
  @scala.inline
  def apply(range_max: Double, range_min: Double): Rangemax = {
    val __obj = js.Dynamic.literal(range_max = range_max.asInstanceOf[js.Any], range_min = range_min.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rangemax]
  }
}

