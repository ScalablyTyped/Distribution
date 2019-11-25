package typings.prettier

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CursorNodeStart extends js.Object {
  var cursorNodeStart: js.UndefOr[Double] = js.undefined
  var cursorNodeText: js.UndefOr[String] = js.undefined
  var formatted: String
}

object Anon_CursorNodeStart {
  @scala.inline
  def apply(formatted: String, cursorNodeStart: Int | Double = null, cursorNodeText: String = null): Anon_CursorNodeStart = {
    val __obj = js.Dynamic.literal(formatted = formatted.asInstanceOf[js.Any])
    if (cursorNodeStart != null) __obj.updateDynamic("cursorNodeStart")(cursorNodeStart.asInstanceOf[js.Any])
    if (cursorNodeText != null) __obj.updateDynamic("cursorNodeText")(cursorNodeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CursorNodeStart]
  }
}

