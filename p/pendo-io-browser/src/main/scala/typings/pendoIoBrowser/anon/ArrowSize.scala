package typings.pendoIoBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrowSize extends js.Object {
  var arrowSize: js.UndefOr[Double] = js.undefined
}

object ArrowSize {
  @scala.inline
  def apply(arrowSize: js.UndefOr[Double] = js.undefined): ArrowSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(arrowSize)) __obj.updateDynamic("arrowSize")(arrowSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrowSize]
  }
}

