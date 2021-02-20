package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojganttMod.ojGantt.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `9`[K2, D2] extends StObject {
  
  def renderer(context: TooltipContext[K2, D2]): Insert | PreventDefault = js.native
}
object `9` {
  
  @scala.inline
  def apply[K2, D2](renderer: TooltipContext[K2, D2] => Insert | PreventDefault): `9`[K2, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`9`[K2, D2]]
  }
  
  @scala.inline
  implicit class `9MutableBuilder`[Self <: `9`[_, _], K2, D2] (val x: Self with (`9`[K2, D2])) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: TooltipContext[K2, D2] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
