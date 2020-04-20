package typings.oracleOraclejet

import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.CenterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon10 extends js.Object {
  def renderer(context: CenterContext): AnonInsert | AnonPreventDefault
}

object Anon10 {
  @scala.inline
  def apply(renderer: CenterContext => AnonInsert | AnonPreventDefault): Anon10 = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon10]
  }
}

