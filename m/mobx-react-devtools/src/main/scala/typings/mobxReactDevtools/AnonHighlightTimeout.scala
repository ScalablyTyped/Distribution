package typings.mobxReactDevtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHighlightTimeout extends js.Object {
  var highlightTimeout: js.UndefOr[Double] = js.undefined
}

object AnonHighlightTimeout {
  @scala.inline
  def apply(highlightTimeout: Int | Double = null): AnonHighlightTimeout = {
    val __obj = js.Dynamic.literal()
    if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHighlightTimeout]
  }
}

