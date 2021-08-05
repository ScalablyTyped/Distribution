package typings.openfin.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomRightCorner extends StObject {
  
  var bottomRightCorner: Double
  
  var sides: js.UndefOr[Left] = js.undefined
  
  var size: Double
}
object BottomRightCorner {
  
  inline def apply(bottomRightCorner: Double, size: Double): BottomRightCorner = {
    val __obj = js.Dynamic.literal(bottomRightCorner = bottomRightCorner.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomRightCorner]
  }
  
  extension [Self <: BottomRightCorner](x: Self) {
    
    inline def setBottomRightCorner(value: Double): Self = StObject.set(x, "bottomRightCorner", value.asInstanceOf[js.Any])
    
    inline def setSides(value: Left): Self = StObject.set(x, "sides", value.asInstanceOf[js.Any])
    
    inline def setSidesUndefined: Self = StObject.set(x, "sides", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
