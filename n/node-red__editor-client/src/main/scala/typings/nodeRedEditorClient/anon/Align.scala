package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.right
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Align extends StObject {
  
  var align: js.UndefOr[left | right] = js.undefined
  
  var element: JQuery[HTMLElement]
  
  var id: String
}
object Align {
  
  @scala.inline
  def apply(element: JQuery[HTMLElement], id: String): Align = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Align]
  }
  
  @scala.inline
  implicit class AlignMutableBuilder[Self <: Align] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
