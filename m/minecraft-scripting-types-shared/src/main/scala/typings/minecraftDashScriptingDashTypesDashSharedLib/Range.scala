package typings
package minecraftDashScriptingDashTypesDashSharedLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Range extends js.Object {
  var range_max: scala.Double
  var range_min: scala.Double
}

object Range {
  @scala.inline
  def apply(range_max: scala.Double, range_min: scala.Double): Range = {
    val __obj = js.Dynamic.literal(range_max = range_max, range_min = range_min)
  
    __obj.asInstanceOf[Range]
  }
}

