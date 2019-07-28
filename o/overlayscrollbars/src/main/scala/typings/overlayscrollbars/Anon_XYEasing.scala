package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.Easing
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XYEasing extends js.Object {
  var x: js.UndefOr[Easing] = js.undefined
  var y: js.UndefOr[Easing] = js.undefined
}

object Anon_XYEasing {
  @scala.inline
  def apply(x: Easing = null, y: Easing = null): Anon_XYEasing = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XYEasing]
  }
}

