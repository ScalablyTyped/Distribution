package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.left
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditorMinimapOptions extends js.Object {
  /**
    * Enable the rendering of the minimap.
    * Defaults to true.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Limit the width of the minimap to render at most a certain number of columns.
    * Defaults to 120.
    */
  var maxColumn: js.UndefOr[Double] = js.native
  /**
    * Render the actual text on a line (as opposed to color blocks).
    * Defaults to true.
    */
  var renderCharacters: js.UndefOr[Boolean] = js.native
  /**
    * Relative size of the font in the minimap. Defaults to 1.
    */
  var scale: js.UndefOr[Double] = js.native
  /**
    * Control the rendering of the minimap slider.
    * Defaults to 'mouseover'.
    */
  var showSlider: js.UndefOr[always | mouseover] = js.native
  /**
    * Control the side of the minimap in editor.
    * Defaults to 'right'.
    */
  var side: js.UndefOr[right | left] = js.native
}

object IEditorMinimapOptions {
  @scala.inline
  def apply(): IEditorMinimapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorMinimapOptions]
  }
  @scala.inline
  implicit class IEditorMinimapOptionsOps[Self <: IEditorMinimapOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setMaxColumn(value: Double): Self = this.set("maxColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxColumn: Self = this.set("maxColumn", js.undefined)
    @scala.inline
    def setRenderCharacters(value: Boolean): Self = this.set("renderCharacters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRenderCharacters: Self = this.set("renderCharacters", js.undefined)
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScale: Self = this.set("scale", js.undefined)
    @scala.inline
    def setShowSlider(value: always | mouseover): Self = this.set("showSlider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSlider: Self = this.set("showSlider", js.undefined)
    @scala.inline
    def setSide(value: right | left): Self = this.set("side", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSide: Self = this.set("side", js.undefined)
  }
  
}

