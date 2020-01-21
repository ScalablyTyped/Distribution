package typings.oracleOraclejet

import typings.oracleOraclejet.ojtagcloudMod.ojTagCloud.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K] extends js.Object {
  def renderer(context: TooltipContext[K]): AnonInsert | AnonPreventDefault
}

object AnonContextRendererAnonInsertAnonPreventDefaultKTooltipContext {
  @scala.inline
  def apply[K](renderer: TooltipContext[K] => AnonInsert | AnonPreventDefault): AnonContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertAnonPreventDefaultKTooltipContext[K]]
  }
}

