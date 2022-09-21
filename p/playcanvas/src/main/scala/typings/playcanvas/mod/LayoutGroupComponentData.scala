package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutGroupComponentData extends StObject {
  
  var enabled: Boolean
}
object LayoutGroupComponentData {
  
  inline def apply(enabled: Boolean): LayoutGroupComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutGroupComponentData]
  }
  
  extension [Self <: LayoutGroupComponentData](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
