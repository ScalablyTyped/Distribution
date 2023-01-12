package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollbarComponentData extends StObject {
  
  var enabled: Boolean
}
object ScrollbarComponentData {
  
  inline def apply(enabled: Boolean): ScrollbarComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollbarComponentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollbarComponentData] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
