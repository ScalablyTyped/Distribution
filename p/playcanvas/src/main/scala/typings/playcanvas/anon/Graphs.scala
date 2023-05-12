package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graphs extends StObject {
  
  var graphs: Boolean
  
  var height: Double
  
  var spacing: Double
  
  var width: Double
}
object Graphs {
  
  inline def apply(graphs: Boolean, height: Double, spacing: Double, width: Double): Graphs = {
    val __obj = js.Dynamic.literal(graphs = graphs.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graphs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Graphs] (val x: Self) extends AnyVal {
    
    inline def setGraphs(value: Boolean): Self = StObject.set(x, "graphs", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
