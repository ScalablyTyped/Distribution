package typings.officeUiFabricReact.groupSpacerTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGroupSpacerStyles extends js.Object {
  var root: IStyle
}

object IGroupSpacerStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IGroupSpacerStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGroupSpacerStyles]
  }
}

