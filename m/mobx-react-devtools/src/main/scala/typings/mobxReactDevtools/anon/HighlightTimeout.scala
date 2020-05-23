package typings.mobxReactDevtools.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlightTimeout extends js.Object {
  var highlightTimeout: js.UndefOr[Double] = js.undefined
}

object HighlightTimeout {
  @scala.inline
  def apply(highlightTimeout: js.UndefOr[Double] = js.undefined): HighlightTimeout = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(highlightTimeout)) __obj.updateDynamic("highlightTimeout")(highlightTimeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightTimeout]
  }
}

