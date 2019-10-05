package typings.monacoDashEditor.monacoDashEditorMod.editor

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
    val __obj = js.Dynamic.literal(inDiffEditor = inDiffEditor, isDominatedByLongLines = isDominatedByLongLines, isViewportWrapping = isViewportWrapping, isWordWrapMinified = isWordWrapMinified, wordWrapBreakAfterCharacters = wordWrapBreakAfterCharacters, wordWrapBreakBeforeCharacters = wordWrapBreakBeforeCharacters, wordWrapBreakObtrusiveCharacters = wordWrapBreakObtrusiveCharacters, wrappingColumn = wrappingColumn, wrappingIndent = wrappingIndent)
  
    __obj.asInstanceOf[EditorWrappingInfo]
  }
}

