package typings.minecraftDashScriptingDashTypesDashShared

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var range_max: Double
  var range_min: Double
}

object Range {
  @scala.inline
  def apply(range_max: Double, range_min: Double): Range = {
    val __obj = js.Dynamic.literal(range_max = range_max.asInstanceOf[js.Any], range_min = range_min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Range]
  }
}

