package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptComponentData extends StObject {
  
  var enabled: Boolean
}
object ScriptComponentData {
  
  inline def apply(enabled: Boolean): ScriptComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptComponentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptComponentData] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
