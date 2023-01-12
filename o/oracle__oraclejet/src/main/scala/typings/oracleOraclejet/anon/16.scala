package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `16`[K] extends StObject {
  
  var renderer: (js.Function1[/* context */ TooltipContext[K], Insert | PreventDefault]) | Null
}
object `16` {
  
  inline def apply[K](): `16`[K] = {
    val __obj = js.Dynamic.literal(renderer = null)
    __obj.asInstanceOf[`16`[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `16`[?], K] (val x: Self & `16`[K]) extends AnyVal {
    
    inline def setRenderer(value: /* context */ TooltipContext[K] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
  }
}
