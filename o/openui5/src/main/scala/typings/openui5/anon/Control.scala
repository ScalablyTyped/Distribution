package typings.openui5.anon

import typings.openui5.sapUiBaseManagedObjectMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Control extends StObject {
  
  /**
    * Variant management control for which the URL technical parameter has to be cleared
    */
  var control: default
}
object Control {
  
  inline def apply(control: default): Control = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any])
    __obj.asInstanceOf[Control]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Control] (val x: Self) extends AnyVal {
    
    inline def setControl(value: default): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
  }
}
