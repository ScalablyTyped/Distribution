package typings.nivoLine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointTooltipProps extends StObject {
  
  var point: Point
}
object PointTooltipProps {
  
  inline def apply(point: Point): PointTooltipProps = {
    val __obj = js.Dynamic.literal(point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointTooltipProps]
  }
  
  extension [Self <: PointTooltipProps](x: Self) {
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
