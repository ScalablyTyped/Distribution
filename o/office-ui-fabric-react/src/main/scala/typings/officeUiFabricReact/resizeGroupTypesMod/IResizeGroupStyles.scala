package typings.officeUiFabricReact.resizeGroupTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResizeGroupStyles extends js.Object {
  /**
    * Style for the root element.
    */
  var root: IStyle
}

object IResizeGroupStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IResizeGroupStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeGroupStyles]
  }
}

