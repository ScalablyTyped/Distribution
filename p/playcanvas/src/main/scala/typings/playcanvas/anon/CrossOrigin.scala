package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrossOrigin extends js.Object {
  var crossOrigin: js.UndefOr[Boolean] = js.undefined
}

object CrossOrigin {
  @scala.inline
  def apply(crossOrigin: js.UndefOr[Boolean] = js.undefined): CrossOrigin = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(crossOrigin)) __obj.updateDynamic("crossOrigin")(crossOrigin.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossOrigin]
  }
}

