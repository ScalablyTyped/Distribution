package typings.pdfmake.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasLineElement extends StObject {
  
  /**
    * Makes the line dashed.
    *
    * Defaults to a solid line.
    */
  var dash: js.UndefOr[Dash] = js.undefined
  
  /**
    * Line color.
    *
    * Supports well-known color names like `blue` or hexadecimal color strings like `#ccffcc`.
    *
    * Defaults to `black` if the element has no `color` set; defaults to no line otherwise.
    */
  var lineColor: js.UndefOr[String] = js.undefined
  
  /**
    * Rendering of joints between lines of different angles.
    *
    * Defaults to `miter`.
    */
  var lineJoin: js.UndefOr[CanvasLineJoin] = js.undefined
  
  /**
    * Line width in `pt`.
    *
    * Defaults to `1`.
    */
  var lineWidth: js.UndefOr[Double] = js.undefined
  
  /**
    * Opacity of the {@link lineColor}.
    * Must be between 0 (fully transparent) and 1 (fully opaque).
    *
    * Defaults to `1`.
    */
  var strokeOpacity: js.UndefOr[Double] = js.undefined
}
object CanvasLineElement {
  
  inline def apply(): CanvasLineElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CanvasLineElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasLineElement] (val x: Self) extends AnyVal {
    
    inline def setDash(value: Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    inline def setDashUndefined: Self = StObject.set(x, "dash", js.undefined)
    
    inline def setLineColor(value: String): Self = StObject.set(x, "lineColor", value.asInstanceOf[js.Any])
    
    inline def setLineColorUndefined: Self = StObject.set(x, "lineColor", js.undefined)
    
    inline def setLineJoin(value: CanvasLineJoin): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
    
    inline def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
    
    inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
    
    inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
    
    inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
    
    inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
  }
}
