package typings.officeUiFabricReact.groupFooterTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupFooterStyles extends js.Object {
  var root: IStyle
}

object IGroupFooterStyles {
  @scala.inline
  def apply(root: IStyle = null): IGroupFooterStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupFooterStyles]
  }
}

