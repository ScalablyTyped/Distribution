package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pattern extends StObject {
  
  /** Bounding box that defines the dimensions of the pattern in `pt`. */
  var boundingBox: js.Tuple4[Double, Double, Double, Double]
  
  /** PDF tiling pattern string. */
  var pattern: String
  
  /** Horizontal step size in `pt`. */
  var xStep: Double
  
  /** Vertical step size in `pt`. */
  var yStep: Double
}
object Pattern {
  
  inline def apply(
    boundingBox: js.Tuple4[Double, Double, Double, Double],
    pattern: String,
    xStep: Double,
    yStep: Double
  ): Pattern = {
    val __obj = js.Dynamic.literal(boundingBox = boundingBox.asInstanceOf[js.Any], pattern = pattern.asInstanceOf[js.Any], xStep = xStep.asInstanceOf[js.Any], yStep = yStep.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pattern]
  }
  
  extension [Self <: Pattern](x: Self) {
    
    inline def setBoundingBox(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "boundingBox", value.asInstanceOf[js.Any])
    
    inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setXStep(value: Double): Self = StObject.set(x, "xStep", value.asInstanceOf[js.Any])
    
    inline def setYStep(value: Double): Self = StObject.set(x, "yStep", value.asInstanceOf[js.Any])
  }
}
