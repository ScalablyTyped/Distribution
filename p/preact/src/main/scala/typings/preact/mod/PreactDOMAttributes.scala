package typings.preact.mod

import typings.preact.anon.Html
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreactDOMAttributes extends StObject {
  
  var children: js.UndefOr[ComponentChildren] = js.undefined
  
  var dangerouslySetInnerHTML: js.UndefOr[Html] = js.undefined
}
object PreactDOMAttributes {
  
  inline def apply(): PreactDOMAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreactDOMAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreactDOMAttributes] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    inline def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
  }
}
