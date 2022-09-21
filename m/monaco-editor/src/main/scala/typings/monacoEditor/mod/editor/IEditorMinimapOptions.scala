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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IEditorMinimapOptions extends StObject {
  
  /**
    * Control the rendering of minimap.
    */
  var autohide: js.UndefOr[Boolean] = js.undefined
  
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
    * Relative size of the font in the minimap. Defaults to 1.
    */
  var scale: js.UndefOr[Double] = js.undefined
  
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
  
  /**
    * Control the minimap rendering mode.
    * Defaults to 'actual'.
    */
  var size: js.UndefOr[proportional | fill | fit] = js.undefined
}
object IEditorMinimapOptions {
  
  inline def apply(): IEditorMinimapOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IEditorMinimapOptions]
  }
  
  extension [Self <: IEditorMinimapOptions](x: Self) {
    
    inline def setAutohide(value: Boolean): Self = StObject.set(x, "autohide", value.asInstanceOf[js.Any])
    
    inline def setAutohideUndefined: Self = StObject.set(x, "autohide", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setMaxColumn(value: Double): Self = StObject.set(x, "maxColumn", value.asInstanceOf[js.Any])
    
    inline def setMaxColumnUndefined: Self = StObject.set(x, "maxColumn", js.undefined)
    
    inline def setRenderCharacters(value: Boolean): Self = StObject.set(x, "renderCharacters", value.asInstanceOf[js.Any])
    
    inline def setRenderCharactersUndefined: Self = StObject.set(x, "renderCharacters", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setShowSlider(value: always | mouseover): Self = StObject.set(x, "showSlider", value.asInstanceOf[js.Any])
    
    inline def setShowSliderUndefined: Self = StObject.set(x, "showSlider", js.undefined)
    
    inline def setSide(value: right | left): Self = StObject.set(x, "side", value.asInstanceOf[js.Any])
    
    inline def setSideUndefined: Self = StObject.set(x, "side", js.undefined)
    
    inline def setSize(value: proportional | fill | fit): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
