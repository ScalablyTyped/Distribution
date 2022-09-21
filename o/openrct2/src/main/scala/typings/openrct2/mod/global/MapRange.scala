package typings.openrct2.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area specified using two coordinates.
  */
trait MapRange extends StObject {
  
  var leftTop: CoordsXY
  
  var rightBottom: CoordsXY
}
object MapRange {
  
  inline def apply(leftTop: CoordsXY, rightBottom: CoordsXY): MapRange = {
    val __obj = js.Dynamic.literal(leftTop = leftTop.asInstanceOf[js.Any], rightBottom = rightBottom.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapRange]
  }
  
  extension [Self <: MapRange](x: Self) {
    
    inline def setLeftTop(value: CoordsXY): Self = StObject.set(x, "leftTop", value.asInstanceOf[js.Any])
    
    inline def setRightBottom(value: CoordsXY): Self = StObject.set(x, "rightBottom", value.asInstanceOf[js.Any])
  }
}
