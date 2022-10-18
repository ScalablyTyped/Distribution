package typings.nodeRedEditorClient.anon

import typings.nodeRedEditorClient.mod.global.JQuery
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.left
import typings.nodeRedEditorClient.nodeRedEditorClientStrings.right
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignElement extends StObject {
  
  var align: js.UndefOr[left | right] = js.undefined
  
  var element: JQuery[HTMLElement]
  
  var id: String
}
object AlignElement {
  
  inline def apply(element: JQuery[HTMLElement], id: String): AlignElement = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignElement]
  }
  
  extension [Self <: AlignElement](x: Self) {
    
    inline def setAlign(value: left | right): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    inline def setElement(value: JQuery[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
