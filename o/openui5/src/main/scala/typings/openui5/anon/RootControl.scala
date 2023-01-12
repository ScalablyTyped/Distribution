package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootControl extends StObject {
  
  /**
    * Control instance to get the AppComponent. This then is used to start UI adaptation.
    */
  var rootControl: default | typings.openui5.sapUiCoreUicomponentMod.default
}
object RootControl {
  
  inline def apply(rootControl: default | typings.openui5.sapUiCoreUicomponentMod.default): RootControl = {
    val __obj = js.Dynamic.literal(rootControl = rootControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootControl]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootControl] (val x: Self) extends AnyVal {
    
    inline def setRootControl(value: default | typings.openui5.sapUiCoreUicomponentMod.default): Self = StObject.set(x, "rootControl", value.asInstanceOf[js.Any])
  }
}
