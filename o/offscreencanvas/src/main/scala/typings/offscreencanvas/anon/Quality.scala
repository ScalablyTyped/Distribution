package typings.offscreencanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quality extends js.Object {
  var quality: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Quality {
  @scala.inline
  def apply(quality: js.UndefOr[Double] = js.undefined, `type`: String = null): Quality = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Quality]
  }
}

