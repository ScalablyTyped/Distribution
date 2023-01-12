package typings.overlayscrollbars.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OverflowChangedArgs extends StObject {
  
  var clipped: Boolean
  
  var x: Boolean
  
  var xScrollable: Boolean
  
  var y: Boolean
  
  var yScrollable: Boolean
}
object OverflowChangedArgs {
  
  inline def apply(clipped: Boolean, x: Boolean, xScrollable: Boolean, y: Boolean, yScrollable: Boolean): OverflowChangedArgs = {
    val __obj = js.Dynamic.literal(clipped = clipped.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], xScrollable = xScrollable.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], yScrollable = yScrollable.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverflowChangedArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OverflowChangedArgs] (val x: Self) extends AnyVal {
    
    inline def setClipped(value: Boolean): Self = StObject.set(x, "clipped", value.asInstanceOf[js.Any])
    
    inline def setX(value: Boolean): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXScrollable(value: Boolean): Self = StObject.set(x, "xScrollable", value.asInstanceOf[js.Any])
    
    inline def setY(value: Boolean): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYScrollable(value: Boolean): Self = StObject.set(x, "yScrollable", value.asInstanceOf[js.Any])
  }
}
