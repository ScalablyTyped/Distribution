package typings.openui5.sapUiCoreLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShrinkable extends StObject {
  
  var __implements__sap_ui_core_IShrinkable: Boolean
}
object IShrinkable {
  
  inline def apply(__implements__sap_ui_core_IShrinkable: Boolean): IShrinkable = {
    val __obj = js.Dynamic.literal(__implements__sap_ui_core_IShrinkable = __implements__sap_ui_core_IShrinkable.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShrinkable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShrinkable] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_ui_core_IShrinkable(value: Boolean): Self = StObject.set(x, "__implements__sap_ui_core_IShrinkable", value.asInstanceOf[js.Any])
  }
}
