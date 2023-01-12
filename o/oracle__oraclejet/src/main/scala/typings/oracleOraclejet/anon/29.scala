package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `29`[K, D] extends StObject {
  
  def renderer(context: TooltipContext[K, D]): Insert | PreventDefault
}
object `29` {
  
  inline def apply[K, D](renderer: TooltipContext[K, D] => Insert | PreventDefault): `29`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`29`[K, D]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: `29`[?, ?], K, D] (val x: Self & (`29`[K, D])) extends AnyVal {
    
    inline def setRenderer(value: TooltipContext[K, D] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
