package typings.ngGrid.ngGrid

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
    val __obj = js.Dynamic.literal(bottomRow = bottomRow.asInstanceOf[js.Any], topRow = topRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderedRange]
  }
}

