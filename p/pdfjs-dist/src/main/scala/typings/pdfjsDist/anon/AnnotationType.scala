package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnnotationType extends StObject {
  
  var annotationType: Double
  
  var color: js.Array[Double]
  
  var fontSize: Any
  
  var pageIndex: Double
  
  var rect: js.Array[Double]
  
  var rotation: Any
  
  var value: String
}
object AnnotationType {
  
  inline def apply(
    annotationType: Double,
    color: js.Array[Double],
    fontSize: Any,
    pageIndex: Double,
    rect: js.Array[Double],
    rotation: Any,
    value: String
  ): AnnotationType = {
    val __obj = js.Dynamic.literal(annotationType = annotationType.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], pageIndex = pageIndex.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotationType]
  }
  
  extension [Self <: AnnotationType](x: Self) {
    
    inline def setAnnotationType(value: Double): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFontSize(value: Any): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
    
    inline def setRect(value: js.Array[Double]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectVarargs(value: Double*): Self = StObject.set(x, "rect", js.Array(value*))
    
    inline def setRotation(value: Any): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
