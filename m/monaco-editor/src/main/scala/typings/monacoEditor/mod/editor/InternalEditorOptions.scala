package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.altKey
import typings.monacoEditor.monacoEditorStrings.ctrlKey
import typings.monacoEditor.monacoEditorStrings.metaKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monaco-editor", "editor.InternalEditorOptions")
@js.native
class InternalEditorOptions () extends js.Object {
  val _internalEditorOptionsBrand: Unit = js.native
  val autoClosingBrackets: EditorAutoClosingStrategy = js.native
  val autoClosingOvertype: EditorAutoClosingOvertypeStrategy = js.native
  val autoClosingQuotes: EditorAutoClosingStrategy = js.native
  val autoIndent: Boolean = js.native
  val autoSurround: EditorAutoSurroundStrategy = js.native
  val canUseLayerHinting: Boolean = js.native
  val contribInfo: EditorContribOptions = js.native
  val copyWithSyntaxHighlighting: Boolean = js.native
  val dragAndDrop: Boolean = js.native
  val editorClassName: String = js.native
  val emptySelectionClipboard: Boolean = js.native
  val fontInfo: FontInfo = js.native
  val layoutInfo: EditorLayoutInfo = js.native
  val lineHeight: Double = js.native
  val multiCursorMergeOverlapping: Boolean = js.native
  val multiCursorModifier: altKey | ctrlKey | metaKey = js.native
  val pixelRatio: Double = js.native
  val readOnly: Boolean = js.native
  val showUnused: Boolean = js.native
  val tabFocusMode: Boolean = js.native
  val useTabStops: Boolean = js.native
  val viewInfo: InternalEditorViewOptions = js.native
  val wordSeparators: String = js.native
  val wrappingInfo: EditorWrappingInfo = js.native
}

