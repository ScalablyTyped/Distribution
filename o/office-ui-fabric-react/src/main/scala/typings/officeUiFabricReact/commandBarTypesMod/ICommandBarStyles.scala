package typings.officeUiFabricReact.commandBarTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICommandBarStyles extends js.Object {
  var primarySet: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
  var secondarySet: js.UndefOr[IStyle] = js.undefined
}

object ICommandBarStyles {
  @scala.inline
  def apply(
    primarySet: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined,
    secondarySet: js.UndefOr[Null | IStyle] = js.undefined
  ): ICommandBarStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(primarySet)) __obj.updateDynamic("primarySet")(primarySet.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    if (!js.isUndefined(secondarySet)) __obj.updateDynamic("secondarySet")(secondarySet.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommandBarStyles]
  }
}

