package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorWrappingInfo extends js.Object {
  val isDominatedByLongLines: Boolean
  val isViewportWrapping: Boolean
  val isWordWrapMinified: Boolean
  val wrappingColumn: Double
}

object EditorWrappingInfo {
  @scala.inline
  def apply(
    isDominatedByLongLines: Boolean,
    isViewportWrapping: Boolean,
    isWordWrapMinified: Boolean,
    wrappingColumn: Double
  ): EditorWrappingInfo = {
    val __obj = js.Dynamic.literal(isDominatedByLongLines = isDominatedByLongLines.asInstanceOf[js.Any], isViewportWrapping = isViewportWrapping.asInstanceOf[js.Any], isWordWrapMinified = isWordWrapMinified.asInstanceOf[js.Any], wrappingColumn = wrappingColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorWrappingInfo]
  }
}

