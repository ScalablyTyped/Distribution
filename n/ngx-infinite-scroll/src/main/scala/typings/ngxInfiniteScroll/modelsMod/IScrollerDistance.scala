package typings.ngxInfiniteScroll.modelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScrollerDistance extends js.Object {
  var down: js.UndefOr[Double] = js.undefined
  var up: js.UndefOr[Double] = js.undefined
}

object IScrollerDistance {
  @scala.inline
  def apply(down: js.UndefOr[Double] = js.undefined, up: js.UndefOr[Double] = js.undefined): IScrollerDistance = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(down)) __obj.updateDynamic("down")(down.get.asInstanceOf[js.Any])
    if (!js.isUndefined(up)) __obj.updateDynamic("up")(up.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScrollerDistance]
  }
}

