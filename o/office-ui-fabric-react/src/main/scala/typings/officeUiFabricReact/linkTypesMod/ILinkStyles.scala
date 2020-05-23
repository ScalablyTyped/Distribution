package typings.officeUiFabricReact.linkTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILinkStyles extends js.Object {
  var root: IStyle
}

object ILinkStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): ILinkStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkStyles]
  }
}

