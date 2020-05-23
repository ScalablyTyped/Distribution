package typings.overlayscrollbars.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynHeight extends js.Object {
  var dynHeight: js.UndefOr[Boolean] = js.undefined
  var dynWidth: js.UndefOr[Boolean] = js.undefined
  var inheritedAttrs: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}

object DynHeight {
  @scala.inline
  def apply(
    dynHeight: js.UndefOr[Boolean] = js.undefined,
    dynWidth: js.UndefOr[Boolean] = js.undefined,
    inheritedAttrs: js.UndefOr[Null | String | js.Array[String]] = js.undefined
  ): DynHeight = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynHeight)) __obj.updateDynamic("dynHeight")(dynHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dynWidth)) __obj.updateDynamic("dynWidth")(dynWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inheritedAttrs)) __obj.updateDynamic("inheritedAttrs")(inheritedAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynHeight]
  }
}

