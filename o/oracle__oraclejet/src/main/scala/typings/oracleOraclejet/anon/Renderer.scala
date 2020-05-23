package typings.oracleOraclejet.anon

import typings.oracleOraclejet.ojchartMod.ojChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Renderer extends js.Object {
  def renderer(context: TooltipContext): Insert | PreventDefault
}

object Renderer {
  @scala.inline
  def apply(renderer: TooltipContext => Insert | PreventDefault): Renderer = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Renderer]
  }
}

