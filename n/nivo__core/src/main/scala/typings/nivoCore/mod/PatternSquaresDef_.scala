package typings.nivoCore.mod

import typings.nivoCore.nivoCoreStrings.patternSquares
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@nivo/core.@nivo/core.PatternDotsDef, 'type'> & {  type :'patternSquares'} */
trait PatternSquaresDef_
  extends StObject
     with Def {
  
  var background: js.UndefOr[String] = js.undefined
  
  var color: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var padding: js.UndefOr[Double] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
  
  var stagger: js.UndefOr[Boolean] = js.undefined
  
  var `type`: patternSquares
}
object PatternSquaresDef_ {
  
  inline def apply(id: String): PatternSquaresDef_ = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("patternSquares")
    __obj.asInstanceOf[PatternSquaresDef_]
  }
  
  extension [Self <: PatternSquaresDef_](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
    
    inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setStagger(value: Boolean): Self = StObject.set(x, "stagger", value.asInstanceOf[js.Any])
    
    inline def setStaggerUndefined: Self = StObject.set(x, "stagger", js.undefined)
    
    inline def setType(value: patternSquares): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
