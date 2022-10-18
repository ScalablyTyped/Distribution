package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenByOrigin extends StObject {
  
  /**
    * This parameter contains the control which is passed as the parameter when calling openBy method. When
    * runs on the phone, this parameter is undefined.
    */
  var openBy: js.UndefOr[default] = js.undefined
  
  /**
    * This parameter contains the control which triggers the close of the ResponsivePopover. This parameter
    * is undefined when runs on desktop or tablet.
    */
  var origin: js.UndefOr[typings.openui5.sapMButtonMod.default] = js.undefined
}
object OpenByOrigin {
  
  inline def apply(): OpenByOrigin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenByOrigin]
  }
  
  extension [Self <: OpenByOrigin](x: Self) {
    
    inline def setOpenBy(value: default): Self = StObject.set(x, "openBy", value.asInstanceOf[js.Any])
    
    inline def setOpenByUndefined: Self = StObject.set(x, "openBy", js.undefined)
    
    inline def setOrigin(value: typings.openui5.sapMButtonMod.default): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    inline def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
  }
}
