package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `29`[K, D] extends StObject {
  
  def renderer(context: TooltipContext[K, D]): Insert | PreventDefault = js.native
}
object `29` {
  
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => Insert | PreventDefault): `29`[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`29`[K, D]]
  }
  
  @scala.inline
  implicit class `29MutableBuilder`[Self <: `29`[_, _], K, D] (val x: Self with (`29`[K, D])) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: TooltipContext[K, D] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
