package typings.mobxDashReactDashDevtools

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HighlightTimeout extends js.Object {
  var highlightTimeout: js.UndefOr[Double] = js.undefined
}

object Anon_HighlightTimeout {
  @scala.inline
  def apply(highlightTimeout: Int | Double = null): Anon_HighlightTimeout = {
    val __obj = js.Dynamic.literal()
    if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HighlightTimeout]
  }
}

