package typings.pdfkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOrigin extends js.Object {
  var origin: js.UndefOr[js.Array[Double]] = js.undefined
}

object AnonOrigin {
  @scala.inline
  def apply(origin: js.Array[Double] = null): AnonOrigin = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOrigin]
  }
}

