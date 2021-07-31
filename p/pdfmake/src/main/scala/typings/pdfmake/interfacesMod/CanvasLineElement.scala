package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.Length
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasLineElement extends StObject {
  
  var dash: js.UndefOr[Length] = js.undefined
  
  var lineColor: js.UndefOr[String] = js.undefined
  
  var lineWidth: js.UndefOr[Double] = js.undefined
}
object CanvasLineElement {
  
  @scala.inline
  def apply(): CanvasLineElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasLineElement]
  }
  
  @scala.inline
  implicit class CanvasLineElementMutableBuilder[Self <: CanvasLineElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDash(value: Length): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    @scala.inline
    def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    @scala.inline
    def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
  }
}
