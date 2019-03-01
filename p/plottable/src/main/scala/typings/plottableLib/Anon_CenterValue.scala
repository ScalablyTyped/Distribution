package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterValue extends js.Object {
  var centerValue: Anon_CenterX
  var zoomAmount: scala.Double
}

object Anon_CenterValue {
  @scala.inline
  def apply(centerValue: Anon_CenterX, zoomAmount: scala.Double): Anon_CenterValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("centerValue")(centerValue)
    __obj.updateDynamic("zoomAmount")(zoomAmount)
    __obj.asInstanceOf[Anon_CenterValue]
  }
}

