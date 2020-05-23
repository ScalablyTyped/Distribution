package typings.officeUiFabricReact.labelTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILabelStyles extends js.Object {
  /**
    * Styles for the root element.
    */
  var root: IStyle
}

object ILabelStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): ILabelStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILabelStyles]
  }
}

