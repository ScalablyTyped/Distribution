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
  def apply(main: IStyle = null, root: IStyle = null): IDialogStyles = {
    val __obj = js.Dynamic.literal()
    if (main != null) __obj.updateDynamic("main")(main.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDialogStyles]
  }
}

