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
  def apply(check: IStyle = null, isDisabled: IStyle = null, root: IStyle = null): IDetailsRowCheckStyles = {
    val __obj = js.Dynamic.literal()
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (isDisabled != null) __obj.updateDynamic("isDisabled")(isDisabled.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDetailsRowCheckStyles]
  }
}

