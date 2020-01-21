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
  def apply(root: IStyle = null): ILinkStyles = {
    val __obj = js.Dynamic.literal()
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILinkStyles]
  }
}

