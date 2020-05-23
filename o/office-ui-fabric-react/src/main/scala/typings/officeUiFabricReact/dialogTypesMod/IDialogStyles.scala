package typings.officeUiFabricReact.dialogTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDialogStyles extends js.Object {
  var main: IStyle
  /**
    * Style for the root element.
    */
  var root: IStyle
}

object IDialogStyles {
  @scala.inline
  def apply(main: js.UndefOr[Null | IStyle] = js.undefined, root: js.UndefOr[Null | IStyle] = js.undefined): IDialogStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(main)) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogStyles]
  }
}

