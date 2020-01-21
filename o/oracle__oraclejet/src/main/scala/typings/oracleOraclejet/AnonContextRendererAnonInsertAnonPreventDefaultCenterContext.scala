package typings.oracleOraclejet

import typings.oracleOraclejet.ojgaugeMod.ojStatusMeterGauge.CenterContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContextRendererAnonInsertAnonPreventDefaultCenterContext extends js.Object {
  def renderer(context: CenterContext): AnonInsert | AnonPreventDefault
}

object AnonContextRendererAnonInsertAnonPreventDefaultCenterContext {
  @scala.inline
  def apply(renderer: CenterContext => AnonInsert | AnonPreventDefault): AnonContextRendererAnonInsertAnonPreventDefaultCenterContext = {
    val __obj = js.Dynamic.literal(renderer = js.Any.fromFunction1(renderer))
  
    __obj.asInstanceOf[AnonContextRendererAnonInsertAnonPreventDefaultCenterContext]
  }
}

