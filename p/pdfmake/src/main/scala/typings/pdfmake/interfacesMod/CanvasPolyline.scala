package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.X
import typings.pdfmake.pdfmakeStrings.polyline
import typings.pdfmake.pdfmakeStrings.round
import typings.pdfmake.pdfmakeStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasPolyline
  extends StObject
     with CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  
  var closePath: js.UndefOr[Boolean] = js.undefined
  
  var lineCap: js.UndefOr[round | square] = js.undefined
  
  var points: js.Array[X]
  
  var `type`: polyline
}
object CanvasPolyline {
  
  inline def apply(points: js.Array[X]): CanvasPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("polyline")
    __obj.asInstanceOf[CanvasPolyline]
  }
  
  extension [Self <: CanvasPolyline](x: Self) {
    
    inline def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    inline def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    inline def setLineCap(value: round | square): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    inline def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    inline def setPoints(value: js.Array[X]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsVarargs(value: X*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    inline def setType(value: polyline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
