package typings
package ngxDashInfiniteDashScrollLib.srcModelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollerDistance extends js.Object {
  var down: js.UndefOr[scala.Double] = js.undefined
  var up: js.UndefOr[scala.Double] = js.undefined
}

object IScrollerDistance {
  @scala.inline
  def apply(down: scala.Int | scala.Double = null, up: scala.Int | scala.Double = null): IScrollerDistance = {
    val __obj = js.Dynamic.literal()
    if (down != null) __obj.updateDynamic("down")(down.asInstanceOf[js.Any])
    if (up != null) __obj.updateDynamic("up")(up.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollerDistance]
  }
}

