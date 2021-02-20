package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.CenterContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait `12` extends StObject {
  
  def renderer(context: CenterContext): Insert | PreventDefault = js.native
}
object `12` {
  
  @scala.inline
  def apply(renderer: CenterContext => Insert | PreventDefault): `12` = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[`12`]
  }
  
  @scala.inline
  implicit class `12MutableBuilder`[Self <: `12`] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRenderer(value: CenterContext => Insert | PreventDefault): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
  }
}
