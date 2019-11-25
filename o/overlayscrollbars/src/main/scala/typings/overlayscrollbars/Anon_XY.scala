package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.ScrollBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_XY extends js.Object {
  var x: js.UndefOr[ScrollBehavior] = js.undefined
  var y: js.UndefOr[ScrollBehavior] = js.undefined
}

object Anon_XY {
  @scala.inline
  def apply(x: ScrollBehavior = null, y: ScrollBehavior = null): Anon_XY = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_XY]
  }
}

