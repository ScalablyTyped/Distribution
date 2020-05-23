package typings.officeUiFabricReact.detailsRowCheckTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDetailsRowCheckStyles extends js.Object {
  /** @deprecated Use `root` (they're applied to the same element) */
  var check: IStyle
  var isDisabled: IStyle
  var root: IStyle
}

object IDetailsRowCheckStyles {
  @scala.inline
  def apply(
    check: js.UndefOr[Null | IStyle] = js.undefined,
    isDisabled: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): IDetailsRowCheckStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(check)) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisabled)) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowCheckStyles]
  }
}

