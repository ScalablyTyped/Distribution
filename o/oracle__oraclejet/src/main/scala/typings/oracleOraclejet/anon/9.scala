package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `9`[K2, D2] extends StObject {
  
  def renderer(context: TooltipContext[K2, D2]): Insert | PreventDefault
}
object `9` {
  
  inline def apply[K2, D2](renderer: TooltipContext[K2, D2] => Insert | PreventDefault): `9`[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`9`[K2, D2]]
  }
  
  extension [Self <: `9`[?, ?], K2, D2](x: Self & (`9`[K2, D2])) {
    
    inline def setRenderer(value: TooltipContext[K2, D2] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
