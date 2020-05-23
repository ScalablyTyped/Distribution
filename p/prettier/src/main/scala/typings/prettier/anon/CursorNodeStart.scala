package typings.prettier.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CursorNodeStart extends js.Object {
  var cursorNodeStart: js.UndefOr[Double] = js.undefined
  var cursorNodeText: js.UndefOr[String] = js.undefined
  var formatted: String
}

object CursorNodeStart {
  @scala.inline
  def apply(
    formatted: String,
    cursorNodeStart: js.UndefOr[Double] = js.undefined,
    cursorNodeText: String = null
  ): CursorNodeStart = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
    if (!js.isUndefined(cursorNodeStart)) __obj.updateDynamic("cursorNodeStart")(cursorNodeStart.get.asInstanceOf[js.Any])
    if (cursorNodeText != null) __obj.updateDynamic("cursorNodeText")(cursorNodeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CursorNodeStart]
  }
}

