package typings
package pgDashMinifyLib.pgDashMinifyMod.pgMinifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IErrorPosition extends js.Object {
  var column: scala.Double
  var line: scala.Double
}

object IErrorPosition {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double): IErrorPosition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[IErrorPosition]
  }
}

