package typings.openui5.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallAfterInitialVariant extends StObject {
  
  /**
    * The callback will also be called after the initial variant is applied
    */
  var callAfterInitialVariant: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Callback that will be called after a variant has been applied
    */
  var callback: js.Function
  
  /**
    * Selector of the control
    */
  var selector: /* was: sap.ui.fl.Selector */ Any
  
  /**
    * ID of the variant management control
    */
  var vmControlId: String
}
object CallAfterInitialVariant {
  
  inline def apply(callback: js.Function, selector: /* was: sap.ui.fl.Selector */ Any, vmControlId: String): CallAfterInitialVariant = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any], vmControlId = vmControlId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallAfterInitialVariant]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CallAfterInitialVariant] (val x: Self) extends AnyVal {
    
    inline def setCallAfterInitialVariant(value: Boolean): Self = StObject.set(x, "callAfterInitialVariant", value.asInstanceOf[js.Any])
    
    inline def setCallAfterInitialVariantUndefined: Self = StObject.set(x, "callAfterInitialVariant", js.undefined)
    
    inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
    
    inline def setSelector(value: /* was: sap.ui.fl.Selector */ Any): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setVmControlId(value: String): Self = StObject.set(x, "vmControlId", value.asInstanceOf[js.Any])
  }
}
