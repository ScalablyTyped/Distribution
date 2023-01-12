package typings.nivoCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/core.@nivo/core.PatternSquaresDef, 'id' | 'type'> */
trait OmitPatternSquaresDefidty extends StObject {
  
  var background: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var stagger: js.UndefOr[Boolean] = js.undefined
}
object OmitPatternSquaresDefidty {
  
  inline def apply(): OmitPatternSquaresDefidty = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPatternSquaresDefidty]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitPatternSquaresDefidty] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStagger(value: Boolean): Self = StObject.set(x, "stagger", value.asInstanceOf[js.Any])
    
    inline def setStaggerUndefined: Self = StObject.set(x, "stagger", js.undefined)
  }
}
