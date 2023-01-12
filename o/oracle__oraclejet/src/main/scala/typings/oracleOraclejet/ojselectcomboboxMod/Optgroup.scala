package typings.oracleOraclejet.ojselectcomboboxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Optgroup extends StObject {
  
  var children: js.Array[Option | Optgroup]
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var label: String
}
object Optgroup {
  
  inline def apply(children: js.Array[Option | Optgroup], label: String): Optgroup = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[Optgroup]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Optgroup] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: js.Array[Option | Optgroup]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenVarargs(value: (Option | Optgroup)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
  }
}
