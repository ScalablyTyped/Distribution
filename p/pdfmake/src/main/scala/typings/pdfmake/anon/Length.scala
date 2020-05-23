package typings.pdfmake.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Length extends js.Object {
  var length: Double
  var space: js.UndefOr[Double] = js.undefined
}

object Length {
  @scala.inline
  def apply(length: Double, space: js.UndefOr[Double] = js.undefined): Length = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Length]
  }
}

