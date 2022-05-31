package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojsunburstMod.ojSunburst.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `19`[K, D] extends StObject {
  
  def renderer(context: TooltipContext[K, D]): Insert | PreventDefault
}
object `19` {
  
  inline def apply[K, D](renderer: TooltipContext[K, D] => Insert | PreventDefault): `19`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`19`[K, D]]
  }
  
  extension [Self <: `19`[?, ?], K, D](x: Self & (`19`[K, D])) {
    
    inline def setRenderer(value: TooltipContext[K, D] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
