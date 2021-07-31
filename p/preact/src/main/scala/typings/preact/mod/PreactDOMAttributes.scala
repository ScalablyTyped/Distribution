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
  
  @scala.inline
  def apply(): PreactDOMAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreactDOMAttributes]
  }
  
  @scala.inline
  implicit class PreactDOMAttributesMutableBuilder[Self <: PreactDOMAttributes] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: ComponentChildren): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenNull: Self = StObject.set(x, "children", null)
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setChildrenVarargs(value: ComponentChild*): Self = StObject.set(x, "children", js.Array(value :_*))
    
    @scala.inline
    def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
  }
}
