package typings.monacoEditor.anon

import typings.monacoEditor.monacoEditorStrings.always
import typings.monacoEditor.monacoEditorStrings.fill
import typings.monacoEditor.monacoEditorStrings.fit
import typings.monacoEditor.monacoEditorStrings.left
import typings.monacoEditor.monacoEditorStrings.mouseover
import typings.monacoEditor.monacoEditorStrings.proportional
import typings.monacoEditor.monacoEditorStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<std.Required<monaco-editor.monaco-editor.editor.IEditorMinimapOptions>> */
trait ReadonlyRequiredIEditorMi extends StObject {
  
  val autohide: Boolean
  
  val enabled: Boolean
  
  val maxColumn: Double
  
  val renderCharacters: Boolean
  
  val scale: Double
  
  val showSlider: always | mouseover
  
  val side: right | left
  
  val size: proportional | fill | fit
}
object ReadonlyRequiredIEditorMi {
  
  inline def apply(
    autohide: Boolean,
    enabled: Boolean,
    maxColumn: Double,
    renderCharacters: Boolean,
    scale: Double,
    showSlider: always | mouseover,
    side: right | left,
    size: proportional | fill | fit
  ): ReadonlyRequiredIEditorMi = {
    val __obj = js.Dynamic.literal(autohide = autohide.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], maxColumn = maxColumn.asInstanceOf[js.Any], renderCharacters = renderCharacters.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], showSlider = showSlider.asInstanceOf[js.Any], side = side.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyRequiredIEditorMi]
  }
  
  extension [Self <: ReadonlyRequiredIEditorMi](x: Self) {
    
    inline def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setMaxColumn(value: Double): Self = StObject.set(x, "maxColumn", value.asInstanceOf[js.Any])
    
    inline def setRenderCharacters(value: Boolean): Self = StObject.set(x, "renderCharacters", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setShowSlider(value: always | mouseover): Self = StObject.set(x, "showSlider", value.asInstanceOf[js.Any])
    
    inline def setSide(value: right | left): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSize(value: proportional | fill | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
