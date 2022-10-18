package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IFormContent extends StObject {
  
  var __implements__sap_ui_core_IFormContent: Boolean
  
  /**
    * @SINCE 1.48.0
    *
    * Whether a control wants to keep its original width even when used in a `Form`.
    *
    * In the `Form` control, all content controls are positioned on a grid cell base. By default, the controls
    * use the full width of the used grid cell. But for some controls (like image controls), this is not the
    * desired behavior. In this case the control must keep its original width.
    *
    * This is an optional method. When not defined, the width of the control might be adjusted.
    *
    * @returns true if the `Form` is not allowed to adjust the width of the control to use the cell's width
    */
  var getFormDoNotAdjustWidth: js.UndefOr[js.Function0[Boolean]] = js.undefined
}
object IFormContent {
  
  inline def apply(__implements__sap_ui_core_IFormContent: Boolean): IFormContent = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_IFormContent = __implements__sap_ui_core_IFormContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFormContent]
  }
  
  extension [Self <: IFormContent](x: Self) {
    
    inline def setGetFormDoNotAdjustWidth(value: () => Boolean): Self = StObject.set(x, "getFormDoNotAdjustWidth", js.Any.fromFunction0(value))
    
    inline def setGetFormDoNotAdjustWidthUndefined: Self = StObject.set(x, "getFormDoNotAdjustWidth", js.undefined)
    
    inline def set__implements__sap_ui_core_IFormContent(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_IFormContent", value.asInstanceOf[js.Any])
  }
}
