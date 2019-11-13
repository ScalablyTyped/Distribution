package typings.nextDashServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Amphtml extends js.Object {
  var amphtml: js.UndefOr[Boolean] = js.undefined
  var dataOnly: js.UndefOr[Boolean] = js.undefined
  var hasAmp: js.UndefOr[Boolean] = js.undefined
}

object Anon_Amphtml {
  @scala.inline
  def apply(
    amphtml: js.UndefOr[Boolean] = js.undefined,
    dataOnly: js.UndefOr[Boolean] = js.undefined,
    hasAmp: js.UndefOr[Boolean] = js.undefined
  ): Anon_Amphtml = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amphtml)) __obj.updateDynamic("amphtml")(amphtml)
    if (!js.isUndefined(dataOnly)) __obj.updateDynamic("dataOnly")(dataOnly)
    if (!js.isUndefined(hasAmp)) __obj.updateDynamic("hasAmp")(hasAmp)
    __obj.asInstanceOf[Anon_Amphtml]
  }
}

