package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojpictochartMod.ojPictoChart.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `16`[K] extends StObject {
  
  var renderer: (js.Function1[/* context */ TooltipContext[K], Insert | PreventDefault]) | Null = js.native
}
object `16` {
  
  @scala.inline
  def apply[K](): `16`[K] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`16`[K]]
  }
  
  @scala.inline
  implicit class `16MutableBuilder`[Self <: `16`[_], K] (val x: Self with `16`[K]) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: /* context */ TooltipContext[K] => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRendererNull: Self = StObject.set(x, "renderer", null)
  }
}
