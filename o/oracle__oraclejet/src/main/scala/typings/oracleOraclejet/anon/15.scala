package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojnboxMod.ojNBox.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `15`[K] extends StObject {
  
  var renderer: (js.Function1[/* context */ TooltipContext[K], Insert | PreventDefault]) | Null
}
object `15` {
  
  inline def apply[K](): `15`[K] = {
    val __obj = js.Dynamic.literal(renderer = null)
    __obj.asInstanceOf[`15`[K]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `15`[?], K] (val x: Self & `15`[K]) extends AnyVal {
    
    inline def setRenderer(value: /* context */ TooltipContext[K] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererNull: Self = StObject.set(x, "renderer", null)
  }
}
