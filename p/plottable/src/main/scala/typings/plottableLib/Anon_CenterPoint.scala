package typings
package plottableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CenterPoint extends js.Object {
  var centerPoint: scala.Double
  var zoomAmount: scala.Double
}

object Anon_CenterPoint {
  @scala.inline
  def apply(centerPoint: scala.Double, zoomAmount: scala.Double): Anon_CenterPoint = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("centerPoint")(centerPoint)
    __obj.updateDynamic("zoomAmount")(zoomAmount)
    __obj.asInstanceOf[Anon_CenterPoint]
  }
}

