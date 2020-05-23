package typings.ol.olTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var transition: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(transition: js.UndefOr[Double] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(transition)) __obj.updateDynamic("transition")(transition.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

