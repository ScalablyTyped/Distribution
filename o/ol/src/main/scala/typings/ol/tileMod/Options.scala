package typings.ol.tileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var transition: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(transition: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (transition != null) __obj.updateDynamic("transition")(transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

