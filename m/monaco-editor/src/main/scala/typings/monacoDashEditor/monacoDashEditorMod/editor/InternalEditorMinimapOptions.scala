package typings.monacoDashEditor.monacoDashEditorMod.editor

import typings.monacoDashEditor.monacoDashEditorStrings.always
import typings.monacoDashEditor.monacoDashEditorStrings.left
import typings.monacoDashEditor.monacoDashEditorStrings.mouseover
import typings.monacoDashEditor.monacoDashEditorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalEditorMinimapOptions extends js.Object {
  val enabled: Boolean
  val maxColumn: Double
  val renderCharacters: Boolean
  val showSlider: always | mouseover
  val side: right | left
}

object InternalEditorMinimapOptions {
  @scala.inline
  def apply(
    enabled: Boolean,
    maxColumn: Double,
    renderCharacters: Boolean,
    showSlider: always | mouseover,
    side: right | left
  ): InternalEditorMinimapOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled, maxColumn = maxColumn, renderCharacters = renderCharacters, showSlider = showSlider.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[InternalEditorMinimapOptions]
  }
}

