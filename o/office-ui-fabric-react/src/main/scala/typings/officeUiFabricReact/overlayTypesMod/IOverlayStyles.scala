package typings.officeUiFabricReact.overlayTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOverlayStyles extends js.Object {
  /**
    * Style for the root element.
    */
  var root: IStyle
}

object IOverlayStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IOverlayStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOverlayStyles]
  }
}

