package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Element extends StObject {
  
  var element: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  
  var foldStyle: js.UndefOr[String] = js.undefined
  
  var globals: js.UndefOr[js.Object] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[js.Object] = js.undefined
  
  var readOnly: js.UndefOr[Boolean] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object Element {
  
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  
  @scala.inline
  implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setFoldStyle(value: String): Self = StObject.set(x, "foldStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoldStyleUndefined: Self = StObject.set(x, "foldStyle", js.undefined)
    
    @scala.inline
    def setGlobals(value: js.Object): Self = StObject.set(x, "globals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalsUndefined: Self = StObject.set(x, "globals", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
