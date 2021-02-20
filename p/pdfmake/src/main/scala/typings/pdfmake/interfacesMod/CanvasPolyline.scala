package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.X
import typings.pdfmake.pdfmakeStrings.polyline
import typings.pdfmake.pdfmakeStrings.round
import typings.pdfmake.pdfmakeStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CanvasPolyline
  extends CanvasLineElement
     with CanvasFilledElement
     with CanvasElement {
  
  var closePath: js.UndefOr[Boolean] = js.native
  
  var lineCap: js.UndefOr[round | square] = js.native
  
  var points: js.Array[X] = js.native
  
  var `type`: polyline = js.native
}
object CanvasPolyline {
  
  @scala.inline
  def apply(points: js.Array[X], `type`: polyline): CanvasPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CanvasPolyline]
  }
  
  @scala.inline
  implicit class CanvasPolylineMutableBuilder[Self <: CanvasPolyline] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClosePath(value: Boolean): Self = StObject.set(x, "closePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosePathUndefined: Self = StObject.set(x, "closePath", js.undefined)
    
    @scala.inline
    def setLineCap(value: round | square): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
    
    @scala.inline
    def setPoints(value: js.Array[X]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsVarargs(value: X*): Self = StObject.set(x, "points", js.Array(value :_*))
    
    @scala.inline
    def setType(value: polyline): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
