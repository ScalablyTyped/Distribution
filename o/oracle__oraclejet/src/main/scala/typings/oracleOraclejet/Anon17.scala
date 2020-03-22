package typings.oracleOraclejet

import typings.oracleOraclejet.ojsunburstMod.ojSunburst.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon17[K, D] extends js.Object {
  def renderer(context: TooltipContext[K, D]): AnonInsert | AnonPreventDefault
}

object Anon17 {
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => AnonInsert | AnonPreventDefault): Anon17[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon17[K, D]]
  }
}

