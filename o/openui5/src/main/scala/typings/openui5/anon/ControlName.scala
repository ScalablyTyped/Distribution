package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlName extends StObject {
  
  var control: default
  
  var name: String
  
  var view: typings.openui5.sapUiCoreMvcViewMod.default
}
object ControlName {
  
  inline def apply(control: default, name: String, view: typings.openui5.sapUiCoreMvcViewMod.default): ControlName = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlName] (val x: Self) extends AnyVal {
    
    inline def setControl(value: default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setView(value: typings.openui5.sapUiCoreMvcViewMod.default): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
