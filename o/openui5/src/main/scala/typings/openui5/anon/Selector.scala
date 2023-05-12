package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Selector extends StObject {
  
  /**
    * Selector of the control
    */
  var selector: /* was: sap.ui.fl.Selector */ Any
  
  /**
    * ID of the variant management control
    */
  var vmControlId: String
}
object Selector {
  
  inline def apply(selector: /* was: sap.ui.fl.Selector */ Any, vmControlId: String): Selector = {
    val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any], vmControlId = vmControlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selector]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Selector] (val x: Self) extends AnyVal {
    
    inline def setSelector(value: /* was: sap.ui.fl.Selector */ Any): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setVmControlId(value: String): Self = StObject.set(x, "vmControlId", value.asInstanceOf[js.Any])
  }
}
