package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojchartMod.ojSparkChart.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var renderer: (js.Function1[/* context */ TooltipContext, Insert | PreventDefault]) | Null
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal(renderer = null)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setRenderer(value: /* context */ TooltipContext => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
  }
}
