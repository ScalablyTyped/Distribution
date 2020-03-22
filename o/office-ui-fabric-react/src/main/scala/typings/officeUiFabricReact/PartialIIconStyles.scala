package typings.officeUiFabricReact

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
  def apply(imageContainer: IStyle = null, root: IStyle = null): PartialIIconStyles = {
    val __obj = js.Dynamic.literal()
    if (imageContainer != null) __obj.updateDynamic("imageContainer")(imageContainer.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialIIconStyles]
  }
}

