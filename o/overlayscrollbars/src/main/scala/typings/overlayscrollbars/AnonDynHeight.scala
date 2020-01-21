package typings.overlayscrollbars

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDynHeight extends js.Object {
  var dynHeight: js.UndefOr[Boolean] = js.undefined
  var dynWidth: js.UndefOr[Boolean] = js.undefined
  var inheritedAttrs: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}

object AnonDynHeight {
  @scala.inline
  def apply(
    dynHeight: js.UndefOr[Boolean] = js.undefined,
    dynWidth: js.UndefOr[Boolean] = js.undefined,
    inheritedAttrs: String | js.Array[String] = null
  ): AnonDynHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynHeight)) __obj.updateDynamic("dynHeight")(dynHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(dynWidth)) __obj.updateDynamic("dynWidth")(dynWidth.asInstanceOf[js.Any])
    if (inheritedAttrs != null) __obj.updateDynamic("inheritedAttrs")(inheritedAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDynHeight]
  }
}

