package typings.pdfmake

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLength extends js.Object {
  var length: Double
  var space: js.UndefOr[Double] = js.undefined
}

object AnonLength {
  @scala.inline
  def apply(length: Double, space: Int | Double = null): AnonLength = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLength]
  }
}

