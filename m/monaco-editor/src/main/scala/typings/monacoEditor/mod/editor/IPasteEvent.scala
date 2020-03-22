package typings.monacoEditor.mod.editor

import typings.monacoEditor.mod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPasteEvent extends js.Object {
  val mode: String | Null
  val range: Range
}

object IPasteEvent {
  @scala.inline
  def apply(range: Range, mode: String = null): IPasteEvent = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPasteEvent]
  }
}

