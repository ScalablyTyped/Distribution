package typings.oracleOraclejet

import typings.oracleOraclejet.ojtreemapMod.ojTreemap.TooltipContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertAnonPreventDefaultDK[K, D] extends js.Object {
  def renderer(context: TooltipContext[K, D]): AnonInsert | AnonPreventDefault
}

object AnonContextRendererAnonInsertAnonPreventDefaultDK {
  @scala.inline
  def apply[K, D](renderer: TooltipContext[K, D] => AnonInsert | AnonPreventDefault): AnonContextRendererAnonInsertAnonPreventDefaultDK[K, D] = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertAnonPreventDefaultDK[K, D]]
  }
}

