package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.left
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEditorMinimapOptions extends js.Object {
  /**
    * Enable the rendering of the minimap.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Limit the width of the minimap to render at most a certain number of columns.
    * Defaults to 120.
    */
  var maxColumn: js.UndefOr[Double] = js.undefined
  /**
    * Render the actual text on a line (as opposed to color blocks).
    * Defaults to true.
    */
  var renderCharacters: js.UndefOr[Boolean] = js.undefined
  /**
    * Control the rendering of the minimap slider.
    * Defaults to 'mouseover'.
    */
  var showSlider: js.UndefOr[always | mouseover] = js.undefined
  /**
    * Control the side of the minimap in editor.
    * Defaults to 'right'.
    */
  var side: js.UndefOr[right | left] = js.undefined
}

object IEditorMinimapOptions {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    maxColumn: Int | Double = null,
    renderCharacters: js.UndefOr[Boolean] = js.undefined,
    showSlider: always | mouseover = null,
    side: right | left = null
  ): IEditorMinimapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (maxColumn != null) __obj.updateDynamic("maxColumn")(maxColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(renderCharacters)) __obj.updateDynamic("renderCharacters")(renderCharacters.asInstanceOf[js.Any])
    if (showSlider != null) __obj.updateDynamic("showSlider")(showSlider.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEditorMinimapOptions]
  }
}

