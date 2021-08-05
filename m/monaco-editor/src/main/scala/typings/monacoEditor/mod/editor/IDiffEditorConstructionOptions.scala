package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDiffEditorConstructionOptions
  extends StObject
     with IDiffEditorOptions {
  
  /**
    * Place overflow widgets inside an external DOM node.
    * Defaults to an internal DOM node.
    */
  var overflowWidgetsDomNode: js.UndefOr[HTMLElement] = js.undefined
  
  /**
    * Initial theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    * To switch a theme, use `monaco.editor.setTheme`
    */
  var theme: js.UndefOr[String] = js.undefined
}
object IDiffEditorConstructionOptions {
  
  inline def apply(): IDiffEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorConstructionOptions]
  }
  
  extension [Self <: IDiffEditorConstructionOptions](x: Self) {
    
    inline def setOverflowWidgetsDomNode(value: HTMLElement): Self = StObject.set(x, "overflowWidgetsDomNode", value.asInstanceOf[js.Any])
    
    inline def setOverflowWidgetsDomNodeUndefined: Self = StObject.set(x, "overflowWidgetsDomNode", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
