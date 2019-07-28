package typings.ngxDashInfiniteDashScroll.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollerDistance extends js.Object {
  var down: js.UndefOr[Double] = js.undefined
  var up: js.UndefOr[Double] = js.undefined
}

object IScrollerDistance {
  @scala.inline
  def apply(down: Int | Double = null, up: Int | Double = null): IScrollerDistance = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollerDistance]
  }
}

