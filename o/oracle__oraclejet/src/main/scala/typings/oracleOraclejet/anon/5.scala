package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojdiagramMod.ojDiagram.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `5`[K1, K2, D1, D2] extends StObject {
  
  def renderer(context: TooltipContext[K1, K2, D1, D2]): Insert | PreventDefault
}
object `5` {
  
  inline def apply[K1, K2, D1, D2](renderer: TooltipContext[K1, K2, D1, D2] => Insert | PreventDefault): `5`[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`5`[K1, K2, D1, D2]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `5`[?, ?, ?, ?], K1, K2, D1, D2] (val x: Self & (`5`[K1, K2, D1, D2])) extends AnyVal {
    
    inline def setRenderer(value: TooltipContext[K1, K2, D1, D2] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
