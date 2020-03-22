package typings.oracleOraclejet

import typings.oracleOraclejet.ojdiagramMod.ojDiagram.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon5[K1, K2, D1, D2] extends js.Object {
  def renderer(context: TooltipContext[K1, K2, D1, D2]): AnonInsert | AnonPreventDefault
}

object Anon5 {
  @scala.inline
  def apply[K1, K2, D1, D2](renderer: TooltipContext[K1, K2, D1, D2] => AnonInsert | AnonPreventDefault): Anon5[K1, K2, D1, D2] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[Anon5[K1, K2, D1, D2]]
  }
}

