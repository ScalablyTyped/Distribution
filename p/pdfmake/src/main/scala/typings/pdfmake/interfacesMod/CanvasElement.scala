package typings.pdfmake.interfacesMod

import typings.pdfmake.anon.X
import typings.pdfmake.pdfmakeStrings.ellipse
import typings.pdfmake.pdfmakeStrings.line
import typings.pdfmake.pdfmakeStrings.polyline
import typings.pdfmake.pdfmakeStrings.rect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pdfmake.interfacesMod.CanvasRect
  - typings.pdfmake.interfacesMod.CanvasPolyline
  - typings.pdfmake.interfacesMod.CanvasLine
  - typings.pdfmake.interfacesMod.CanvasEllipse
*/
trait CanvasElement extends StObject
object CanvasElement {
  
  @scala.inline
  def CanvasEllipse(r1: Double, `type`: ellipse, x: Double, y: Double): typings.pdfmake.interfacesMod.CanvasEllipse = {
    val __obj = js.Dynamic.literal(r1 = r1.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pdfmake.interfacesMod.CanvasEllipse]
  }
  
  @scala.inline
  def CanvasLine(`type`: line, x1: Double, x2: Double, y1: Double, y2: Double): typings.pdfmake.interfacesMod.CanvasLine = {
    val __obj = js.Dynamic.literal(x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pdfmake.interfacesMod.CanvasLine]
  }
  
  @scala.inline
  def CanvasPolyline(points: js.Array[X], `type`: polyline): typings.pdfmake.interfacesMod.CanvasPolyline = {
    val __obj = js.Dynamic.literal(points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pdfmake.interfacesMod.CanvasPolyline]
  }
  
  @scala.inline
  def CanvasRect(h: Double, `type`: rect, w: Double, x: Double, y: Double): typings.pdfmake.interfacesMod.CanvasRect = {
    val __obj = js.Dynamic.literal(h = h.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.pdfmake.interfacesMod.CanvasRect]
  }
}
