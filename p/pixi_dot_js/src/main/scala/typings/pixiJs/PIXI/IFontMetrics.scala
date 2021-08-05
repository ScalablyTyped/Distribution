package typings.pixiJs.PIXI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A number, or a string containing a number.
  *
  * @memberof PIXI
  * @typedef IFontMetrics
  * @property {number} ascent - Font ascent
  * @property {number} descent - Font descent
  * @property {number} fontSize - Font size
  */
trait IFontMetrics extends StObject {
  
  var ascent: Double
  
  var descent: Double
  
  var fontSize: Double
}
object IFontMetrics {
  
  inline def apply(ascent: Double, descent: Double, fontSize: Double): IFontMetrics = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFontMetrics]
  }
  
  extension [Self <: IFontMetrics](x: Self) {
    
    inline def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
    
    inline def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
    
    inline def setFontSize(value: Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
  }
}
