package typings.plottable.anon

import typings.plottable.plottableStrings.canvas
import typings.plottable.plottableStrings.svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Canvas extends StObject {
  
  var canvas: typings.plottable.plottableStrings.canvas
  
  var svg: typings.plottable.plottableStrings.svg
}
object Canvas {
  
  @scala.inline
  def apply(): Canvas = {
    val __obj = js.Dynamic.literal(canvas = "canvas", svg = "svg")
    __obj.asInstanceOf[Canvas]
  }
  
  @scala.inline
  implicit class CanvasMutableBuilder[Self <: Canvas] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCanvas(value: canvas): Self = StObject.set(x, "canvas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSvg(value: svg): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
  }
}
