package typings.openui5.anon

import typings.openui5.sapUiCoreControlMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlDefault extends StObject {
  
  /**
    * The control instance that is personalized by this controller
    */
  var control: default
}
object ControlDefault {
  
  inline def apply(control: default): ControlDefault = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlDefault]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlDefault] (val x: Self) extends AnyVal {
    
    inline def setControl(value: default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
