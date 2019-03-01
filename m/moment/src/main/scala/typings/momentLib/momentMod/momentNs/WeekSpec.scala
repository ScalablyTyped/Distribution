package typings
package momentLib.momentMod.momentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WeekSpec extends js.Object {
  var dow: scala.Double
  var doy: scala.Double
}

object WeekSpec {
  @scala.inline
  def apply(dow: scala.Double, doy: scala.Double): WeekSpec = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dow")(dow)
    __obj.updateDynamic("doy")(doy)
    __obj.asInstanceOf[WeekSpec]
  }
}

