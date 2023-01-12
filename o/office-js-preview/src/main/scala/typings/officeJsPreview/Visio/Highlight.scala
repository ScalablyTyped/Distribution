package typings.officeJsPreview.Visio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * Represents the highlight data added to the shape.
  *
  * [Api set:  1.1]
  */
trait Highlight extends StObject {
  
  /**
    *
    * A string that specifies the color of the highlight. It must have the form "#RRGGBB", where each letter represents a hexadecimal digit between 0 and F, and where RR is the red value between 0 and 0xFF (255), GG the green value between 0 and 0xFF (255), and BB is the blue value between 0 and 0xFF (255).
    *
    * [Api set:  1.1]
    */
  var color: String
  
  /**
    *
    * A positive integer that specifies the width of the highlight's stroke in pixels.
    *
    * [Api set:  1.1]
    */
  var width: Double
}
object Highlight {
  
  inline def apply(color: String, width: Double): Highlight = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Highlight]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Highlight] (val x: Self) extends AnyVal {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
