package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccessKeySupport extends StObject {
  
  var __implements__sap_ui_core_IAccessKeySupport: Boolean
  
  /**
    * @SINCE 1.104
    * @EXPERIMENTAL (since 1.104)
    *
    * Returns a refence to DOM element to be focused during Access key navigation. If not implemented getFocusDomRef()
    * method is used.
    */
  var getAccessKeysFocusTarget: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @SINCE 1.104
    * @EXPERIMENTAL (since 1.104)
    *
    * If implemented called when access keys feature is enabled and highlighting is over
    */
  var onAccKeysHighlightEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  /**
    * @SINCE 1.104
    * @EXPERIMENTAL (since 1.104)
    *
    * If implemented called when access keys feature is enabled and highlighting is ongoing
    */
  var onAccKeysHighlightStart: js.UndefOr[js.Function0[Unit]] = js.undefined
}
object IAccessKeySupport {
  
  inline def apply(__implements__sap_ui_core_IAccessKeySupport: Boolean): IAccessKeySupport = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_IAccessKeySupport = __implements__sap_ui_core_IAccessKeySupport.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccessKeySupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAccessKeySupport] (val x: Self) extends AnyVal {
    
    inline def setGetAccessKeysFocusTarget(value: () => Unit): Self = StObject.set(x, "getAccessKeysFocusTarget", js.Any.fromFunction0(value))
    
    inline def setGetAccessKeysFocusTargetUndefined: Self = StObject.set(x, "getAccessKeysFocusTarget", js.undefined)
    
    inline def setOnAccKeysHighlightEnd(value: () => Unit): Self = StObject.set(x, "onAccKeysHighlightEnd", js.Any.fromFunction0(value))
    
    inline def setOnAccKeysHighlightEndUndefined: Self = StObject.set(x, "onAccKeysHighlightEnd", js.undefined)
    
    inline def setOnAccKeysHighlightStart(value: () => Unit): Self = StObject.set(x, "onAccKeysHighlightStart", js.Any.fromFunction0(value))
    
    inline def setOnAccKeysHighlightStartUndefined: Self = StObject.set(x, "onAccKeysHighlightStart", js.undefined)
    
    inline def set__implements__sap_ui_core_IAccessKeySupport(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_IAccessKeySupport", value.asInstanceOf[js.Any])
  }
}
