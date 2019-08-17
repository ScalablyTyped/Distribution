package typings.officeDashUiDashFabricDashReact.libComponentsStickyStickyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStickyState extends js.Object {
  var distanceFromTop: js.UndefOr[Double] = js.undefined
  var isStickyBottom: Boolean
  var isStickyTop: Boolean
}

object IStickyState {
  @scala.inline
  def apply(isStickyBottom: Boolean, isStickyTop: Boolean, distanceFromTop: Int | Double = null): IStickyState = {
    val __obj = js.Dynamic.literal(isStickyBottom = isStickyBottom, isStickyTop = isStickyTop)
    if (distanceFromTop != null) __obj.updateDynamic("distanceFromTop")(distanceFromTop.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStickyState]
  }
}

