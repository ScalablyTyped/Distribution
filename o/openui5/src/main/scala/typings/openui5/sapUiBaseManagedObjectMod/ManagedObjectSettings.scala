package typings.openui5.sapUiBaseManagedObjectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ManagedObjectSettings extends StObject {
  
  /**
    * Fired when a new value for a bound property should have been propagated from the model, but formatting
    * the value failed with an exception.
    */
  var formatError: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ManagedObject$FormatErrorEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Fired when models or contexts are changed on this object (either by calling setModel/setBindingContext
    * or due to propagation)
    */
  var modelContextChange: js.UndefOr[
    js.Function1[/* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object], Unit]
  ] = js.undefined
  
  /**
    * Fired when a new value for a bound property should have been propagated to the model, but parsing the
    * value failed with an exception.
    */
  var parseError: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ManagedObject$ParseErrorEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Fired when a new value for a bound property should have been propagated to the model, but validating
    * the value failed with an exception.
    */
  var validationError: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ManagedObject$ValidationErrorEventParameters], 
      Unit
    ]
  ] = js.undefined
  
  /**
    * Fired after a new value for a bound property has been propagated to the model. Only fired, when the binding
    * uses a data type.
    */
  var validationSuccess: js.UndefOr[
    js.Function1[
      /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ManagedObject$ValidationSuccessEventParameters], 
      Unit
    ]
  ] = js.undefined
}
object ManagedObjectSettings {
  
  inline def apply(): ManagedObjectSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ManagedObjectSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ManagedObjectSettings] (val x: Self) extends AnyVal {
    
    inline def setFormatError(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ManagedObject$FormatErrorEventParameters] => Unit
    ): Self = StObject.set(x, "formatError", js.Any.fromFunction1(value))
    
    inline def setFormatErrorUndefined: Self = StObject.set(x, "formatError", js.undefined)
    
    inline def setModelContextChange(value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[js.Object] => Unit): Self = StObject.set(x, "modelContextChange", js.Any.fromFunction1(value))
    
    inline def setModelContextChangeUndefined: Self = StObject.set(x, "modelContextChange", js.undefined)
    
    inline def setParseError(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ManagedObject$ParseErrorEventParameters] => Unit
    ): Self = StObject.set(x, "parseError", js.Any.fromFunction1(value))
    
    inline def setParseErrorUndefined: Self = StObject.set(x, "parseError", js.undefined)
    
    inline def setValidationError(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ManagedObject$ValidationErrorEventParameters] => Unit
    ): Self = StObject.set(x, "validationError", js.Any.fromFunction1(value))
    
    inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
    
    inline def setValidationSuccess(
      value: /* oEvent */ typings.openui5.sapUiBaseEventMod.default[ManagedObject$ValidationSuccessEventParameters] => Unit
    ): Self = StObject.set(x, "validationSuccess", js.Any.fromFunction1(value))
    
    inline def setValidationSuccessUndefined: Self = StObject.set(x, "validationSuccess", js.undefined)
  }
}
