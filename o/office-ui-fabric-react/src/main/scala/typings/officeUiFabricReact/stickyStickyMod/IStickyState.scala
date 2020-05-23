package typings.officeUiFabricReact.stickyStickyMod

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
  def apply(isStickyBottom: Boolean, isStickyTop: Boolean, distanceFromTop: js.UndefOr[Double] = js.undefined): IStickyState = {
    val __obj = js.Dynamic.literal(isStickyBottom = isStickyBottom.asInstanceOf[js.Any], isStickyTop = isStickyTop.asInstanceOf[js.Any])
    if (!js.isUndefined(distanceFromTop)) __obj.updateDynamic("distanceFromTop")(distanceFromTop.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStickyState]
  }
}

