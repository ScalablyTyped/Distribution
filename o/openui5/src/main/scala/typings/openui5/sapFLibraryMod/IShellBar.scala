package typings.openui5.sapFLibraryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShellBar extends StObject {
  
  var __implements__sap_f_IShellBar: Boolean
}
object IShellBar {
  
  inline def apply(__implements__sap_f_IShellBar: Boolean): IShellBar = {
    val __obj = js.Dynamic.literal(__implements__sap_f_IShellBar = __implements__sap_f_IShellBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShellBar]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IShellBar] (val x: Self) extends AnyVal {
    
    inline def set__implements__sap_f_IShellBar(value: Boolean): Self = StObject.set(x, "__implements__sap_f_IShellBar", value.asInstanceOf[js.Any])
  }
}
