package typings.playcanvas.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayoutChildComponentData extends StObject {
  
  var enabled: Boolean
}
object LayoutChildComponentData {
  
  inline def apply(enabled: Boolean): LayoutChildComponentData = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutChildComponentData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayoutChildComponentData] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
  }
}
