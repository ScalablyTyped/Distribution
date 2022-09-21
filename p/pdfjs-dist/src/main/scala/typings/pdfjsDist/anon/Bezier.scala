package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bezier extends StObject {
  
  var bezier: js.Array[Double]
  
  var points: js.Array[Double]
}
object Bezier {
  
  inline def apply(bezier: js.Array[Double], points: js.Array[Double]): Bezier = {
    val __obj = js.Dynamic.literal(bezier = bezier.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bezier]
  }
  
  extension [Self <: Bezier](x: Self) {
    
    inline def setBezier(value: js.Array[Double]): Self = StObject.set(x, "bezier", value.asInstanceOf[js.Any])
    
    inline def setBezierVarargs(value: Double*): Self = StObject.set(x, "bezier", js.Array(value*))
    
    inline def setPoints(value: js.Array[Double]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: Double*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
