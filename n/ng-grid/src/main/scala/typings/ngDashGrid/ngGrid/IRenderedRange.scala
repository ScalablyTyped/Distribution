package typings.ngDashGrid.ngGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRenderedRange extends js.Object {
  var bottomRow: Double
  var topRow: Double
}

object IRenderedRange {
  @scala.inline
  def apply(bottomRow: Double, topRow: Double): IRenderedRange = {
    val __obj = js.Dynamic.literal(bottomRow = bottomRow, topRow = topRow)
  
    __obj.asInstanceOf[IRenderedRange]
  }
}

