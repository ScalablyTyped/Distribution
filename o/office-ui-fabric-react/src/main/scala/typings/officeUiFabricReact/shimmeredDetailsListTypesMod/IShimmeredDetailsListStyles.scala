package typings.officeUiFabricReact.shimmeredDetailsListTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShimmeredDetailsListStyles extends js.Object {
  /**
    * Represents styles passed to the `List` component for creating a fade-out to the bottom overlay.
    */
  var root: IStyle
}

object IShimmeredDetailsListStyles {
  @scala.inline
  def apply(root: js.UndefOr[Null | IStyle] = js.undefined): IShimmeredDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShimmeredDetailsListStyles]
  }
}

