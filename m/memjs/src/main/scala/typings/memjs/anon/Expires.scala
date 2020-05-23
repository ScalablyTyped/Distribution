package typings.memjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expires extends js.Object {
  var expires: js.UndefOr[Double] = js.undefined
}

object Expires {
  @scala.inline
  def apply(expires: js.UndefOr[Double] = js.undefined): Expires = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(expires)) __obj.updateDynamic("expires")(expires.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expires]
  }
}

