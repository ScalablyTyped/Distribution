package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojthematicmapMod.ojThematicMap.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `27`[K1, K2, K3, D1, D2, D3] extends StObject {
  
  def renderer(context: TooltipContext[K1, K2, K3, D1, D2, D3]): Insert | PreventDefault = js.native
}
object `27` {
  
  @scala.inline
  def apply[K1, K2, K3, D1, D2, D3](renderer: TooltipContext[K1, K2, K3, D1, D2, D3] => Insert | PreventDefault): `27`[K1, K2, K3, D1, D2, D3] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`27`[K1, K2, K3, D1, D2, D3]]
  }
  
  @scala.inline
  implicit class `27MutableBuilder`[Self <: `27`[_, _, _, _, _, _], K1, K2, K3, D1, D2, D3] (val x: Self with (`27`[K1, K2, K3, D1, D2, D3])) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: TooltipContext[K1, K2, K3, D1, D2, D3] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
