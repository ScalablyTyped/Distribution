package typings.nextServer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Amphtml extends js.Object {
  var amphtml: js.UndefOr[Boolean] = js.undefined
  var dataOnly: js.UndefOr[Boolean] = js.undefined
  var hasAmp: js.UndefOr[Boolean] = js.undefined
}

object Amphtml {
  @scala.inline
  def apply(
    amphtml: js.UndefOr[Boolean] = js.undefined,
    dataOnly: js.UndefOr[Boolean] = js.undefined,
    hasAmp: js.UndefOr[Boolean] = js.undefined
  ): Amphtml = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(amphtml)) __obj.updateDynamic("amphtml")(amphtml.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dataOnly)) __obj.updateDynamic("dataOnly")(dataOnly.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hasAmp)) __obj.updateDynamic("hasAmp")(hasAmp.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amphtml]
  }
}

