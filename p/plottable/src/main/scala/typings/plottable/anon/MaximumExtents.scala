package typings.plottable.anon

import typings.plottable.buildSrcUtilsMod.Map
import typings.plottable.buildSrcUtilsStackingUtilsMod.StackExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaximumExtents[D] extends StObject {
  
  var maximumExtents: Map[String | Double, StackExtent[D]]
  
  var minimumExtents: Map[String | Double, StackExtent[D]]
}
object MaximumExtents {
  
  inline def apply[D](
    maximumExtents: Map[String | Double, StackExtent[D]],
    minimumExtents: Map[String | Double, StackExtent[D]]
  ): MaximumExtents[D] = {
    val __obj = js.Dynamic.literal(maximumExtents = maximumExtents.asInstanceOf[js.Any], minimumExtents = minimumExtents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumExtents[D]]
  }
  
  extension [Self <: MaximumExtents[?], D](x: Self & MaximumExtents[D]) {
    
    inline def setMaximumExtents(value: Map[String | Double, StackExtent[D]]): Self = StObject.set(x, "maximumExtents", value.asInstanceOf[js.Any])
    
    inline def setMinimumExtents(value: Map[String | Double, StackExtent[D]]): Self = StObject.set(x, "minimumExtents", value.asInstanceOf[js.Any])
  }
}
