package typings.phaser.anon

import typings.phaser.spine.Color
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofColor extends StObject {
  
  /* static member */
  var BLUE: Color
  
  /* static member */
  var GREEN: Color
  
  /* static member */
  var MAGENTA: Color
  
  /* static member */
  var RED: Color
  
  /* static member */
  var WHITE: Color
  
  /* static member */
  def rgb888ToColor(color: Color, value: Double): Unit
  
  /* static member */
  def rgba8888ToColor(color: Color, value: Double): Unit
}
object TypeofColor {
  
  inline def apply(
    BLUE: Color,
    GREEN: Color,
    MAGENTA: Color,
    RED: Color,
    WHITE: Color,
    rgb888ToColor: (Color, Double) => Unit,
    rgba8888ToColor: (Color, Double) => Unit
  ): TypeofColor = {
    val __obj = js.Dynamic.literal(BLUE = BLUE.asInstanceOf[js.Any], GREEN = GREEN.asInstanceOf[js.Any], MAGENTA = MAGENTA.asInstanceOf[js.Any], RED = RED.asInstanceOf[js.Any], WHITE = WHITE.asInstanceOf[js.Any], rgb888ToColor = js.Any.fromFunction2(rgb888ToColor), rgba8888ToColor = js.Any.fromFunction2(rgba8888ToColor))
    __obj.asInstanceOf[TypeofColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofColor] (val x: Self) extends AnyVal {
    
    inline def setBLUE(value: Color): Self = StObject.set(x, "BLUE", value.asInstanceOf[js.Any])
    
    inline def setGREEN(value: Color): Self = StObject.set(x, "GREEN", value.asInstanceOf[js.Any])
    
    inline def setMAGENTA(value: Color): Self = StObject.set(x, "MAGENTA", value.asInstanceOf[js.Any])
    
    inline def setRED(value: Color): Self = StObject.set(x, "RED", value.asInstanceOf[js.Any])
    
    inline def setRgb888ToColor(value: (Color, Double) => Unit): Self = StObject.set(x, "rgb888ToColor", js.Any.fromFunction2(value))
    
    inline def setRgba8888ToColor(value: (Color, Double) => Unit): Self = StObject.set(x, "rgba8888ToColor", js.Any.fromFunction2(value))
    
    inline def setWHITE(value: Color): Self = StObject.set(x, "WHITE", value.asInstanceOf[js.Any])
  }
}
