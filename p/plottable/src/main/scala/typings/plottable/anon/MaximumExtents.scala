package typings.plottable.anon

import typings.plottable.stackingUtilsMod.StackExtent
import typings.plottable.utilsMod.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaximumExtents[D] extends StObject {
  
  var maximumExtents: Map[String | Double, StackExtent[D]] = js.native
  
  var minimumExtents: Map[String | Double, StackExtent[D]] = js.native
}
object MaximumExtents {
  
  @scala.inline
  def apply[D](
    maximumExtents: Map[String | Double, StackExtent[D]],
    minimumExtents: Map[String | Double, StackExtent[D]]
  ): MaximumExtents[D] = {
    val __obj = js.Dynamic.literal(maximumExtents = maximumExtents.asInstanceOf[js.Any], minimumExtents = minimumExtents.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaximumExtents[D]]
  }
  
  @scala.inline
  implicit class MaximumExtentsMutableBuilder[Self <: MaximumExtents[_], D] (val x: Self with MaximumExtents[D]) extends AnyVal {
    
    @scala.inline
    def setMaximumExtents(value: Map[String | Double, StackExtent[D]]): Self = StObject.set(x, "maximumExtents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumExtents(value: Map[String | Double, StackExtent[D]]): Self = StObject.set(x, "minimumExtents", value.asInstanceOf[js.Any])
  }
}
