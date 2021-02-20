package typings.monacoEditor.mod.editor

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.fill
import typings.monacoEditor.monacoEditorStrings.fit
import typings.monacoEditor.monacoEditorStrings.left
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.proportional
import typings.monacoEditor.monacoEditorStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorMinimapOptions>> */
@js.native
trait EditorMinimapOptions extends StObject {
  
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
  implicit class EditorMinimapOptionsMutableBuilder[Self <: EditorMinimapOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxColumn(value: Double): Self = StObject.set(x, "maxColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderCharacters(value: Boolean): Self = StObject.set(x, "renderCharacters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowSlider(value: always | mouseover): Self = StObject.set(x, "showSlider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSide(value: right | left): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: proportional | fill | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
