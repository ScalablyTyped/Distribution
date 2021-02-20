package typings.monacoEditor.mod.editor

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDiffEditorConstructionOptions extends IDiffEditorOptions {
  
  /**
    * Place overflow widgets inside an external DOM node.
    * Defaults to an internal DOM node.
    */
  var overflowWidgetsDomNode: js.UndefOr[HTMLElement] = js.native
  
  /**
    * Initial theme to be used for rendering.
    * The current out-of-the-box available themes are: 'vs' (default), 'vs-dark', 'hc-black'.
    * You can create custom themes via `monaco.editor.defineTheme`.
    * To switch a theme, use `monaco.editor.setTheme`
    */
  var theme: js.UndefOr[String] = js.native
}
object IDiffEditorConstructionOptions {
  
  @scala.inline
  def apply(): IDiffEditorConstructionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDiffEditorConstructionOptions]
  }
  
  @scala.inline
  implicit class IDiffEditorConstructionOptionsMutableBuilder[Self <: IDiffEditorConstructionOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOverflowWidgetsDomNode(value: HTMLElement): Self = StObject.set(x, "overflowWidgetsDomNode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverflowWidgetsDomNodeUndefined: Self = StObject.set(x, "overflowWidgetsDomNode", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
  }
}
