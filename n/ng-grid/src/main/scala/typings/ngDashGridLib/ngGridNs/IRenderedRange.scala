package typings
package ngDashGridLib.ngGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderedRange extends js.Object {
  var bottomRow: scala.Double
  var topRow: scala.Double
}

object IRenderedRange {
  @scala.inline
  def apply(bottomRow: scala.Double, topRow: scala.Double): IRenderedRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bottomRow")(bottomRow)
    __obj.updateDynamic("topRow")(topRow)
    __obj.asInstanceOf[IRenderedRange]
  }
}

