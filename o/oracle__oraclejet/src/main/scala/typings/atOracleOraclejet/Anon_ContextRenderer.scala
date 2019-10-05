package typings.atOracleOraclejet

import typings.atOracleOraclejet.ojchartMod.ojSparkChart.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContextRenderer extends js.Object {
  var renderer: (js.Function1[/* context */ TooltipContext, Anon_Insert | Anon_PreventDefault]) | Null
}

object Anon_ContextRenderer {
  @scala.inline
  def apply(renderer: /* context */ TooltipContext => Anon_Insert | Anon_PreventDefault = null): Anon_ContextRenderer = {
    val __obj = js.Dynamic.literal()
    if (renderer != null) __obj.updateDynamic("renderer")(js.Any.fromFunction1(renderer))
    __obj.asInstanceOf[Anon_ContextRenderer]
  }
}

