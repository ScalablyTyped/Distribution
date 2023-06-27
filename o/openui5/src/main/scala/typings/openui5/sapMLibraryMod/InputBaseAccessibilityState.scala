package typings.openui5.sapMLibraryMod

import typings.openui5.anon.Append
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputBaseAccessibilityState extends StObject {
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The describedby property.
    */
  var describedby: js.UndefOr[Append] = js.undefined
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Whether the control is disabled. If not relevant, it shouldn`t be set or set as `null`.
    */
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The errormessage property.
    */
  var errormessage: js.UndefOr[String] = js.undefined
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Whether the control is invalid.
    */
  var invalid: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The labelledby property.
    */
  var labelledby: js.UndefOr[Append] = js.undefined
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * Whether the control is readonly. If not relevant, it shouldn`t be set or set as `null`.
    */
  var readonly: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Protected:  DO NOT USE IN APPLICATIONS (only for related classes in the framework)
    *
    * The WAI-ARIA role which is implemented by the control.
    */
  var role: js.UndefOr[String] = js.undefined
}
object InputBaseAccessibilityState {
  
  inline def apply(): InputBaseAccessibilityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputBaseAccessibilityState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputBaseAccessibilityState] (val x: Self) extends AnyVal {
    
    inline def setDescribedby(value: Append): Self = StObject.set(x, "describedby", value.asInstanceOf[js.Any])
    
    inline def setDescribedbyUndefined: Self = StObject.set(x, "describedby", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrormessage(value: String): Self = StObject.set(x, "errormessage", value.asInstanceOf[js.Any])
    
    inline def setErrormessageUndefined: Self = StObject.set(x, "errormessage", js.undefined)
    
    inline def setInvalid(value: Boolean): Self = StObject.set(x, "invalid", value.asInstanceOf[js.Any])
    
    inline def setInvalidUndefined: Self = StObject.set(x, "invalid", js.undefined)
    
    inline def setLabelledby(value: Append): Self = StObject.set(x, "labelledby", value.asInstanceOf[js.Any])
    
    inline def setLabelledbyUndefined: Self = StObject.set(x, "labelledby", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyNull: Self = StObject.set(x, "readonly", null)
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
  }
}
