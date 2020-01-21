package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorWrappingInfo extends js.Object {
  val inDiffEditor: Boolean
  val isDominatedByLongLines: Boolean
  val isViewportWrapping: Boolean
  val isWordWrapMinified: Boolean
  val wordWrapBreakAfterCharacters: String
  val wordWrapBreakBeforeCharacters: String
  val wordWrapBreakObtrusiveCharacters: String
  val wrappingColumn: Double
  val wrappingIndent: WrappingIndent
}

object EditorWrappingInfo {
  @scala.inline
  def apply(
    inDiffEditor: Boolean,
    isDominatedByLongLines: Boolean,
    isViewportWrapping: Boolean,
    isWordWrapMinified: Boolean,
    wordWrapBreakAfterCharacters: String,
    wordWrapBreakBeforeCharacters: String,
    wordWrapBreakObtrusiveCharacters: String,
    wrappingColumn: Double,
    wrappingIndent: WrappingIndent
  ): EditorWrappingInfo = {
    val __obj = js.Dynamic.literal(inDiffEditor = inDiffEditor.asInstanceOf[js.Any], isDominatedByLongLines = isDominatedByLongLines.asInstanceOf[js.Any], isViewportWrapping = isViewportWrapping.asInstanceOf[js.Any], isWordWrapMinified = isWordWrapMinified.asInstanceOf[js.Any], wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters.asInstanceOf[js.Any], wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters.asInstanceOf[js.Any], wordWrapBreakObtrusiveCharacters = wordWrapBreakObtrusiveCharacters.asInstanceOf[js.Any], wrappingColumn = wrappingColumn.asInstanceOf[js.Any], wrappingIndent = wrappingIndent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EditorWrappingInfo]
  }
}

