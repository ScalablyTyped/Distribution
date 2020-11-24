package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.fill
import typings.monacoEditor.monacoEditorStrings.fit
import typings.monacoEditor.monacoEditorStrings.left
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.proportional
import typings.monacoEditor.monacoEditorStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorMinimapOptions>> */
@js.native
trait EditorMinimapOptions extends js.Object {
  
  val enabled: Boolean = js.native
  
  val maxColumn: Double = js.native
  
  val renderCharacters: Boolean = js.native
  
  val scale: Double = js.native
  
  val showSlider: always | mouseover = js.native
  
  val side: right | left = js.native
  
  val size: proportional | fill | fit = js.native
}
object EditorMinimapOptions {
  
  @scala.inline
  def apply(
    enabled: Boolean,
    maxColumn: Double,
    renderCharacters: Boolean,
    scale: Double,
    showSlider: always | mouseover,
    side: right | left,
    size: proportional | fill | fit
  ): EditorMinimapOptions = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], maxColumn = maxColumn.asInstanceOf[js.Any], renderCharacters = renderCharacters.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], showSlider = showSlider.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorMinimapOptions]
  }
  
  @scala.inline
  implicit class EditorMinimapOptionsOps[Self <: EditorMinimapOptions] (val x: Self) extends AnyVal {
    
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
    def setMaxColumn(value: Double): Self = this.set("maxColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderCharacters(value: Boolean): Self = this.set("renderCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSlider(value: always | mouseover): Self = this.set("showSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSide(value: right | left): Self = this.set("side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: proportional | fill | fit): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
