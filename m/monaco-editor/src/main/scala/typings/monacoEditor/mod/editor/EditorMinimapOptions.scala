package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.left
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorMinimapOptions>> */
trait EditorMinimapOptions extends js.Object {
  val enabled: Boolean
  val maxColumn: Double
  val renderCharacters: Boolean
  val scale: Double
  val showSlider: always | mouseover
  val side: right | left
}

object EditorMinimapOptions {
  @scala.inline
  def apply(
    enabled: Boolean,
    maxColumn: Double,
    renderCharacters: Boolean,
    scale: Double,
    showSlider: always | mouseover,
    side: right | left
  ): EditorMinimapOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], maxColumn = maxColumn.asInstanceOf[js.Any], renderCharacters = renderCharacters.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], showSlider = showSlider.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorMinimapOptions]
  }
}

