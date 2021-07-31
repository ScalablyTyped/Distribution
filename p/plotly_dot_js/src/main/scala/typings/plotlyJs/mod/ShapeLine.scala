package typings.plotlyJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShapeLine extends StObject {
  
  var color: String
  
  var dash: Dash
  
  var width: Double
}
object ShapeLine {
  
  @scala.inline
  def apply(color: String, dash: Dash, width: Double): ShapeLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dash = dash.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShapeLine]
  }
  
  @scala.inline
  implicit class ShapeLineMutableBuilder[Self <: ShapeLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDash(value: Dash): Self = StObject.set(x, "dash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
