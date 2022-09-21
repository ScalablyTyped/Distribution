package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Color extends StObject {
  
  var annotationType: Double
  
  var color: js.Array[Double]
  
  var opacity: Any
  
  var pageIndex: Double
  
  var paths: js.Array[Bezier]
  
  var rect: js.Array[Double]
  
  var rotation: Any
  
  var thickness: Any
}
object Color {
  
  inline def apply(
    annotationType: Double,
    color: js.Array[Double],
    opacity: Any,
    pageIndex: Double,
    paths: js.Array[Bezier],
    rect: js.Array[Double],
    rotation: Any,
    thickness: Any
  ): Color = {
    val __obj = js.Dynamic.literal(annotationType = annotationType.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
  
  extension [Self <: Color](x: Self) {
    
    inline def setAnnotationType(value: Double): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setOpacity(value: Any): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setPaths(value: js.Array[Bezier]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsVarargs(value: Bezier*): Self = StObject.set(x, "paths", js.Array(value*))
    
    inline def setRect(value: js.Array[Double]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectVarargs(value: Double*): Self = StObject.set(x, "rect", js.Array(value*))
    
    inline def setRotation(value: Any): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setThickness(value: Any): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
  }
}
