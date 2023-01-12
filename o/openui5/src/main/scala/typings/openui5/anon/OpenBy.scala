package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenBy extends StObject {
  
  /**
    * This parameter contains the control which is passed as the parameter when calling openBy method. When
    * runs on the phone, this parameter is undefined.
    */
  var openBy: js.UndefOr[default] = js.undefined
}
object OpenBy {
  
  inline def apply(): OpenBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenBy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpenBy] (val x: Self) extends AnyVal {
    
    inline def setOpenBy(value: default): Self = StObject.set(x, "openBy", value.asInstanceOf[js.Any])
    
    inline def setOpenByUndefined: Self = StObject.set(x, "openBy", js.undefined)
  }
}
