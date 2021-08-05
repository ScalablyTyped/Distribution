package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentSvg
  extends StObject
     with ContentBase
     with _Content {
  
  var fit: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var svg: String
  
  var width: js.UndefOr[Double] = js.undefined
}
object ContentSvg {
  
  inline def apply(svg: String): ContentSvg = {
    val __obj = js.Dynamic.literal(svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSvg]
  }
  
  extension [Self <: ContentSvg](x: Self) {
    
    inline def setFit(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "fit", value.asInstanceOf[js.Any])
    
    inline def setFitUndefined: Self = StObject.set(x, "fit", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSvg(value: String): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
