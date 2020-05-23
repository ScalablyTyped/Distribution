package typings.officeUiFabricReact.anon

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<office-ui-fabric-react.office-ui-fabric-react/lib/components/Icon/Icon.types.IIconStyles> */
trait PartialIIconStyles extends js.Object {
  var imageContainer: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
}

object PartialIIconStyles {
  @scala.inline
  def apply(
    imageContainer: js.UndefOr[Null | IStyle] = js.undefined,
    root: js.UndefOr[Null | IStyle] = js.undefined
  ): PartialIIconStyles = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(imageContainer)) __obj.updateDynamic("imageContainer")(imageContainer.asInstanceOf[js.Any])
    if (!js.isUndefined(root)) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIIconStyles]
  }
}

