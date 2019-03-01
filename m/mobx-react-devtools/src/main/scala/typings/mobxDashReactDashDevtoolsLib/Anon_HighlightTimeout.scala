package typings
package mobxDashReactDashDevtoolsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_HighlightTimeout extends js.Object {
  var highlightTimeout: js.UndefOr[scala.Double] = js.undefined
}

object Anon_HighlightTimeout {
  @scala.inline
  def apply(highlightTimeout: scala.Int | scala.Double = null): Anon_HighlightTimeout = {
    val __obj = js.Dynamic.literal()
    if (highlightTimeout != null) __obj.updateDynamic("highlightTimeout")(highlightTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_HighlightTimeout]
  }
}

