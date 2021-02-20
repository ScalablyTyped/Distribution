package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `11` extends StObject {
  
  def renderer(context: TooltipContext): Insert | PreventDefault = js.native
}
object `11` {
  
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): `11` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`11`]
  }
  
  @scala.inline
  implicit class `11MutableBuilder`[Self <: `11`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: TooltipContext => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
