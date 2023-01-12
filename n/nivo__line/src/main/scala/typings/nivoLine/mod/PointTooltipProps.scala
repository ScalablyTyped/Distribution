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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointTooltipProps] (val x: Self) extends AnyVal {
    
    inline def setPoint(value: Point): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
  }
}
