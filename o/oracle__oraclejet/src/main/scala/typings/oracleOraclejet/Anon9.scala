package typings.oracleOraclejet

import typings.oracleOraclejet.ojgaugeMod.ojRatingGauge.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon9 extends js.Object {
  def renderer(context: TooltipContext): AnonInsert | AnonPreventDefault
}

object Anon9 {
  @scala.inline
  def apply(renderer: TooltipContext => AnonInsert | AnonPreventDefault): Anon9 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon9]
  }
}

