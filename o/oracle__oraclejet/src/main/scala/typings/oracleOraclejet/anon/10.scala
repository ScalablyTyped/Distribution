package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojgaugeMod.ojLedGauge.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `10` extends StObject {
  
  def renderer(context: TooltipContext): Insert | PreventDefault = js.native
}
object `10` {
  
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `10` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`10`]
  }
  
  @scala.inline
  implicit class `10MutableBuilder`[Self <: `10`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: TooltipContext => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
