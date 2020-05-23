package typings.pdfkit.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Origin extends js.Object {
  var origin: js.UndefOr[js.Array[Double]] = js.undefined
}

object Origin {
  @scala.inline
  def apply(origin: js.Array[Double] = null): Origin = {
    val __obj = js.Dynamic.literal()
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Origin]
  }
}

