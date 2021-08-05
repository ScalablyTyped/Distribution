package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PDFAnnotationData extends StObject {
  
  // [x1, y1, x2, y2]
  var annotationFlags: js.Any
  
  // [r,g,b]
  var borderWidth: Double
  
  // todo
  var color: js.Array[Double]
  
  var hasAppearance: Boolean
  
  var rect: js.Array[Double]
  
  var subtype: String
}
object PDFAnnotationData {
  
  inline def apply(
    annotationFlags: js.Any,
    borderWidth: Double,
    color: js.Array[Double],
    hasAppearance: Boolean,
    rect: js.Array[Double],
    subtype: String
  ): PDFAnnotationData = {
    val __obj = js.Dynamic.literal(annotationFlags = annotationFlags.asInstanceOf[js.Any], borderWidth = borderWidth.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], hasAppearance = hasAppearance.asInstanceOf[js.Any], rect = rect.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFAnnotationData]
  }
  
  extension [Self <: PDFAnnotationData](x: Self) {
    
    inline def setAnnotationFlags(value: js.Any): Self = StObject.set(x, "annotationFlags", value.asInstanceOf[js.Any])
    
    inline def setBorderWidth(value: Double): Self = StObject.set(x, "borderWidth", value.asInstanceOf[js.Any])
    
    inline def setColor(value: js.Array[Double]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
    
    inline def setHasAppearance(value: Boolean): Self = StObject.set(x, "hasAppearance", value.asInstanceOf[js.Any])
    
    inline def setRect(value: js.Array[Double]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    inline def setRectVarargs(value: Double*): Self = StObject.set(x, "rect", js.Array(value :_*))
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
  }
}
