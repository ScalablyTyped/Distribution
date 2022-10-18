package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISemanticFormContent extends StObject {
  
  var __implements__sap_ui_core_ISemanticFormContent: Boolean
  
  /**
    * @SINCE 1.86.0
    * @EXPERIMENTAL (since 1.86)
    *
    * Returns the formatted value of a control used in a `SemanticFormElement`.
    *
    * In the `SemanticFormElement` element, the assigned fields are rendered in edit mode. In display mode,
    * a text is rendered that concatenates the values of all assigned fields. In some cases the displayed text
    * does not match the value of the field and needs some formatting. In other cases the control does not
    * have a `value` property, so the `SemanticFormElement` element cannot determine the value.
    *
    * This is an optional method. If not defined, the `value` property or the `text` property is used to determine
    * the value.
    *
    * @returns Formatted value or a `Promise` returning the formatted value if resolved
    */
  var getFormFormattedValue: js.UndefOr[js.Function0[String | js.Promise[Any]]] = js.undefined
  
  /**
    * @SINCE 1.86.0
    * @EXPERIMENTAL (since 1.86)
    *
    * Returns the name of the value-holding property of a control used in a `SemanticFormElement`.
    *
    * In the `SemanticFormElement` element, the assigned fields are rendered in edit mode. In display mode,
    * a text is rendered that concatenates the values of all assigned fields. So the concatenated text needs
    * to be updated if the value of a control changes. If a control does not have a `value` property, the `SemanticFormElement`
    * element needs to know the propery it has to listen for changes.
    *
    * This is an optional method. If not defined, the `value` property or the `text` property is used to determine
    * the value.
    *
    * @returns Name of the value-holding property
    */
  var getFormValueProperty: js.UndefOr[js.Function0[String]] = js.undefined
}
object ISemanticFormContent {
  
  inline def apply(__implements__sap_ui_core_ISemanticFormContent: Boolean): ISemanticFormContent = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_ISemanticFormContent = __implements__sap_ui_core_ISemanticFormContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISemanticFormContent]
  }
  
  extension [Self <: ISemanticFormContent](x: Self) {
    
    inline def setGetFormFormattedValue(value: () => String | js.Promise[Any]): Self = StObject.set(x, "getFormFormattedValue", js.Any.fromFunction0(value))
    
    inline def setGetFormFormattedValueUndefined: Self = StObject.set(x, "getFormFormattedValue", js.undefined)
    
    inline def setGetFormValueProperty(value: () => String): Self = StObject.set(x, "getFormValueProperty", js.Any.fromFunction0(value))
    
    inline def setGetFormValuePropertyUndefined: Self = StObject.set(x, "getFormValueProperty", js.undefined)
    
    inline def set__implements__sap_ui_core_ISemanticFormContent(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_ISemanticFormContent", value.asInstanceOf[js.Any])
  }
}
