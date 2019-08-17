package typings.officeDashUiDashFabricDashReact.libComponentsIconIconDotTypesMod

import typings.atUifabricMergeDashStyles.libIStyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIconStyles extends js.Object {
  /**
    * Deprecated. Use `root`.
    * @deprecated Use `root`.
    */
  var imageContainer: js.UndefOr[IStyle] = js.undefined
  var root: js.UndefOr[IStyle] = js.undefined
}

object IIconStyles {
  @scala.inline
  def apply(imageContainer: IStyle = null, root: IStyle = null): IIconStyles = {
    val __obj = js.Dynamic.literal()
    if (imageContainer != null) __obj.updateDynamic("imageContainer")(imageContainer.asInstanceOf[js.Any])
    if (root != null) __obj.updateDynamic("root")(root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconStyles]
  }
}

