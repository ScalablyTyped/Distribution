package typings.oracleOraclejet

import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon11 extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object Anon11 {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): Anon11 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon11]
  }
}

