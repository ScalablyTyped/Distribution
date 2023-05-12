package typings.plotlyJs.anon

import typings.plotlyJs.plotlyJsStrings.animate
import typings.plotlyJs.plotlyJsStrings.relayout
import typings.plotlyJs.plotlyJsStrings.restyle
import typings.plotlyJs.plotlyJsStrings.skip
import typings.plotlyJs.plotlyJsStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<plotly.js.plotly.js.UpdateMenuButton> */
trait PartialUpdateMenuButton extends StObject {
  
  var args: js.UndefOr[js.Array[Any]] = js.undefined
  
  var args2: js.UndefOr[js.Array[Any]] = js.undefined
  
  var execute: js.UndefOr[Boolean] = js.undefined
  
  var label: js.UndefOr[String] = js.undefined
  
  var method: js.UndefOr[restyle | relayout | animate | update | skip] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var templateitemname: js.UndefOr[String] = js.undefined
  
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PartialUpdateMenuButton {
  
  inline def apply(): PartialUpdateMenuButton = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialUpdateMenuButton]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialUpdateMenuButton] (val x: Self) extends AnyVal {
    
    inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    inline def setArgs2(value: js.Array[Any]): Self = StObject.set(x, "args2", value.asInstanceOf[js.Any])
    
    inline def setArgs2Undefined: Self = StObject.set(x, "args2", js.undefined)
    
    inline def setArgs2Varargs(value: Any*): Self = StObject.set(x, "args2", js.Array(value*))
    
    inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
    
    inline def setExecute(value: Boolean): Self = StObject.set(x, "execute", value.asInstanceOf[js.Any])
    
    inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMethod(value: restyle | relayout | animate | update | skip): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setTemplateitemname(value: String): Self = StObject.set(x, "templateitemname", value.asInstanceOf[js.Any])
    
    inline def setTemplateitemnameUndefined: Self = StObject.set(x, "templateitemname", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
